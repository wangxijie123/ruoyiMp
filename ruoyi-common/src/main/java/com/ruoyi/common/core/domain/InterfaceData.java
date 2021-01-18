package com.ruoyi.common.core.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 interface_data
 * 
 * @author ruoyi
 * @date 2021-01-18
 */
public class InterfaceData extends BaseEntity
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
    private String ifName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uptime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long numFlows;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long numDevices;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long numLiveCaptures;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long numHosts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long droppedAlerts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long epoch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long alertedFlowsNotice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long alertedFlowsWarning;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long speed;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packets;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bytesDownload;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bytesUpload;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packetsDownload;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packetsUpload;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long local2remote;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long remote2local;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double throughputBps;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double throughputPps;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long drops;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long flowsPctg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hostsPctg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long periodicStatsUpdateFrequencySecs;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bytes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long remoteBps;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long alertedFlows;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long engagedAlerts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcpPacketOutOfOrder;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcpPacketLost;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcpPacketRetransmissions;

    private SystemHostStats systemHostStats;

    public InterfaceData() {
    }

    public InterfaceData(Long time, Integer ifId, String ifName, String uptime, Long numFlows, Long numDevices, Long numLiveCaptures, Long numHosts, Long droppedAlerts, Long epoch, Long alertedFlowsNotice, Long alertedFlowsWarning, Long speed, Long packets, Long bytesDownload, Long bytesUpload, Long packetsDownload, Long packetsUpload, Long local2remote, Long remote2local, Double throughputBps, Double throughputPps, Long drops, Long flowsPctg, Long hostsPctg, Long periodicStatsUpdateFrequencySecs, Long bytes, Long remoteBps, Long alertedFlows, Long engagedAlerts, Long tcpPacketOutOfOrder, Long tcpPacketLost, Long tcpPacketRetransmissions) {
        this.time = time;
        this.ifId = ifId;
        this.ifName = ifName;
        this.uptime = uptime;
        this.numFlows = numFlows;
        this.numDevices = numDevices;
        this.numLiveCaptures = numLiveCaptures;
        this.numHosts = numHosts;
        this.droppedAlerts = droppedAlerts;
        this.epoch = epoch;
        this.alertedFlowsNotice = alertedFlowsNotice;
        this.alertedFlowsWarning = alertedFlowsWarning;
        this.speed = speed;
        this.packets = packets;
        this.bytesDownload = bytesDownload;
        this.bytesUpload = bytesUpload;
        this.packetsDownload = packetsDownload;
        this.packetsUpload = packetsUpload;
        this.local2remote = local2remote;
        this.remote2local = remote2local;
        this.throughputBps = throughputBps;
        this.throughputPps = throughputPps;
        this.drops = drops;
        this.flowsPctg = flowsPctg;
        this.hostsPctg = hostsPctg;
        this.periodicStatsUpdateFrequencySecs = periodicStatsUpdateFrequencySecs;
        this.bytes = bytes;
        this.remoteBps = remoteBps;
        this.alertedFlows = alertedFlows;
        this.engagedAlerts = engagedAlerts;
        this.tcpPacketOutOfOrder = tcpPacketOutOfOrder;
        this.tcpPacketLost = tcpPacketLost;
        this.tcpPacketRetransmissions = tcpPacketRetransmissions;
    }

    public SystemHostStats getSystemHostStats() {
        return systemHostStats;
    }

    public void setSystemHostStats(SystemHostStats systemHostStats) {
        this.systemHostStats = systemHostStats;
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
    public void setIfId(Integer ifId) 
    {
        this.ifId = ifId;
    }

    public Integer getIfId() 
    {
        return ifId;
    }
    public void setIfName(String ifName) 
    {
        this.ifName = ifName;
    }

    public String getIfName() 
    {
        return ifName;
    }
    public void setUptime(String uptime) 
    {
        this.uptime = uptime;
    }

    public String getUptime() 
    {
        return uptime;
    }
    public void setNumFlows(Long numFlows) 
    {
        this.numFlows = numFlows;
    }

    public Long getNumFlows() 
    {
        return numFlows;
    }
    public void setNumDevices(Long numDevices) 
    {
        this.numDevices = numDevices;
    }

    public Long getNumDevices() 
    {
        return numDevices;
    }
    public void setNumLiveCaptures(Long numLiveCaptures) 
    {
        this.numLiveCaptures = numLiveCaptures;
    }

    public Long getNumLiveCaptures() 
    {
        return numLiveCaptures;
    }
    public void setNumHosts(Long numHosts) 
    {
        this.numHosts = numHosts;
    }

    public Long getNumHosts() 
    {
        return numHosts;
    }
    public void setDroppedAlerts(Long droppedAlerts) 
    {
        this.droppedAlerts = droppedAlerts;
    }

    public Long getDroppedAlerts() 
    {
        return droppedAlerts;
    }
    public void setEpoch(Long epoch) 
    {
        this.epoch = epoch;
    }

    public Long getEpoch() 
    {
        return epoch;
    }
    public void setAlertedFlowsNotice(Long alertedFlowsNotice) 
    {
        this.alertedFlowsNotice = alertedFlowsNotice;
    }

    public Long getAlertedFlowsNotice() 
    {
        return alertedFlowsNotice;
    }
    public void setAlertedFlowsWarning(Long alertedFlowsWarning) 
    {
        this.alertedFlowsWarning = alertedFlowsWarning;
    }

    public Long getAlertedFlowsWarning() 
    {
        return alertedFlowsWarning;
    }
    public void setSpeed(Long speed) 
    {
        this.speed = speed;
    }

    public Long getSpeed() 
    {
        return speed;
    }
    public void setPackets(Long packets) 
    {
        this.packets = packets;
    }

    public Long getPackets() 
    {
        return packets;
    }
    public void setBytesDownload(Long bytesDownload) 
    {
        this.bytesDownload = bytesDownload;
    }

    public Long getBytesDownload() 
    {
        return bytesDownload;
    }
    public void setBytesUpload(Long bytesUpload) 
    {
        this.bytesUpload = bytesUpload;
    }

    public Long getBytesUpload() 
    {
        return bytesUpload;
    }
    public void setPacketsDownload(Long packetsDownload) 
    {
        this.packetsDownload = packetsDownload;
    }

    public Long getPacketsDownload() 
    {
        return packetsDownload;
    }
    public void setPacketsUpload(Long packetsUpload) 
    {
        this.packetsUpload = packetsUpload;
    }

    public Long getPacketsUpload() 
    {
        return packetsUpload;
    }
    public void setLocal2remote(Long local2remote) 
    {
        this.local2remote = local2remote;
    }

    public Long getLocal2remote() 
    {
        return local2remote;
    }
    public void setRemote2local(Long remote2local) 
    {
        this.remote2local = remote2local;
    }

    public Long getRemote2local() 
    {
        return remote2local;
    }

    public Double getThroughputBps() {
        return throughputBps;
    }

    public void setThroughputBps(Double throughputBps) {
        this.throughputBps = throughputBps;
    }

    public Double getThroughputPps() {
        return throughputPps;
    }

    public void setThroughputPps(Double throughputPps) {
        this.throughputPps = throughputPps;
    }

    public void setDrops(Long drops)
    {
        this.drops = drops;
    }

    public Long getDrops() 
    {
        return drops;
    }
    public void setFlowsPctg(Long flowsPctg) 
    {
        this.flowsPctg = flowsPctg;
    }

    public Long getFlowsPctg() 
    {
        return flowsPctg;
    }
    public void setHostsPctg(Long hostsPctg) 
    {
        this.hostsPctg = hostsPctg;
    }

    public Long getHostsPctg() 
    {
        return hostsPctg;
    }
    public void setPeriodicStatsUpdateFrequencySecs(Long periodicStatsUpdateFrequencySecs) 
    {
        this.periodicStatsUpdateFrequencySecs = periodicStatsUpdateFrequencySecs;
    }

    public Long getPeriodicStatsUpdateFrequencySecs() 
    {
        return periodicStatsUpdateFrequencySecs;
    }
    public void setBytes(Long bytes) 
    {
        this.bytes = bytes;
    }

    public Long getBytes() 
    {
        return bytes;
    }
    public void setRemoteBps(Long remoteBps) 
    {
        this.remoteBps = remoteBps;
    }

    public Long getRemoteBps() 
    {
        return remoteBps;
    }
    public void setAlertedFlows(Long alertedFlows) 
    {
        this.alertedFlows = alertedFlows;
    }

    public Long getAlertedFlows() 
    {
        return alertedFlows;
    }
    public void setEngagedAlerts(Long engagedAlerts) 
    {
        this.engagedAlerts = engagedAlerts;
    }

    public Long getEngagedAlerts() 
    {
        return engagedAlerts;
    }
    public void setTcpPacketOutOfOrder(Long tcpPacketOutOfOrder) 
    {
        this.tcpPacketOutOfOrder = tcpPacketOutOfOrder;
    }

    public Long getTcpPacketOutOfOrder() 
    {
        return tcpPacketOutOfOrder;
    }
    public void setTcpPacketLost(Long tcpPacketLost) 
    {
        this.tcpPacketLost = tcpPacketLost;
    }

    public Long getTcpPacketLost() 
    {
        return tcpPacketLost;
    }
    public void setTcpPacketRetransmissions(Long tcpPacketRetransmissions) 
    {
        this.tcpPacketRetransmissions = tcpPacketRetransmissions;
    }

    public Long getTcpPacketRetransmissions() 
    {
        return tcpPacketRetransmissions;
    }

    @Override
    public String toString() {
        return "InterfaceData{" +
                "id=" + id +
                ", time=" + time +
                ", ifId=" + ifId +
                ", ifName='" + ifName + '\'' +
                ", uptime='" + uptime + '\'' +
                ", numFlows=" + numFlows +
                ", numDevices=" + numDevices +
                ", numLiveCaptures=" + numLiveCaptures +
                ", numHosts=" + numHosts +
                ", droppedAlerts=" + droppedAlerts +
                ", epoch=" + epoch +
                ", alertedFlowsNotice=" + alertedFlowsNotice +
                ", alertedFlowsWarning=" + alertedFlowsWarning +
                ", speed=" + speed +
                ", packets=" + packets +
                ", bytesDownload=" + bytesDownload +
                ", bytesUpload=" + bytesUpload +
                ", packetsDownload=" + packetsDownload +
                ", packetsUpload=" + packetsUpload +
                ", local2remote=" + local2remote +
                ", remote2local=" + remote2local +
                ", throughputBps=" + throughputBps +
                ", throughputPps=" + throughputPps +
                ", drops=" + drops +
                ", flowsPctg=" + flowsPctg +
                ", hostsPctg=" + hostsPctg +
                ", periodicStatsUpdateFrequencySecs=" + periodicStatsUpdateFrequencySecs +
                ", bytes=" + bytes +
                ", remoteBps=" + remoteBps +
                ", alertedFlows=" + alertedFlows +
                ", engagedAlerts=" + engagedAlerts +
                ", tcpPacketOutOfOrder=" + tcpPacketOutOfOrder +
                ", tcpPacketLost=" + tcpPacketLost +
                ", tcpPacketRetransmissions=" + tcpPacketRetransmissions +
                ", systemHostStats=" + systemHostStats +
                '}';
    }
}
