package com.ruoyi.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.HttpResult;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.*;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Http请求工具
 * @author fds
 */
public class HttpUtil {
    public static final String URL =  "https://weixin.junction.com.cn/wx-public/redpack/sendRedpack";

    public static CloseableHttpClient getHttpClient() {
        try {
            SSLContextBuilder builder = new SSLContextBuilder();
            builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            //不进行主机名验证
            SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(builder.build(),
                    NoopHostnameVerifier.INSTANCE);
            Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create()
                    .register("http", new PlainConnectionSocketFactory())
                    .register("https", sslConnectionSocketFactory)
                    .build();

            PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
            cm.setMaxTotal(100);

            CloseableHttpClient httpclient = HttpClients.custom()
                    .setSSLSocketFactory(sslConnectionSocketFactory)
                    .setDefaultCookieStore(new BasicCookieStore())
                    .setConnectionManager(cm).build();

            return httpclient;
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        return HttpClients.createDefault();
    }

    /**
     * 生成需要进行用户校验的连接
     * @param host
     * @param port
     * @param username
     * @param password
     * @return
     */
    public static CloseableHttpClient getAuthHttpClient(String host, int port, String username, String password) {
        try {
            SSLContextBuilder builder = new SSLContextBuilder();
            builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            //不进行主机名验证
            SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(builder.build(),
                    NoopHostnameVerifier.INSTANCE);
            Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create()
                    .register("http", new PlainConnectionSocketFactory())
                    .register("https", sslConnectionSocketFactory)
                    .build();

            PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
            cm.setMaxTotal(100);
            //-----auth  start---
            CredentialsProvider credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(
                    new AuthScope(host, port),
                    new UsernamePasswordCredentials(username, password));
            //-----auth end----
            CloseableHttpClient httpclient = HttpClients.custom()
                    .setSSLSocketFactory(sslConnectionSocketFactory)
                    .setDefaultCookieStore(new BasicCookieStore())
                    .setDefaultCredentialsProvider(credsProvider)//auth
                    .setConnectionManager(cm).build();
            /*
            * CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope("192.168.1.1", 80),
                new UsernamePasswordCredentials("username", "password"));
        CloseableHttpClient httpclient = HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider)
                .build();
                * */
            return httpclient;
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        return HttpClients.createDefault();
    }

    public static HttpClientContext getHttpClientContext(String host, int port, String username, String password){
        HttpClientContext context = null;
        //1
        CredentialsProvider credsProvider = (CredentialsProvider) new BasicCredentialsProvider();
        //2
        credsProvider.setCredentials(
                new AuthScope(host, port),
                new UsernamePasswordCredentials(username, password));

        // Create AuthCache instance
        AuthCache authCache = new BasicAuthCache();
        // Generate BASIC scheme object and add it to the local auth cache
        BasicScheme basicAuth = new BasicScheme();

        HttpHost targetHost = new HttpHost(host, port, "http");
        authCache.put(targetHost, basicAuth);
        context = HttpClientContext.create();
        context.setCredentialsProvider(credsProvider);
        context.setAuthCache(authCache);
        return context;
    }



    /**
     * post请求
     * @param client CloseableHttpClient
     * @param url url
     * @param param 请求参数
     * @return HttpResult
     * @throws IOException
     */
    public static HttpResult doPost(CloseableHttpClient client, String url, Map<String, String> headers, Map<String, Object> param) throws IOException {
        // 创建POST请求
        HttpPost post = new HttpPost(url);
        JSONObject json = new JSONObject();
        for (Map.Entry<String, Object> map : param.entrySet()) {
            json.put(map.getKey(),map.getValue());
        }
        String requestParam = json.toString();
        StringEntity entity = new StringEntity(requestParam, ContentType.APPLICATION_JSON);
        post.setEntity(entity);
        if(headers != null && headers.size() > 0){
            for(Map.Entry<String, String> m : headers.entrySet()){
//                System.out.println("header==>" + m.getKey() + "=" + m.getValue());
                post.addHeader(m.getKey(), m.getValue());
            }
        }
        /*entity = new StringEntity(json, "UTF-8");
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");// 设置为 json数据
			post.setEntity(entity);*/
        CloseableHttpResponse response = client.execute(post);
        int statusCode = response.getStatusLine().getStatusCode();
        HttpEntity result = response.getEntity();
        return new HttpResult(statusCode, EntityUtils.toString(result, "UTF-8"));
    }

    /**
     * 以json方式提交数据
     * @param client
     * @param url
     * @param headers
     * @param jsonData
     * @return
     * @throws IOException
     */
    public static HttpResult postJson(CloseableHttpClient client, String url, Map<String, String> headers,
                                      String jsonData) throws IOException {
        // 创建POST请求
        HttpPost post = new HttpPost(url);
        if(headers != null && headers.size() > 0){
            for(Map.Entry<String, String> m : headers.entrySet()){
                post.addHeader(m.getKey(), m.getValue());
            }
        }

        StringEntity entity = new StringEntity(jsonData, ContentType.APPLICATION_JSON);
        post.setEntity(entity);
        CloseableHttpResponse response = client.execute(post);
        int statusCode = response.getStatusLine().getStatusCode();
        HttpEntity result = response.getEntity();
        return new HttpResult(statusCode, EntityUtils.toString(result, "UTF-8"));
    }

    /**
     * 以Post文件提交文件
     * @param client
     * @param url
     * @param headers
     * @param fileFieldName 文件对象的参数名
     * @param filePath
     * @return
     * @throws IOException
     */
    public static HttpResult postFile(CloseableHttpClient client, String url, Map<String, String> headers,
                                      String fileFieldName, String filePath) throws IOException {
        // 创建POST请求
        HttpPost post = new HttpPost(url);
        if(headers != null && headers.size() > 0){
            for(Map.Entry<String, String> m : headers.entrySet()){
                post.addHeader(m.getKey(), m.getValue());
            }
        }
        FileBody fileBody = new FileBody(new File(filePath), ContentType.DEFAULT_BINARY);
        HttpEntity entity = MultipartEntityBuilder.create()//.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
                .addPart(fileFieldName, fileBody)//相当于<input type="file" name="media"/>
                .build();

        post.setEntity(entity);
        CloseableHttpResponse response = client.execute(post);
        int statusCode = response.getStatusLine().getStatusCode();
        HttpEntity result = response.getEntity();
        return new HttpResult(statusCode, EntityUtils.toString(result, "UTF-8"));
    }

    public static HttpResult postByNameValuePair(CloseableHttpClient client,
                                                 String url,
                                                 List<BasicNameValuePair>formParams,
                                                 Map<String, String> headers,
                                                 String methos) {
        int statusCode = 500;
        String result = "";

        System.out.println("[postByNameValuePair.url]\t" + url);
        HttpEntity entity = null;
        HttpEntity responseEntity = null;
        HttpPost request = null;
        if(StringUtils.isEmpty(methos)) methos = "GET";
        if("GET".equalsIgnoreCase(methos)){
            HttpGet hgRequest = null;
            try {
                hgRequest = new HttpGet(url);
                if(headers != null && headers.size() > 0){
                    for(Map.Entry<String, String> m : headers.entrySet()){
                        System.out.println("header==>" + m.getKey() + "=" + m.getValue());
                        hgRequest.addHeader(m.getKey(), m.getValue());
                    }
                }

                HttpResponse response = client.execute(hgRequest);
                statusCode = response.getStatusLine().getStatusCode();
                responseEntity = response.getEntity();
                result = EntityUtils.toString(responseEntity, "UTF-8");//EntityUtils.toString(responseEntity);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                hgRequest.releaseConnection();
                EntityUtils.consumeQuietly(responseEntity);
            }
        }else{
            try {
                entity = new UrlEncodedFormEntity(formParams, "UTF-8");
                request = new HttpPost(url);
                request.setEntity(entity);
                if(headers != null && headers.size() > 0){
                    for(Map.Entry<String, String> m : headers.entrySet()){
                        request.addHeader(m.getKey(), m.getValue());
                    }
                }
                HttpResponse response = client.execute(request);
                statusCode = response.getStatusLine().getStatusCode();
                responseEntity = response.getEntity();
                result = EntityUtils.toString(responseEntity, "UTF-8");//EntityUtils.toString(responseEntity);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                request.releaseConnection();
                EntityUtils.consumeQuietly(responseEntity);
            }
        }

        return new HttpResult(statusCode,result);
    }

    public static HttpResult post(CloseableHttpClient client, String url, Map<String, Object> requestParams) {
        List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
        if(requestParams != null)
            for(Map.Entry<String, Object> m : requestParams.entrySet()){
                formParams.add(new BasicNameValuePair(m.getKey(), (String)m.getValue()));
            }

        return postByNameValuePair(client, url, formParams, null, "POST");

    }
    public static HttpResult postByStringMap(CloseableHttpClient client, String url, Map<String, String> requestParams,
                                             Map<String, String> headers, String methos) {
        List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
        if(requestParams != null && requestParams.size() > 0){
            if("GET".equals(methos)){
                if(url.indexOf("?") == -1) url = url + "?";
                for(Map.Entry<String, String> m : requestParams.entrySet()){
                    url = url + m.getKey() + "=" + m.getValue() + "&";
                }

            }else{
                for(Map.Entry<String, String> m : requestParams.entrySet()){
                    formParams.add(new BasicNameValuePair(m.getKey(), m.getValue()));
                }
            }

        }

        return postByNameValuePair(client, url, formParams, headers, methos);
    }

    /**
     * get请求
     * @param client CloseableHttpClient
     * @param url url
     * @return HttpResult
     * @throws IOException
     */
    public static HttpResult doGet(CloseableHttpClient client, String url) throws IOException {
        //创建GET请求
        HttpGet get = new HttpGet(url);

        CloseableHttpResponse response = client.execute(get);//client.execute(get);
        int statusCode = response.getStatusLine().getStatusCode();
        HttpEntity result = response.getEntity();
        return new HttpResult(statusCode, EntityUtils.toString(result, "UTF-8"));
    }
    public static HttpResult doGet(CloseableHttpClient client, String url, Map<String, String>headers) throws IOException {
        //创建GET请求
        HttpGet get = new HttpGet(url);
        if(headers != null && headers.size() > 0){
            for(Map.Entry<String, String> m : headers.entrySet()){
                get.addHeader(m.getKey(), m.getValue());
            }
        }


        CloseableHttpResponse response = client.execute(get);//client.execute(get);
        int statusCode = response.getStatusLine().getStatusCode();
        HttpEntity result = response.getEntity();
        return new HttpResult(statusCode, EntityUtils.toString(result, "UTF-8"));
    }
//
//
//    CredentialsProvider credsProvider = new BasicCredentialsProvider();
//        credsProvider.setCredentials(
//                new AuthScope("112.13.167.86", 9002),
//                new UsernamePasswordCredentials("hupo", "hupo123"));
//    CloseableHttpClient httpclient = HttpClients.custom()
//            .setDefaultCredentialsProvider(credsProvider)
//            .build();
//        try {
//        HttpGet httpget = new HttpGet(url);
//        System.out.println("Executing request " + httpget.getRequestLine());
//        CloseableHttpResponse response = httpclient.execute(httpget);
//        System.out.println("----------------------------------------");
//        System.out.println(response.getStatusLine());
//        EntityUtils.consume(response.getEntity());
//    } catch(Exception e) {
//    }

    public static void main(String[] args) {
        String url = "http://112.13.167.86:9002/api/v1/camera/all";
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope("112.13.167.86", 9002),
                new UsernamePasswordCredentials("hupo", "hupo123"));
        CloseableHttpClient httpclient = HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider)
                .build();
        try {
            HttpGet httpget = new HttpGet(url);
            System.out.println("Executing request " + httpget.getRequestLine());
            CloseableHttpResponse response = httpclient.execute(httpget);
                System.out.println("----------------------------------------");
                System.out.println(response.getStatusLine());
                EntityUtils.consume(response.getEntity());
        } catch(Exception e) {
        }
    }
}
