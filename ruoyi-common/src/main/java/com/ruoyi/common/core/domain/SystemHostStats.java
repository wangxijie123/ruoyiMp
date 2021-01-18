package com.ruoyi.common.core.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 system_host_stats
 *
 * @author ruoyi
 * @date 2021-01-18
 */
public class SystemHostStats extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long time;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ifName;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uptime;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long alertsQueries;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memUsed;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memNtopngResident;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memCached;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long droppedAlerts;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memBuffers;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memNtopngVirtual;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memTotal;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memShmem;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memFree;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memSreclaimable;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long writtenAlerts;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long engagedAlerts;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long cpuLoad;

    public SystemHostStats() {
    }

    public SystemHostStats(Long time, Integer ifId, String ifName, String uptime, Long alertsQueries, Long memUsed, Long memNtopngResident, Long memCached, Long droppedAlerts, Long memBuffers, Long memNtopngVirtual, Long memTotal, Long memShmem, Long memFree, Long memSreclaimable, Long writtenAlerts, Long engagedAlerts, Long cpuLoad) {
        this.time = time;
        this.ifId = ifId;
        this.ifName = ifName;
        this.uptime = uptime;
        this.alertsQueries = alertsQueries;
        this.memUsed = memUsed;
        this.memNtopngResident = memNtopngResident;
        this.memCached = memCached;
        this.droppedAlerts = droppedAlerts;
        this.memBuffers = memBuffers;
        this.memNtopngVirtual = memNtopngVirtual;
        this.memTotal = memTotal;
        this.memShmem = memShmem;
        this.memFree = memFree;
        this.memSreclaimable = memSreclaimable;
        this.writtenAlerts = writtenAlerts;
        this.engagedAlerts = engagedAlerts;
        this.cpuLoad = cpuLoad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTime() {
        return time;
    }

    public void setIfId(Integer ifId) {
        this.ifId = ifId;
    }

    public Integer getIfId() {
        return ifId;
    }

    public void setIfName(String ifName) {
        this.ifName = ifName;
    }

    public String getIfName() {
        return ifName;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getUptime() {
        return uptime;
    }

    public void setAlertsQueries(Long alertsQueries) {
        this.alertsQueries = alertsQueries;
    }

    public Long getAlertsQueries() {
        return alertsQueries;
    }

    public void setMemUsed(Long memUsed) {
        this.memUsed = memUsed;
    }

    public Long getMemUsed() {
        return memUsed;
    }

    public void setMemNtopngResident(Long memNtopngResident) {
        this.memNtopngResident = memNtopngResident;
    }

    public Long getMemNtopngResident() {
        return memNtopngResident;
    }

    public void setMemCached(Long memCached) {
        this.memCached = memCached;
    }

    public Long getMemCached() {
        return memCached;
    }

    public void setDroppedAlerts(Long droppedAlerts) {
        this.droppedAlerts = droppedAlerts;
    }

    public Long getDroppedAlerts() {
        return droppedAlerts;
    }

    public void setMemBuffers(Long memBuffers) {
        this.memBuffers = memBuffers;
    }

    public Long getMemBuffers() {
        return memBuffers;
    }

    public void setMemNtopngVirtual(Long memNtopngVirtual) {
        this.memNtopngVirtual = memNtopngVirtual;
    }

    public Long getMemNtopngVirtual() {
        return memNtopngVirtual;
    }

    public void setMemTotal(Long memTotal) {
        this.memTotal = memTotal;
    }

    public Long getMemTotal() {
        return memTotal;
    }

    public void setMemShmem(Long memShmem) {
        this.memShmem = memShmem;
    }

    public Long getMemShmem() {
        return memShmem;
    }

    public void setMemFree(Long memFree) {
        this.memFree = memFree;
    }

    public Long getMemFree() {
        return memFree;
    }

    public void setMemSreclaimable(Long memSreclaimable) {
        this.memSreclaimable = memSreclaimable;
    }

    public Long getMemSreclaimable() {
        return memSreclaimable;
    }

    public void setWrittenAlerts(Long writtenAlerts) {
        this.writtenAlerts = writtenAlerts;
    }

    public Long getWrittenAlerts() {
        return writtenAlerts;
    }

    public void setEngagedAlerts(Long engagedAlerts) {
        this.engagedAlerts = engagedAlerts;
    }

    public Long getEngagedAlerts() {
        return engagedAlerts;
    }

    public void setCpuLoad(Long cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public Long getCpuLoad() {
        return cpuLoad;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("time", getTime())
                .append("ifId", getIfId())
                .append("ifName", getIfName())
                .append("uptime", getUptime())
                .append("alertsQueries", getAlertsQueries())
                .append("memUsed", getMemUsed())
                .append("memNtopngResident", getMemNtopngResident())
                .append("memCached", getMemCached())
                .append("droppedAlerts", getDroppedAlerts())
                .append("memBuffers", getMemBuffers())
                .append("memNtopngVirtual", getMemNtopngVirtual())
                .append("memTotal", getMemTotal())
                .append("memShmem", getMemShmem())
                .append("memFree", getMemFree())
                .append("memSreclaimable", getMemSreclaimable())
                .append("writtenAlerts", getWrittenAlerts())
                .append("engagedAlerts", getEngagedAlerts())
                .append("cpuLoad", getCpuLoad())
                .toString();
    }
}
