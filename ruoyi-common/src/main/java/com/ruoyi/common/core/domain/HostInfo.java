package com.ruoyi.common.core.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 host_info
 *
 * @author ruoyi
 * @date 2021-01-22
 */
public class HostInfo extends BaseEntity {
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
    private String mac;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ifId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long localNetworkName;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcpBytesSentAnomalyIndex;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long activeAlertedFlows;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long seenFirst;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long seenLast;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packetsSent;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bytesSent;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packetsRcvd;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bytesRcvd;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long activeFlowsAsClient;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalFlowsAsClient;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long alertedFlowsAsClient;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long unreachableFlowsAsClient;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long activeFlowsAsServer;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalFlowsAsServer;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long alertedFlowsAsServer;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long unreachableFlowsAsServer;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long contactsAsClient;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long contactsAsServer;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsSentOutOfOrder;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsSentLost;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsSentRetransmissions;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsSentKeepAlive;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsRcvdOutOfOrder;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsRcvdLost;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsRcvdRetransmissions;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tcppacketstatsRcvdKeepAlive;

    public HostInfo() {
    }

    public HostInfo(Long time, String mac, Long ifId, String ip, Long localNetworkName, String name,
                    Long tcpBytesSentAnomalyIndex, Long activeAlertedFlows, Long seenFirst, Long seenLast, Long packetsSent,
                    Long bytesSent, Long packetsRcvd, Long bytesRcvd, Long activeFlowsAsClient, Long totalFlowsAsClient,
                    Long alertedFlowsAsClient, Long unreachableFlowsAsClient, Long activeFlowsAsServer, Long totalFlowsAsServer,
                    Long alertedFlowsAsServer, Long unreachableFlowsAsServer, Long contactsAsClient, Long contactsAsServer,
                    Long tcppacketstatsSentOutOfOrder, Long tcppacketstatsSentLost, Long tcppacketstatsSentRetransmissions,
                    Long tcppacketstatsSentKeepAlive, Long tcppacketstatsRcvdOutOfOrder, Long tcppacketstatsRcvdLost,
                    Long tcppacketstatsRcvdRetransmissions, Long tcppacketstatsRcvdKeepAlive) {
        this.time = time;
        this.mac = mac;
        this.ifId = ifId;
        this.ip = ip;
        this.localNetworkName = localNetworkName;
        this.name = name;
        this.tcpBytesSentAnomalyIndex = tcpBytesSentAnomalyIndex;
        this.activeAlertedFlows = activeAlertedFlows;
        this.seenFirst = seenFirst;
        this.seenLast = seenLast;
        this.packetsSent = packetsSent;
        this.bytesSent = bytesSent;
        this.packetsRcvd = packetsRcvd;
        this.bytesRcvd = bytesRcvd;
        this.activeFlowsAsClient = activeFlowsAsClient;
        this.totalFlowsAsClient = totalFlowsAsClient;
        this.alertedFlowsAsClient = alertedFlowsAsClient;
        this.unreachableFlowsAsClient = unreachableFlowsAsClient;
        this.activeFlowsAsServer = activeFlowsAsServer;
        this.totalFlowsAsServer = totalFlowsAsServer;
        this.alertedFlowsAsServer = alertedFlowsAsServer;
        this.unreachableFlowsAsServer = unreachableFlowsAsServer;
        this.contactsAsClient = contactsAsClient;
        this.contactsAsServer = contactsAsServer;
        this.tcppacketstatsSentOutOfOrder = tcppacketstatsSentOutOfOrder;
        this.tcppacketstatsSentLost = tcppacketstatsSentLost;
        this.tcppacketstatsSentRetransmissions = tcppacketstatsSentRetransmissions;
        this.tcppacketstatsSentKeepAlive = tcppacketstatsSentKeepAlive;
        this.tcppacketstatsRcvdOutOfOrder = tcppacketstatsRcvdOutOfOrder;
        this.tcppacketstatsRcvdLost = tcppacketstatsRcvdLost;
        this.tcppacketstatsRcvdRetransmissions = tcppacketstatsRcvdRetransmissions;
        this.tcppacketstatsRcvdKeepAlive = tcppacketstatsRcvdKeepAlive;
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

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }

    public void setIfId(Long ifId) {
        this.ifId = ifId;
    }

    public Long getIfId() {
        return ifId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setLocalNetworkName(Long localNetworkName) {
        this.localNetworkName = localNetworkName;
    }

    public Long getLocalNetworkName() {
        return localNetworkName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTcpBytesSentAnomalyIndex(Long tcpBytesSentAnomalyIndex) {
        this.tcpBytesSentAnomalyIndex = tcpBytesSentAnomalyIndex;
    }

    public Long getTcpBytesSentAnomalyIndex() {
        return tcpBytesSentAnomalyIndex;
    }

    public void setActiveAlertedFlows(Long activeAlertedFlows) {
        this.activeAlertedFlows = activeAlertedFlows;
    }

    public Long getActiveAlertedFlows() {
        return activeAlertedFlows;
    }

    public void setSeenFirst(Long seenFirst) {
        this.seenFirst = seenFirst;
    }

    public Long getSeenFirst() {
        return seenFirst;
    }

    public void setSeenLast(Long seenLast) {
        this.seenLast = seenLast;
    }

    public Long getSeenLast() {
        return seenLast;
    }

    public void setPacketsSent(Long packetsSent) {
        this.packetsSent = packetsSent;
    }

    public Long getPacketsSent() {
        return packetsSent;
    }

    public void setBytesSent(Long bytesSent) {
        this.bytesSent = bytesSent;
    }

    public Long getBytesSent() {
        return bytesSent;
    }

    public void setPacketsRcvd(Long packetsRcvd) {
        this.packetsRcvd = packetsRcvd;
    }

    public Long getPacketsRcvd() {
        return packetsRcvd;
    }

    public void setBytesRcvd(Long bytesRcvd) {
        this.bytesRcvd = bytesRcvd;
    }

    public Long getBytesRcvd() {
        return bytesRcvd;
    }

    public void setActiveFlowsAsClient(Long activeFlowsAsClient) {
        this.activeFlowsAsClient = activeFlowsAsClient;
    }

    public Long getActiveFlowsAsClient() {
        return activeFlowsAsClient;
    }

    public void setTotalFlowsAsClient(Long totalFlowsAsClient) {
        this.totalFlowsAsClient = totalFlowsAsClient;
    }

    public Long getTotalFlowsAsClient() {
        return totalFlowsAsClient;
    }

    public void setAlertedFlowsAsClient(Long alertedFlowsAsClient) {
        this.alertedFlowsAsClient = alertedFlowsAsClient;
    }

    public Long getAlertedFlowsAsClient() {
        return alertedFlowsAsClient;
    }

    public void setUnreachableFlowsAsClient(Long unreachableFlowsAsClient) {
        this.unreachableFlowsAsClient = unreachableFlowsAsClient;
    }

    public Long getUnreachableFlowsAsClient() {
        return unreachableFlowsAsClient;
    }

    public void setActiveFlowsAsServer(Long activeFlowsAsServer) {
        this.activeFlowsAsServer = activeFlowsAsServer;
    }

    public Long getActiveFlowsAsServer() {
        return activeFlowsAsServer;
    }

    public void setTotalFlowsAsServer(Long totalFlowsAsServer) {
        this.totalFlowsAsServer = totalFlowsAsServer;
    }

    public Long getTotalFlowsAsServer() {
        return totalFlowsAsServer;
    }

    public void setAlertedFlowsAsServer(Long alertedFlowsAsServer) {
        this.alertedFlowsAsServer = alertedFlowsAsServer;
    }

    public Long getAlertedFlowsAsServer() {
        return alertedFlowsAsServer;
    }

    public void setUnreachableFlowsAsServer(Long unreachableFlowsAsServer) {
        this.unreachableFlowsAsServer = unreachableFlowsAsServer;
    }

    public Long getUnreachableFlowsAsServer() {
        return unreachableFlowsAsServer;
    }

    public void setContactsAsClient(Long contactsAsClient) {
        this.contactsAsClient = contactsAsClient;
    }

    public Long getContactsAsClient() {
        return contactsAsClient;
    }

    public void setContactsAsServer(Long contactsAsServer) {
        this.contactsAsServer = contactsAsServer;
    }

    public Long getContactsAsServer() {
        return contactsAsServer;
    }

    public void setTcppacketstatsSentOutOfOrder(Long tcppacketstatsSentOutOfOrder) {
        this.tcppacketstatsSentOutOfOrder = tcppacketstatsSentOutOfOrder;
    }

    public Long getTcppacketstatsSentOutOfOrder() {
        return tcppacketstatsSentOutOfOrder;
    }

    public void setTcppacketstatsSentLost(Long tcppacketstatsSentLost) {
        this.tcppacketstatsSentLost = tcppacketstatsSentLost;
    }

    public Long getTcppacketstatsSentLost() {
        return tcppacketstatsSentLost;
    }

    public void setTcppacketstatsSentRetransmissions(Long tcppacketstatsSentRetransmissions) {
        this.tcppacketstatsSentRetransmissions = tcppacketstatsSentRetransmissions;
    }

    public Long getTcppacketstatsSentRetransmissions() {
        return tcppacketstatsSentRetransmissions;
    }

    public void setTcppacketstatsSentKeepAlive(Long tcppacketstatsSentKeepAlive) {
        this.tcppacketstatsSentKeepAlive = tcppacketstatsSentKeepAlive;
    }

    public Long getTcppacketstatsSentKeepAlive() {
        return tcppacketstatsSentKeepAlive;
    }

    public void setTcppacketstatsRcvdOutOfOrder(Long tcppacketstatsRcvdOutOfOrder) {
        this.tcppacketstatsRcvdOutOfOrder = tcppacketstatsRcvdOutOfOrder;
    }

    public Long getTcppacketstatsRcvdOutOfOrder() {
        return tcppacketstatsRcvdOutOfOrder;
    }

    public void setTcppacketstatsRcvdLost(Long tcppacketstatsRcvdLost) {
        this.tcppacketstatsRcvdLost = tcppacketstatsRcvdLost;
    }

    public Long getTcppacketstatsRcvdLost() {
        return tcppacketstatsRcvdLost;
    }

    public void setTcppacketstatsRcvdRetransmissions(Long tcppacketstatsRcvdRetransmissions) {
        this.tcppacketstatsRcvdRetransmissions = tcppacketstatsRcvdRetransmissions;
    }

    public Long getTcppacketstatsRcvdRetransmissions() {
        return tcppacketstatsRcvdRetransmissions;
    }

    public void setTcppacketstatsRcvdKeepAlive(Long tcppacketstatsRcvdKeepAlive) {
        this.tcppacketstatsRcvdKeepAlive = tcppacketstatsRcvdKeepAlive;
    }

    public Long getTcppacketstatsRcvdKeepAlive() {
        return tcppacketstatsRcvdKeepAlive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("time", getTime())
                .append("mac", getMac())
                .append("ifId", getIfId())
                .append("ip", getIp())
                .append("localNetworkName", getLocalNetworkName())
                .append("name", getName())
                .append("tcpBytesSentAnomalyIndex", getTcpBytesSentAnomalyIndex())
                .append("activeAlertedFlows", getActiveAlertedFlows())
                .append("seenFirst", getSeenFirst())
                .append("seenLast", getSeenLast())
                .append("packetsSent", getPacketsSent())
                .append("bytesSent", getBytesSent())
                .append("packetsRcvd", getPacketsRcvd())
                .append("bytesRcvd", getBytesRcvd())
                .append("activeFlowsAsClient", getActiveFlowsAsClient())
                .append("totalFlowsAsClient", getTotalFlowsAsClient())
                .append("alertedFlowsAsClient", getAlertedFlowsAsClient())
                .append("unreachableFlowsAsClient", getUnreachableFlowsAsClient())
                .append("activeFlowsAsServer", getActiveFlowsAsServer())
                .append("totalFlowsAsServer", getTotalFlowsAsServer())
                .append("alertedFlowsAsServer", getAlertedFlowsAsServer())
                .append("unreachableFlowsAsServer", getUnreachableFlowsAsServer())
                .append("contactsAsClient", getContactsAsClient())
                .append("contactsAsServer", getContactsAsServer())
                .append("tcppacketstatsSentOutOfOrder", getTcppacketstatsSentOutOfOrder())
                .append("tcppacketstatsSentLost", getTcppacketstatsSentLost())
                .append("tcppacketstatsSentRetransmissions", getTcppacketstatsSentRetransmissions())
                .append("tcppacketstatsSentKeepAlive", getTcppacketstatsSentKeepAlive())
                .append("tcppacketstatsRcvdOutOfOrder", getTcppacketstatsRcvdOutOfOrder())
                .append("tcppacketstatsRcvdLost", getTcppacketstatsRcvdLost())
                .append("tcppacketstatsRcvdRetransmissions", getTcppacketstatsRcvdRetransmissions())
                .append("tcppacketstatsRcvdKeepAlive", getTcppacketstatsRcvdKeepAlive())
                .toString();
    }
}
