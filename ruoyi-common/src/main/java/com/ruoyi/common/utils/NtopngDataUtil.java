package com.ruoyi.common.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 读取ntopng数据并且入库
 */
public class NtopngDataUtil {
    private static NtopngDataUtil ntopng = null;
    private InfluxDBUtil influx = null;

    private NtopngDataUtil(){

    }

    public static NtopngDataUtil getInstance(){
        if(ntopng == null){
            ntopng = new NtopngDataUtil();
        }
        return ntopng;
    }

    public void openDb(){
        if(influx == null){
            System.out.println("连接influx数据库");

            influx = new InfluxDBUtil("admin", "admin", "http://112.13.167.87:9004", "ngtest", "");

        }
    }
    public void closeDb(){
        if(influx != null){
            influx.close();
            influx = null;
        }
    }

    /**
     * 获取系统接口数据
     */
    public void get_interface_data(){
        try {
            JSONObject json = NtopngUtil.ntopng_interface_data("0");
            json = json.getJSONObject("rsp");
            Map<String, Object> fields = new HashMap<String, Object>();
            fields.put("ifid", json.getIntValue("ifid"));
            fields.put("ifname", json.getString("ifname"));
            fields.put("uptime", json.getString("uptime"));
            fields.put("num_flows", json.getIntValue("num_flows"));
            fields.put("num_devices", json.getIntValue("num_devices"));
            fields.put("num_live_captures", json.getIntValue("num_live_captures"));
            fields.put("num_hosts", json.getIntValue("num_hosts"));
            fields.put("dropped_alerts", json.getIntValue("dropped_alerts"));
            fields.put("epoch", json.getIntValue("epoch"));
            fields.put("alerted_flows_notice", json.getIntValue("alerted_flows_notice"));
            fields.put("alerted_flows_warning", json.getIntValue("alerted_flows_warning"));
            fields.put("speed", json.getIntValue("speed"));
            fields.put("packets", json.getIntValue("packets"));
            fields.put("bytes_download", json.getIntValue("bytes_download"));
            fields.put("bytes_upload", json.getIntValue("bytes_upload"));
            fields.put("packets_download", json.getIntValue("packets_download"));
            fields.put("packets_upload", json.getIntValue("packets_upload"));
            fields.put("local2remote", json.getIntValue("local2remote"));
            fields.put("remote2local", json.getIntValue("remote2local"));
            fields.put("throughput_bps", json.getDoubleValue("throughput_bps"));
            fields.put("throughput_pps", json.getDoubleValue("throughput_pps"));
            fields.put("drops", json.getIntValue("drops"));
            fields.put("flows_pctg", json.getIntValue("flows_pctg"));
            fields.put("hosts_pctg", json.getIntValue("hosts_pctg"));
            fields.put("periodic_stats_update_frequency_secs", json.getIntValue("periodic_stats_update_frequency_secs"));
            fields.put("bytes", json.getIntValue("bytes"));
            fields.put("remote_bps", json.getIntValue("remote_bps"));
            fields.put("alerted_flows", json.getIntValue("alerted_flows"));
            fields.put("engaged_alerts", json.getIntValue("engaged_alerts"));
            JSONObject system_host_stats = json.getJSONObject("system_host_stats");
            JSONObject tcpPacketStats = json.getJSONObject("tcpPacketStats");
            fields.put("tcp_packet_out_of_order", tcpPacketStats.getIntValue("out_of_order"));
            fields.put("tcp_packet_lost", tcpPacketStats.getIntValue("lost"));
            fields.put("tcp_packet_retransmissions", tcpPacketStats.getIntValue("retransmissions"));
            influx.insert("interface_data", influx.getTags(), fields, System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            fields.clear();
            fields.put("ifid", json.getIntValue("ifid"));
            fields.put("ifname", json.getString("ifname"));
            fields.put("uptime", json.getString("uptime"));
            fields.put("alerts_queries", system_host_stats.getIntValue("alerts_queries"));
            fields.put("mem_used", system_host_stats.getIntValue("mem_used"));
            fields.put("mem_ntopng_resident", system_host_stats.getIntValue("mem_ntopng_resident"));
            fields.put("mem_cached", system_host_stats.getIntValue("mem_cached"));
            fields.put("dropped_alerts", system_host_stats.getIntValue("dropped_alerts"));
            fields.put("mem_buffers", system_host_stats.getIntValue("mem_buffers"));
            fields.put("mem_ntopng_virtual", system_host_stats.getIntValue("mem_ntopng_virtual"));
            fields.put("mem_total", system_host_stats.getIntValue("mem_total"));
            fields.put("mem_shmem", system_host_stats.getIntValue("mem_shmem"));
            fields.put("mem_free", system_host_stats.getIntValue("mem_free"));
            fields.put("mem_sreclaimable", system_host_stats.getIntValue("mem_sreclaimable"));
            fields.put("written_alerts", system_host_stats.getIntValue("written_alerts"));
            fields.put("engaged_alerts", system_host_stats.getIntValue("engaged_alerts"));
            fields.put("cpu_load", system_host_stats.getIntValue("cpu_load"));
            influx.insert("system_host_stats", influx.getTags(), fields, System.currentTimeMillis(), TimeUnit.MILLISECONDS);



        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取 7层 协议数据
     */
    public void get_interface_l7_stats(){
        try{
            JSONObject json = NtopngUtil.ntopng_interface_stats_l7("0", "count");
            JSONArray rsp = json.getJSONArray("rsp");
            Map<String, Object> fields = new HashMap<String, Object>();
            if(rsp != null){
                for(int i=0; i<rsp.size(); i++){
                    JSONObject item = rsp.getJSONObject(i);
                    fields.clear();
                    fields.put("ifid", "0");
                    fields.put("label", item.getString("label"));
                    fields.put("value", item.getIntValue("value"));
                    fields.put("url", item.getString("url"));
                    influx.insert("interface_l7_stats", influx.getTags(), fields, System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 主机来源列表 流量统计
     */
    public void get_interface_hosts(){
        try{
//            System.out.println("get_interface_hosts");
            JSONObject json = NtopngUtil.ntopng_interface_hosts("0", "", "", "", "",
                    "", "all");
//            System.out.println(json);
            JSONObject rsp = json.getJSONObject("rsp");
            JSONArray data = rsp.getJSONArray("data");
            if(data != null && data.size() > 0){
                Map<String, Object> fields = new HashMap<String, Object>();
                for(int i=0; i< data.size(); i++){
                    JSONObject item = data.getJSONObject(i);
                    fields.clear();
                    fields.put("ifid", 0);
                    fields.put("country", item.getString("country"));
                    fields.put("first_seen", item.getIntValue("first_seen"));
                    fields.put("last_seen", item.getIntValue("last_seen"));
                    fields.put("os", item.getIntValue("os"));
                    fields.put("ip", item.getString("ip"));
                    fields.put("is_blacklisted", item.getBoolean("is_blacklisted"));
                    fields.put("is_broadcast", item.getBoolean("is_broadcast"));
                    fields.put("is_multicast", item.getBoolean("is_multicast"));
                    fields.put("is_localhost", item.getBoolean("is_localhost"));
                    fields.put("is_broadcast_domain", item.getBoolean("is_broadcast_domain"));
                    fields.put("vlan", item.getIntValue("vlan"));
                    fields.put("name", item.getString("name"));
                    fields.put("num_alerts", item.getIntValue("num_alerts"));
                    JSONObject num_flows = item.getJSONObject("num_flows");
                    fields.put("num_flows_as_client", num_flows.getIntValue("as_client"));
                    fields.put("num_flows_total", num_flows.getIntValue("total"));
                    fields.put("num_flows_as_server", num_flows.getIntValue("as_server"));
                    JSONObject thpt = item.getJSONObject("thpt");
                    fields.put("thpt_pps", thpt.getDoubleValue("pps"));
                    fields.put("thpt_bps", thpt.getDoubleValue("bps"));
                    JSONObject bytes = item.getJSONObject("bytes");
                    fields.put("bytes_total", bytes.getIntValue("total"));
                    fields.put("bytes_recvd", bytes.getIntValue("recvd"));
                    fields.put("bytes_sent", bytes.getIntValue("sent"));
                    influx.insert("interface_hosts", influx.getTags(), fields, System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                    get_host_data(item.getString("ip"));

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 获取主机明细数据
     * 对应http://112.13.167.87:9002/lua/host_details.lua?host=10.76.135.45&page=ndpi的数据
     */
    public void get_host_data(String hostip){
        try{
            JSONObject json = NtopngUtil.ntopng_host_data("0", hostip);
            JSONObject rsp = json.getJSONObject("rsp");
            Map<String, Object> fields = new HashMap<String, Object>();
            //对应application页面的数据
            if(rsp.containsKey("ndpi")){
                System.out.println("ndpi");
                JSONObject ndpi = rsp.getJSONObject("ndpi");
                //按IP，存不同协议的流量
                for(Map.Entry<String, Object> entry: ndpi.entrySet()){
                    String key = entry.getKey();//MQTT,HTTP
                    Object o = entry.getValue();
                    fields.clear();
                    if(o instanceof JSONObject){
                        JSONObject fo = (JSONObject)o;
                        fields.put("ifid", 0);
                        fields.put("ip", hostip);
                        fields.put("label", key);
                        fields.put("duration", fo.getIntValue("duration"));//累计时间，单位秒
                        fields.put("bytes_sent", fo.getIntValue("bytes.send"));
                        fields.put("bytes_rcvd", fo.getIntValue("bytes.rcvd"));
                        fields.put("packets_rcvd", fo.getIntValue("packets.rcvd"));
                        fields.put("packets_sent", fo.getIntValue("packets.sent"));
                        fields.put("num_flows", fo.getIntValue("num_flows"));
                        fields.put("breed", fo.getString("breed"));
                        influx.insert("ndpi", influx.getTags(), fields, System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                    }

                }
            }
            if(rsp.containsKey("ICMPv4")){
                //对应ICMP
                JSONObject ICMPv4 = rsp.getJSONObject("ICMPv4");
                System.out.println("ICMPv4");
            }
            if(rsp.containsKey("dns")){
                //对应DNS
                JSONObject dns = rsp.getJSONObject("dns");
                System.out.println("dns");
            }
            if(rsp.containsKey("ja3_fingerprint")){
                //对应TLS
//                JSONObject tls = rsp.getJSONObject("ja3_fingerprint");
//                System.out.println("ja3_fingerprint");
//                明明是JSONObject,怎么会是JSONArray呢？
//                java.lang.ClassCastException: com.alibaba.fastjson.JSONArray cannot be cast to com.alibaba.fastjson.JSONObject

            }
            if(rsp.containsKey("hassh_fingerprint")){
                //对应SSH
//                JSONObject ssh = rsp.getJSONObject("hassh_fingerprint");
                System.out.println("hassh_fingerprint");
            }
            if(rsp.containsKey("http")){
                //对应http
                JSONObject http = rsp.getJSONObject("http");
                System.out.println("http");
            }




        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NtopngDataUtil.getInstance().openDb();
        NtopngDataUtil.getInstance().get_interface_data();
        NtopngDataUtil.getInstance().get_interface_l7_stats();
        NtopngDataUtil.getInstance().get_interface_hosts();
//        NtopngDataUtil.getInstance().get_host_data("10.76.135.45");

        NtopngDataUtil.getInstance().closeDb();
    }
}
