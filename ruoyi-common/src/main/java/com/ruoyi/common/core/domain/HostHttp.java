package com.ruoyi.common.core.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 host_http
 * 
 * @author ruoyi
 * @date 2021-01-15
 */
public class HostHttp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateResponse1xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateResponse2xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateResponse3xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateResponse4xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateResponse5xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateQueryHead;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateQueryOther;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateQueryPost;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateQueryGet;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverRateQueryPut;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverResponseTotal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverResponseNum1xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverResponseNum2xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverResponseNum3xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverResponseNum4xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverResponseNum5xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverQueryNumOther;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverQueryNumPost;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverQueryTotal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverQueryNumPut;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverQueryNumGet;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long receiverQueryNumHead;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateResponse1xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateResponse2xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateResponse3xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateResponse4xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateResponse5xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateQueryHead;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateQueryOther;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateQueryPost;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateQueryGet;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderRateQueryPut;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderResponseTotal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderResponseNum1xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderResponseNum2xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderResponseNum3xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderResponseNum4xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderResponseNum5xx;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderQueryNumOther;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderQueryNumPost;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderQueryTotal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderQueryNumPut;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderQueryNumGet;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long senderQueryNumHead;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String virtualHostsName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long virtualHostsBytesSent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long virtualHostsHttpRequestsTrend;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long virtualHostsHttpActNumRequests;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long virtualHostsBytesRcvd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long virtualHostsHttpRequests;

    public HostHttp() {
    }

    public HostHttp(Long time, Integer ifId, String ip, Long receiverRateResponse1xx, Long receiverRateResponse2xx, Long receiverRateResponse3xx, Long receiverRateResponse4xx, Long receiverRateResponse5xx, Long receiverRateQueryHead,
                    Long receiverRateQueryOther, Long receiverRateQueryPost, Long receiverRateQueryGet, Long receiverRateQueryPut, Long receiverResponseTotal, Long receiverResponseNum1xx, Long receiverResponseNum2xx,
                    Long receiverResponseNum3xx, Long receiverResponseNum4xx, Long receiverResponseNum5xx, Long receiverQueryNumOther, Long receiverQueryNumPost, Long receiverQueryTotal, Long receiverQueryNumPut,
                    Long receiverQueryNumGet, Long receiverQueryNumHead, Long senderRateResponse1xx, Long senderRateResponse2xx, Long senderRateResponse3xx, Long senderRateResponse4xx, Long senderRateResponse5xx,
                    Long senderRateQueryHead, Long senderRateQueryOther, Long senderRateQueryPost, Long senderRateQueryGet, Long senderRateQueryPut, Long senderResponseTotal, Long senderResponseNum1xx, Long senderResponseNum2xx,
                    Long senderResponseNum3xx, Long senderResponseNum4xx, Long senderResponseNum5xx, Long senderQueryNumOther, Long senderQueryNumPost, Long senderQueryTotal, Long senderQueryNumPut, Long senderQueryNumGet, Long senderQueryNumHead) {
        this.time = time;
        this.ifId = ifId;
        this.ip = ip;
        this.receiverRateResponse1xx = receiverRateResponse1xx;
        this.receiverRateResponse2xx = receiverRateResponse2xx;
        this.receiverRateResponse3xx = receiverRateResponse3xx;
        this.receiverRateResponse4xx = receiverRateResponse4xx;
        this.receiverRateResponse5xx = receiverRateResponse5xx;
        this.receiverRateQueryHead = receiverRateQueryHead;
        this.receiverRateQueryOther = receiverRateQueryOther;
        this.receiverRateQueryPost = receiverRateQueryPost;
        this.receiverRateQueryGet = receiverRateQueryGet;
        this.receiverRateQueryPut = receiverRateQueryPut;
        this.receiverResponseTotal = receiverResponseTotal;
        this.receiverResponseNum1xx = receiverResponseNum1xx;
        this.receiverResponseNum2xx = receiverResponseNum2xx;
        this.receiverResponseNum3xx = receiverResponseNum3xx;
        this.receiverResponseNum4xx = receiverResponseNum4xx;
        this.receiverResponseNum5xx = receiverResponseNum5xx;
        this.receiverQueryNumOther = receiverQueryNumOther;
        this.receiverQueryNumPost = receiverQueryNumPost;
        this.receiverQueryTotal = receiverQueryTotal;
        this.receiverQueryNumPut = receiverQueryNumPut;
        this.receiverQueryNumGet = receiverQueryNumGet;
        this.receiverQueryNumHead = receiverQueryNumHead;
        this.senderRateResponse1xx = senderRateResponse1xx;
        this.senderRateResponse2xx = senderRateResponse2xx;
        this.senderRateResponse3xx = senderRateResponse3xx;
        this.senderRateResponse4xx = senderRateResponse4xx;
        this.senderRateResponse5xx = senderRateResponse5xx;
        this.senderRateQueryHead = senderRateQueryHead;
        this.senderRateQueryOther = senderRateQueryOther;
        this.senderRateQueryPost = senderRateQueryPost;
        this.senderRateQueryGet = senderRateQueryGet;
        this.senderRateQueryPut = senderRateQueryPut;
        this.senderResponseTotal = senderResponseTotal;
        this.senderResponseNum1xx = senderResponseNum1xx;
        this.senderResponseNum2xx = senderResponseNum2xx;
        this.senderResponseNum3xx = senderResponseNum3xx;
        this.senderResponseNum4xx = senderResponseNum4xx;
        this.senderResponseNum5xx = senderResponseNum5xx;
        this.senderQueryNumOther = senderQueryNumOther;
        this.senderQueryNumPost = senderQueryNumPost;
        this.senderQueryTotal = senderQueryTotal;
        this.senderQueryNumPut = senderQueryNumPut;
        this.senderQueryNumGet = senderQueryNumGet;
        this.senderQueryNumHead = senderQueryNumHead;
    }

    public HostHttp(Long time, Integer ifId, String ip, Long receiverRateResponse1xx, Long receiverRateResponse2xx, Long receiverRateResponse3xx, Long receiverRateResponse4xx,
                    Long receiverRateResponse5xx, Long receiverRateQueryHead, Long receiverRateQueryOther, Long receiverRateQueryPost, Long receiverRateQueryGet,
                    Long receiverRateQueryPut, Long receiverResponseTotal, Long receiverResponseNum1xx, Long receiverResponseNum2xx, Long receiverResponseNum3xx,
                    Long receiverResponseNum4xx, Long receiverResponseNum5xx, Long receiverQueryNumOther, Long receiverQueryNumPost, Long receiverQueryTotal, Long receiverQueryNumPut,
                    Long receiverQueryNumGet, Long receiverQueryNumHead, Long senderRateResponse1xx, Long senderRateResponse2xx, Long senderRateResponse3xx, Long senderRateResponse4xx,
                    Long senderRateResponse5xx, Long senderRateQueryHead, Long senderRateQueryOther, Long senderRateQueryPost, Long senderRateQueryGet, Long senderRateQueryPut,
                    Long senderResponseTotal, Long senderResponseNum1xx, Long senderResponseNum2xx, Long senderResponseNum3xx, Long senderResponseNum4xx, Long senderResponseNum5xx,
                    Long senderQueryNumOther, Long senderQueryNumPost, Long senderQueryTotal, Long senderQueryNumPut, Long senderQueryNumGet, Long senderQueryNumHead,
                    String virtualHostsName, Long virtualHostsBytesSent, Long virtualHostsHttpRequestsTrend, Long virtualHostsHttpActNumRequests, Long virtualHostsBytesRcvd,
                    Long virtualHostsHttpRequests) {
        this.time = time;
        this.ifId = ifId;
        this.ip = ip;
        this.receiverRateResponse1xx = receiverRateResponse1xx;
        this.receiverRateResponse2xx = receiverRateResponse2xx;
        this.receiverRateResponse3xx = receiverRateResponse3xx;
        this.receiverRateResponse4xx = receiverRateResponse4xx;
        this.receiverRateResponse5xx = receiverRateResponse5xx;
        this.receiverRateQueryHead = receiverRateQueryHead;
        this.receiverRateQueryOther = receiverRateQueryOther;
        this.receiverRateQueryPost = receiverRateQueryPost;
        this.receiverRateQueryGet = receiverRateQueryGet;
        this.receiverRateQueryPut = receiverRateQueryPut;
        this.receiverResponseTotal = receiverResponseTotal;
        this.receiverResponseNum1xx = receiverResponseNum1xx;
        this.receiverResponseNum2xx = receiverResponseNum2xx;
        this.receiverResponseNum3xx = receiverResponseNum3xx;
        this.receiverResponseNum4xx = receiverResponseNum4xx;
        this.receiverResponseNum5xx = receiverResponseNum5xx;
        this.receiverQueryNumOther = receiverQueryNumOther;
        this.receiverQueryNumPost = receiverQueryNumPost;
        this.receiverQueryTotal = receiverQueryTotal;
        this.receiverQueryNumPut = receiverQueryNumPut;
        this.receiverQueryNumGet = receiverQueryNumGet;
        this.receiverQueryNumHead = receiverQueryNumHead;
        this.senderRateResponse1xx = senderRateResponse1xx;
        this.senderRateResponse2xx = senderRateResponse2xx;
        this.senderRateResponse3xx = senderRateResponse3xx;
        this.senderRateResponse4xx = senderRateResponse4xx;
        this.senderRateResponse5xx = senderRateResponse5xx;
        this.senderRateQueryHead = senderRateQueryHead;
        this.senderRateQueryOther = senderRateQueryOther;
        this.senderRateQueryPost = senderRateQueryPost;
        this.senderRateQueryGet = senderRateQueryGet;
        this.senderRateQueryPut = senderRateQueryPut;
        this.senderResponseTotal = senderResponseTotal;
        this.senderResponseNum1xx = senderResponseNum1xx;
        this.senderResponseNum2xx = senderResponseNum2xx;
        this.senderResponseNum3xx = senderResponseNum3xx;
        this.senderResponseNum4xx = senderResponseNum4xx;
        this.senderResponseNum5xx = senderResponseNum5xx;
        this.senderQueryNumOther = senderQueryNumOther;
        this.senderQueryNumPost = senderQueryNumPost;
        this.senderQueryTotal = senderQueryTotal;
        this.senderQueryNumPut = senderQueryNumPut;
        this.senderQueryNumGet = senderQueryNumGet;
        this.senderQueryNumHead = senderQueryNumHead;
        this.virtualHostsName = virtualHostsName;
        this.virtualHostsBytesSent = virtualHostsBytesSent;
        this.virtualHostsHttpRequestsTrend = virtualHostsHttpRequestsTrend;
        this.virtualHostsHttpActNumRequests = virtualHostsHttpActNumRequests;
        this.virtualHostsBytesRcvd = virtualHostsBytesRcvd;
        this.virtualHostsHttpRequests = virtualHostsHttpRequests;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTime(Long time) 
    {
        this.time = time;
    }

    public Long getTime() 
    {
        return time;
    }

    public Integer getIfId() {
        return ifId;
    }

    public void setIfId(Integer ifId) {
        this.ifId = ifId;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setReceiverRateResponse1xx(Long receiverRateResponse1xx) 
    {
        this.receiverRateResponse1xx = receiverRateResponse1xx;
    }

    public Long getReceiverRateResponse1xx() 
    {
        return receiverRateResponse1xx;
    }
    public void setReceiverRateResponse2xx(Long receiverRateResponse2xx) 
    {
        this.receiverRateResponse2xx = receiverRateResponse2xx;
    }

    public Long getReceiverRateResponse2xx() 
    {
        return receiverRateResponse2xx;
    }
    public void setReceiverRateResponse3xx(Long receiverRateResponse3xx) 
    {
        this.receiverRateResponse3xx = receiverRateResponse3xx;
    }

    public Long getReceiverRateResponse3xx() 
    {
        return receiverRateResponse3xx;
    }
    public void setReceiverRateResponse4xx(Long receiverRateResponse4xx) 
    {
        this.receiverRateResponse4xx = receiverRateResponse4xx;
    }

    public Long getReceiverRateResponse4xx() 
    {
        return receiverRateResponse4xx;
    }
    public void setReceiverRateResponse5xx(Long receiverRateResponse5xx) 
    {
        this.receiverRateResponse5xx = receiverRateResponse5xx;
    }

    public Long getReceiverRateResponse5xx() 
    {
        return receiverRateResponse5xx;
    }
    public void setReceiverRateQueryHead(Long receiverRateQueryHead) 
    {
        this.receiverRateQueryHead = receiverRateQueryHead;
    }

    public Long getReceiverRateQueryHead() 
    {
        return receiverRateQueryHead;
    }
    public void setReceiverRateQueryOther(Long receiverRateQueryOther) 
    {
        this.receiverRateQueryOther = receiverRateQueryOther;
    }

    public Long getReceiverRateQueryOther() 
    {
        return receiverRateQueryOther;
    }
    public void setReceiverRateQueryPost(Long receiverRateQueryPost) 
    {
        this.receiverRateQueryPost = receiverRateQueryPost;
    }

    public Long getReceiverRateQueryPost() 
    {
        return receiverRateQueryPost;
    }
    public void setReceiverRateQueryGet(Long receiverRateQueryGet) 
    {
        this.receiverRateQueryGet = receiverRateQueryGet;
    }

    public Long getReceiverRateQueryGet() 
    {
        return receiverRateQueryGet;
    }
    public void setReceiverRateQueryPut(Long receiverRateQueryPut) 
    {
        this.receiverRateQueryPut = receiverRateQueryPut;
    }

    public Long getReceiverRateQueryPut() 
    {
        return receiverRateQueryPut;
    }
    public void setReceiverResponseTotal(Long receiverResponseTotal) 
    {
        this.receiverResponseTotal = receiverResponseTotal;
    }

    public Long getReceiverResponseTotal() 
    {
        return receiverResponseTotal;
    }
    public void setReceiverResponseNum1xx(Long receiverResponseNum1xx) 
    {
        this.receiverResponseNum1xx = receiverResponseNum1xx;
    }

    public Long getReceiverResponseNum1xx() 
    {
        return receiverResponseNum1xx;
    }
    public void setReceiverResponseNum2xx(Long receiverResponseNum2xx) 
    {
        this.receiverResponseNum2xx = receiverResponseNum2xx;
    }

    public Long getReceiverResponseNum2xx() 
    {
        return receiverResponseNum2xx;
    }
    public void setReceiverResponseNum3xx(Long receiverResponseNum3xx) 
    {
        this.receiverResponseNum3xx = receiverResponseNum3xx;
    }

    public Long getReceiverResponseNum3xx() 
    {
        return receiverResponseNum3xx;
    }
    public void setReceiverResponseNum4xx(Long receiverResponseNum4xx) 
    {
        this.receiverResponseNum4xx = receiverResponseNum4xx;
    }

    public Long getReceiverResponseNum4xx() 
    {
        return receiverResponseNum4xx;
    }
    public void setReceiverResponseNum5xx(Long receiverResponseNum5xx) 
    {
        this.receiverResponseNum5xx = receiverResponseNum5xx;
    }

    public Long getReceiverResponseNum5xx() 
    {
        return receiverResponseNum5xx;
    }
    public void setReceiverQueryNumOther(Long receiverQueryNumOther) 
    {
        this.receiverQueryNumOther = receiverQueryNumOther;
    }

    public Long getReceiverQueryNumOther() 
    {
        return receiverQueryNumOther;
    }
    public void setReceiverQueryNumPost(Long receiverQueryNumPost) 
    {
        this.receiverQueryNumPost = receiverQueryNumPost;
    }

    public Long getReceiverQueryNumPost() 
    {
        return receiverQueryNumPost;
    }
    public void setReceiverQueryTotal(Long receiverQueryTotal) 
    {
        this.receiverQueryTotal = receiverQueryTotal;
    }

    public Long getReceiverQueryTotal() 
    {
        return receiverQueryTotal;
    }
    public void setReceiverQueryNumPut(Long receiverQueryNumPut) 
    {
        this.receiverQueryNumPut = receiverQueryNumPut;
    }

    public Long getReceiverQueryNumPut() 
    {
        return receiverQueryNumPut;
    }
    public void setReceiverQueryNumGet(Long receiverQueryNumGet) 
    {
        this.receiverQueryNumGet = receiverQueryNumGet;
    }

    public Long getReceiverQueryNumGet() 
    {
        return receiverQueryNumGet;
    }
    public void setReceiverQueryNumHead(Long receiverQueryNumHead) 
    {
        this.receiverQueryNumHead = receiverQueryNumHead;
    }

    public Long getReceiverQueryNumHead() 
    {
        return receiverQueryNumHead;
    }
    public void setSenderRateResponse1xx(Long senderRateResponse1xx) 
    {
        this.senderRateResponse1xx = senderRateResponse1xx;
    }

    public Long getSenderRateResponse1xx() 
    {
        return senderRateResponse1xx;
    }
    public void setSenderRateResponse2xx(Long senderRateResponse2xx) 
    {
        this.senderRateResponse2xx = senderRateResponse2xx;
    }

    public Long getSenderRateResponse2xx() 
    {
        return senderRateResponse2xx;
    }
    public void setSenderRateResponse3xx(Long senderRateResponse3xx) 
    {
        this.senderRateResponse3xx = senderRateResponse3xx;
    }

    public Long getSenderRateResponse3xx() 
    {
        return senderRateResponse3xx;
    }
    public void setSenderRateResponse4xx(Long senderRateResponse4xx) 
    {
        this.senderRateResponse4xx = senderRateResponse4xx;
    }

    public Long getSenderRateResponse4xx() 
    {
        return senderRateResponse4xx;
    }
    public void setSenderRateResponse5xx(Long senderRateResponse5xx) 
    {
        this.senderRateResponse5xx = senderRateResponse5xx;
    }

    public Long getSenderRateResponse5xx() 
    {
        return senderRateResponse5xx;
    }
    public void setSenderRateQueryHead(Long senderRateQueryHead) 
    {
        this.senderRateQueryHead = senderRateQueryHead;
    }

    public Long getSenderRateQueryHead() 
    {
        return senderRateQueryHead;
    }
    public void setSenderRateQueryOther(Long senderRateQueryOther) 
    {
        this.senderRateQueryOther = senderRateQueryOther;
    }

    public Long getSenderRateQueryOther() 
    {
        return senderRateQueryOther;
    }
    public void setSenderRateQueryPost(Long senderRateQueryPost) 
    {
        this.senderRateQueryPost = senderRateQueryPost;
    }

    public Long getSenderRateQueryPost() 
    {
        return senderRateQueryPost;
    }
    public void setSenderRateQueryGet(Long senderRateQueryGet) 
    {
        this.senderRateQueryGet = senderRateQueryGet;
    }

    public Long getSenderRateQueryGet() 
    {
        return senderRateQueryGet;
    }
    public void setSenderRateQueryPut(Long senderRateQueryPut) 
    {
        this.senderRateQueryPut = senderRateQueryPut;
    }

    public Long getSenderRateQueryPut() 
    {
        return senderRateQueryPut;
    }
    public void setSenderResponseTotal(Long senderResponseTotal) 
    {
        this.senderResponseTotal = senderResponseTotal;
    }

    public Long getSenderResponseTotal() 
    {
        return senderResponseTotal;
    }
    public void setSenderResponseNum1xx(Long senderResponseNum1xx) 
    {
        this.senderResponseNum1xx = senderResponseNum1xx;
    }

    public Long getSenderResponseNum1xx() 
    {
        return senderResponseNum1xx;
    }
    public void setSenderResponseNum2xx(Long senderResponseNum2xx) 
    {
        this.senderResponseNum2xx = senderResponseNum2xx;
    }

    public Long getSenderResponseNum2xx() 
    {
        return senderResponseNum2xx;
    }
    public void setSenderResponseNum3xx(Long senderResponseNum3xx) 
    {
        this.senderResponseNum3xx = senderResponseNum3xx;
    }

    public Long getSenderResponseNum3xx() 
    {
        return senderResponseNum3xx;
    }
    public void setSenderResponseNum4xx(Long senderResponseNum4xx) 
    {
        this.senderResponseNum4xx = senderResponseNum4xx;
    }

    public Long getSenderResponseNum4xx() 
    {
        return senderResponseNum4xx;
    }
    public void setSenderResponseNum5xx(Long senderResponseNum5xx) 
    {
        this.senderResponseNum5xx = senderResponseNum5xx;
    }

    public Long getSenderResponseNum5xx() 
    {
        return senderResponseNum5xx;
    }
    public void setSenderQueryNumOther(Long senderQueryNumOther) 
    {
        this.senderQueryNumOther = senderQueryNumOther;
    }

    public Long getSenderQueryNumOther() 
    {
        return senderQueryNumOther;
    }
    public void setSenderQueryNumPost(Long senderQueryNumPost) 
    {
        this.senderQueryNumPost = senderQueryNumPost;
    }

    public Long getSenderQueryNumPost() 
    {
        return senderQueryNumPost;
    }
    public void setSenderQueryTotal(Long senderQueryTotal) 
    {
        this.senderQueryTotal = senderQueryTotal;
    }

    public Long getSenderQueryTotal() 
    {
        return senderQueryTotal;
    }
    public void setSenderQueryNumPut(Long senderQueryNumPut) 
    {
        this.senderQueryNumPut = senderQueryNumPut;
    }

    public Long getSenderQueryNumPut() 
    {
        return senderQueryNumPut;
    }
    public void setSenderQueryNumGet(Long senderQueryNumGet) 
    {
        this.senderQueryNumGet = senderQueryNumGet;
    }

    public Long getSenderQueryNumGet() 
    {
        return senderQueryNumGet;
    }
    public void setSenderQueryNumHead(Long senderQueryNumHead) 
    {
        this.senderQueryNumHead = senderQueryNumHead;
    }

    public Long getSenderQueryNumHead() 
    {
        return senderQueryNumHead;
    }
    public void setVirtualHostsName(String virtualHostsName) 
    {
        this.virtualHostsName = virtualHostsName;
    }

    public String getVirtualHostsName() 
    {
        return virtualHostsName;
    }
    public void setVirtualHostsBytesSent(Long virtualHostsBytesSent) 
    {
        this.virtualHostsBytesSent = virtualHostsBytesSent;
    }

    public Long getVirtualHostsBytesSent() 
    {
        return virtualHostsBytesSent;
    }
    public void setVirtualHostsHttpRequestsTrend(Long virtualHostsHttpRequestsTrend) 
    {
        this.virtualHostsHttpRequestsTrend = virtualHostsHttpRequestsTrend;
    }

    public Long getVirtualHostsHttpRequestsTrend() 
    {
        return virtualHostsHttpRequestsTrend;
    }
    public void setVirtualHostsHttpActNumRequests(Long virtualHostsHttpActNumRequests) 
    {
        this.virtualHostsHttpActNumRequests = virtualHostsHttpActNumRequests;
    }

    public Long getVirtualHostsHttpActNumRequests() 
    {
        return virtualHostsHttpActNumRequests;
    }
    public void setVirtualHostsBytesRcvd(Long virtualHostsBytesRcvd) 
    {
        this.virtualHostsBytesRcvd = virtualHostsBytesRcvd;
    }

    public Long getVirtualHostsBytesRcvd() 
    {
        return virtualHostsBytesRcvd;
    }
    public void setVirtualHostsHttpRequests(Long virtualHostsHttpRequests) 
    {
        this.virtualHostsHttpRequests = virtualHostsHttpRequests;
    }

    public Long getVirtualHostsHttpRequests() 
    {
        return virtualHostsHttpRequests;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("time", getTime())
            .append("ifId", getIfId())
            .append("ip", getIp())
            .append("receiverRateResponse1xx", getReceiverRateResponse1xx())
            .append("receiverRateResponse2xx", getReceiverRateResponse2xx())
            .append("receiverRateResponse3xx", getReceiverRateResponse3xx())
            .append("receiverRateResponse4xx", getReceiverRateResponse4xx())
            .append("receiverRateResponse5xx", getReceiverRateResponse5xx())
            .append("receiverRateQueryHead", getReceiverRateQueryHead())
            .append("receiverRateQueryOther", getReceiverRateQueryOther())
            .append("receiverRateQueryPost", getReceiverRateQueryPost())
            .append("receiverRateQueryGet", getReceiverRateQueryGet())
            .append("receiverRateQueryPut", getReceiverRateQueryPut())
            .append("receiverResponseTotal", getReceiverResponseTotal())
            .append("receiverResponseNum1xx", getReceiverResponseNum1xx())
            .append("receiverResponseNum2xx", getReceiverResponseNum2xx())
            .append("receiverResponseNum3xx", getReceiverResponseNum3xx())
            .append("receiverResponseNum4xx", getReceiverResponseNum4xx())
            .append("receiverResponseNum5xx", getReceiverResponseNum5xx())
            .append("receiverQueryNumOther", getReceiverQueryNumOther())
            .append("receiverQueryNumPost", getReceiverQueryNumPost())
            .append("receiverQueryTotal", getReceiverQueryTotal())
            .append("receiverQueryNumPut", getReceiverQueryNumPut())
            .append("receiverQueryNumGet", getReceiverQueryNumGet())
            .append("receiverQueryNumHead", getReceiverQueryNumHead())
            .append("senderRateResponse1xx", getSenderRateResponse1xx())
            .append("senderRateResponse2xx", getSenderRateResponse2xx())
            .append("senderRateResponse3xx", getSenderRateResponse3xx())
            .append("senderRateResponse4xx", getSenderRateResponse4xx())
            .append("senderRateResponse5xx", getSenderRateResponse5xx())
            .append("senderRateQueryHead", getSenderRateQueryHead())
            .append("senderRateQueryOther", getSenderRateQueryOther())
            .append("senderRateQueryPost", getSenderRateQueryPost())
            .append("senderRateQueryGet", getSenderRateQueryGet())
            .append("senderRateQueryPut", getSenderRateQueryPut())
            .append("senderResponseTotal", getSenderResponseTotal())
            .append("senderResponseNum1xx", getSenderResponseNum1xx())
            .append("senderResponseNum2xx", getSenderResponseNum2xx())
            .append("senderResponseNum3xx", getSenderResponseNum3xx())
            .append("senderResponseNum4xx", getSenderResponseNum4xx())
            .append("senderResponseNum5xx", getSenderResponseNum5xx())
            .append("senderQueryNumOther", getSenderQueryNumOther())
            .append("senderQueryNumPost", getSenderQueryNumPost())
            .append("senderQueryTotal", getSenderQueryTotal())
            .append("senderQueryNumPut", getSenderQueryNumPut())
            .append("senderQueryNumGet", getSenderQueryNumGet())
            .append("senderQueryNumHead", getSenderQueryNumHead())
            .append("virtualHostsName", getVirtualHostsName())
            .append("virtualHostsBytesSent", getVirtualHostsBytesSent())
            .append("virtualHostsHttpRequestsTrend", getVirtualHostsHttpRequestsTrend())
            .append("virtualHostsHttpActNumRequests", getVirtualHostsHttpActNumRequests())
            .append("virtualHostsBytesRcvd", getVirtualHostsBytesRcvd())
            .append("virtualHostsHttpRequests", getVirtualHostsHttpRequests())
            .toString();
    }
}
