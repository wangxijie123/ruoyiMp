package com.ruoyi.common.core.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 host_application
 * 
 * @author ruoyi
 * @date 2021-01-15
 */
public class HostApplication
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long duration;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bytesSent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packetsRcvd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long numFlows;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bytesRcvd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packetsSent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String breed;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    public HostApplication() {
    }

    public HostApplication(String name, Long duration, Long bytesSent, Long packetsRcvd, Long numFlows, Long bytesRcvd, Long packetsSent, String breed, Long time, Integer ifId, String ip) {
        this.name = name;
        this.duration = duration;
        this.bytesSent = bytesSent;
        this.packetsRcvd = packetsRcvd;
        this.numFlows = numFlows;
        this.bytesRcvd = bytesRcvd;
        this.packetsSent = packetsSent;
        this.breed = breed;
        this.time = time;
        this.ifId = ifId;
        this.ip = ip;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
    }
    public void setBytesSent(Long bytesSent) 
    {
        this.bytesSent = bytesSent;
    }

    public Long getBytesSent() 
    {
        return bytesSent;
    }
    public void setPacketsRcvd(Long packetsRcvd) 
    {
        this.packetsRcvd = packetsRcvd;
    }

    public Long getPacketsRcvd() 
    {
        return packetsRcvd;
    }
    public void setNumFlows(Long numFlows) 
    {
        this.numFlows = numFlows;
    }

    public Long getNumFlows() 
    {
        return numFlows;
    }
    public void setBytesRcvd(Long bytesRcvd) 
    {
        this.bytesRcvd = bytesRcvd;
    }

    public Long getBytesRcvd() 
    {
        return bytesRcvd;
    }
    public void setPacketsSent(Long packetsSent) 
    {
        this.packetsSent = packetsSent;
    }

    public Long getPacketsSent() 
    {
        return packetsSent;
    }
    public void setBreed(String breed) 
    {
        this.breed = breed;
    }

    public String getBreed() 
    {
        return breed;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("duration", getDuration())
            .append("bytesSent", getBytesSent())
            .append("packetsRcvd", getPacketsRcvd())
            .append("numFlows", getNumFlows())
            .append("bytesRcvd", getBytesRcvd())
            .append("packetsSent", getPacketsSent())
            .append("breed", getBreed())
            .append("time", getTime())
            .append("ifId", getIfId())
            .append("ip", getIp())
            .toString();
    }
}
