package com.ruoyi.common.core.domain;

import com.ruoyi.common.annotation.Excel;

/**
 * 【请填写功能名称】对象 interface_hosts
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
public class InterfaceHosts extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String country;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long firstSeen;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long lastSeen;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long os;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isBlacklisted;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isBroadcast;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isMulticast;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isLocalhost;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isBroadcastDomain;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long vlan;

    /** name */
    @Excel(name = "name")
    private String name;

    /** $column.columnComment */
    @Excel(name = "name")
    private Long numAlerts;

    /** $column.columnComment */
    @Excel(name = "name")
    private Long numFlowsAsClient;

    /** flows */
    @Excel(name = "flows")
    private Long numFlowsTotal;

    /** $column.columnComment */
    @Excel(name = "flows")
    private Long numFlowsAsServer;

    /** $column.columnComment */
    @Excel(name = "flows")
    private Double thptPps;

    /** $column.columnComment */
    @Excel(name = "flows")
    private Double thptBps;

    /** total bytes sent(Gb )需/1024/1024/1024 */
    @Excel(name = "total bytes sent(Gb ) 需/1024/1024/1024")
    private Long bytesTotal;

    /** $column.columnComment */
    @Excel(name = "total bytes sent(Gb ) 需/1024/1024/1024")
    private Long bytesRecvd;

    /** $column.columnComment */
    @Excel(name = "total bytes sent(Gb ) 需/1024/1024/1024")
    private Long bytesSent;

    private Long time;

    public InterfaceHosts() {
    }

    public InterfaceHosts(Integer ifId, String country, Long firstSeen, Long lastSeen, Long os, String ip,
                          Integer isBlacklisted, Integer isBroadcast, Integer isMulticast, Integer isLocalhost, Integer isBroadcastDomain,
                          Long vlan, String name, Long numAlerts, Long numFlowsAsClient, Long numFlowsTotal, Long numFlowsAsServer,
                          Double thptPps, Double thptBps, Long bytesTotal, Long bytesRecvd, Long bytesSent , Long time) {
        this.ifId = ifId;
        this.country = country;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
        this.os = os;
        this.ip = ip;
        this.isBlacklisted = isBlacklisted;
        this.isBroadcast = isBroadcast;
        this.isMulticast = isMulticast;
        this.isLocalhost = isLocalhost;
        this.isBroadcastDomain = isBroadcastDomain;
        this.vlan = vlan;
        this.name = name;
        this.numAlerts = numAlerts;
        this.numFlowsAsClient = numFlowsAsClient;
        this.numFlowsTotal = numFlowsTotal;
        this.numFlowsAsServer = numFlowsAsServer;
        this.thptPps = thptPps;
        this.thptBps = thptBps;
        this.bytesTotal = bytesTotal;
        this.bytesRecvd = bytesRecvd;
        this.bytesSent = bytesSent;
        this.time = time;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public Integer getIfId() {
        return ifId;
    }

    public void setIfId(Integer ifId) {
        this.ifId = ifId;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry() 
    {
        return country;
    }
    public void setFirstSeen(Long firstSeen) 
    {
        this.firstSeen = firstSeen;
    }

    public Long getFirstSeen() 
    {
        return firstSeen;
    }
    public void setLastSeen(Long lastSeen) 
    {
        this.lastSeen = lastSeen;
    }

    public Long getLastSeen() 
    {
        return lastSeen;
    }
    public void setOs(Long os) 
    {
        this.os = os;
    }

    public Long getOs() 
    {
        return os;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setIsBlacklisted(Integer isBlacklisted) 
    {
        this.isBlacklisted = isBlacklisted;
    }

    public Integer getIsBlacklisted() 
    {
        return isBlacklisted;
    }
    public void setIsBroadcast(Integer isBroadcast) 
    {
        this.isBroadcast = isBroadcast;
    }

    public Integer getIsBroadcast() 
    {
        return isBroadcast;
    }
    public void setIsMulticast(Integer isMulticast) 
    {
        this.isMulticast = isMulticast;
    }

    public Integer getIsMulticast() 
    {
        return isMulticast;
    }
    public void setIsLocalhost(Integer isLocalhost) 
    {
        this.isLocalhost = isLocalhost;
    }

    public Integer getIsLocalhost() 
    {
        return isLocalhost;
    }
    public void setIsBroadcastDomain(Integer isBroadcastDomain) 
    {
        this.isBroadcastDomain = isBroadcastDomain;
    }

    public Integer getIsBroadcastDomain() 
    {
        return isBroadcastDomain;
    }
    public void setVlan(Long vlan) 
    {
        this.vlan = vlan;
    }

    public Long getVlan() 
    {
        return vlan;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNumAlerts(Long numAlerts) 
    {
        this.numAlerts = numAlerts;
    }

    public Long getNumAlerts() 
    {
        return numAlerts;
    }
    public void setNumFlowsAsClient(Long numFlowsAsClient) 
    {
        this.numFlowsAsClient = numFlowsAsClient;
    }

    public Long getNumFlowsAsClient() 
    {
        return numFlowsAsClient;
    }
    public void setNumFlowsTotal(Long numFlowsTotal) 
    {
        this.numFlowsTotal = numFlowsTotal;
    }

    public Long getNumFlowsTotal() 
    {
        return numFlowsTotal;
    }
    public void setNumFlowsAsServer(Long numFlowsAsServer) 
    {
        this.numFlowsAsServer = numFlowsAsServer;
    }

    public Long getNumFlowsAsServer() 
    {
        return numFlowsAsServer;
    }

    public Double getThptPps() {
        return thptPps;
    }

    public void setThptPps(Double thptPps) {
        this.thptPps = thptPps;
    }

    public Double getThptBps() {
        return thptBps;
    }

    public void setThptBps(Double thptBps) {
        this.thptBps = thptBps;
    }

    public void setBytesTotal(Long bytesTotal)
    {
        this.bytesTotal = bytesTotal;
    }

    public Long getBytesTotal() 
    {
        return bytesTotal;
    }
    public void setBytesRecvd(Long bytesRecvd) 
    {
        this.bytesRecvd = bytesRecvd;
    }

    public Long getBytesRecvd() 
    {
        return bytesRecvd;
    }
    public void setBytesSent(Long bytesSent) 
    {
        this.bytesSent = bytesSent;
    }

    public Long getBytesSent() 
    {
        return bytesSent;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "InterfaceHosts{" +
                "id=" + id +
                ", ifId=" + ifId +
                ", country='" + country + '\'' +
                ", firstSeen=" + firstSeen +
                ", lastSeen=" + lastSeen +
                ", os=" + os +
                ", ip='" + ip + '\'' +
                ", isBlacklisted=" + isBlacklisted +
                ", isBroadcast=" + isBroadcast +
                ", isMulticast=" + isMulticast +
                ", isLocalhost=" + isLocalhost +
                ", isBroadcastDomain=" + isBroadcastDomain +
                ", vlan=" + vlan +
                ", name='" + name + '\'' +
                ", numAlerts=" + numAlerts +
                ", numFlowsAsClient=" + numFlowsAsClient +
                ", numFlowsTotal=" + numFlowsTotal +
                ", numFlowsAsServer=" + numFlowsAsServer +
                ", thptPps=" + thptPps +
                ", thptBps=" + thptBps +
                ", bytesTotal=" + bytesTotal +
                ", bytesRecvd=" + bytesRecvd +
                ", bytesSent=" + bytesSent +
                ", time=" + time +
                '}';
    }
}
