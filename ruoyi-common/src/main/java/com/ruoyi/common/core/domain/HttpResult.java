package com.ruoyi.common.core.domain;

/**
 * @author Match Fu
 * @date 2019/12/26 9:10 上午
 */
public class HttpResult {
    /**
     * 状态码
     */
    private int code;
    /**
     * 数据
     */
    private String data;

    public HttpResult() {
    }

    public HttpResult(int code, String data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "code=" + code +
                ", data='" + data + '\'' +
                '}';
    }
}
