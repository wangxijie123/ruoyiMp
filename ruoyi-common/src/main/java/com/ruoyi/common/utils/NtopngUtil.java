package com.ruoyi.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.HttpResult;
import com.ruoyi.common.utils.sign.Base64;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;


/**
 * 轻量化网管
 * Ntopng api单元
 */
public class NtopngUtil {

    private final static String host = "http://112.13.167.87:9002";
    private final static String user = "admin";
    private final static String pass = "Admin@junction";
    private static String auth = "";

    /*==================================Interfaces==========================*/
    //get interface data
    private final static String url_interface_data = "/lua/rest/v1/get/interface/data.lua";
    //get interface IP addresses
    private final static String url_interface_address = "/lua/rest/v1/get/interface/address.lua";
    //get L7 statistics for an interface
    private final static String url_interface_stat_l7 = "/lua/rest/v1/get/interface/l7/stats.lua";
    //get IP DSCP statistics for an interface
    private final static String url_interface_stat_dscp = "/lua/rest/v1/get/interface/dscp/stats.lua";
    //get ntopng actively monitored interfaces names and ids
    private final static String url_interface_interfaces = "/lua/rest/v1/get/ntopng/interfaces.lua";

    /*==================================Hosts==================================*/
    //get active hosts
    private final static String url_host_hosts = "/lua/rest/v1/get/host/active.lua";
    //get host interfaces
    private final static String url_host_interfaces = "/lua/rest/v1/get/host/interfaces.lua";
    //get host data
    private final static String url_host_data = "/lua/rest/v1/get/host/data.lua";
    //get host custom data
    private final static String url_host_custom_data = "/lua/rest/v1/get/host/custom_data.lua";
    //get L7 statistics for a host
    private final static String url_host_stats_l7 = "/lua/rest/v1/get/host/l7/stats.lua";
    //get DSCP statistics for a host
    private final static String url_host_stats_dscp = "/lua/rest/v1/get/host/dscp/stats.lua";

    /*=====================================Alerts==================================*/
    //get alerts data
    private final static String url_alert_data = "/lua/rest/v1/get/alert/data.lua";
    //get alerts timeseries
    private final static String url_alert_ts = "/lua/rest/v1/get/alert/ts.lua";
    //get alert type constants
    private final static String url_alert_type_consts = "/lua/rest/v1/get/alert/type/consts.lua";
    //get alert sererity constants
    private final static String url_alert_serverity_consts="/lua/rest/v1/get/alert/severity/consts.lua";
    //get counters per type
    private final static String url_alert_per_type="/lua/rest/v1/get/alert/type/counters.lua";
    //get counters per serverity
    private final static String url_alert_serverity_counters="/lua/rest/v1/get/alert/severity/counters.lua";

    /*====================================Flows=============================*/
    //Get active flows
    /*
    * Name	Position	Description	Type
ifid	query	Interface identifier	integer
currentPage	query	Pagination: page (optional)	integer
perPage	query	Pagination: items per page (optional)	integer
sortColumn	query	Pagination: column for sorting (e.g. ‘score’) (optional)	string
sortOrder	query	Pagination: sorting order: ‘asc’ or ‘desc’ (optional)	string
host	query	Host address filter (optional)	string
vlan	query	VLAN ID filter (optional)	integer
l4proto	query	L4 protocol filter (optional)	string
application	query	Application protocol filter (optional)	string
verbose	query	Add more details including TCP stats (optional)	boolean
* */
    private final static String url_flow_active = "/lua/rest/v1/get/flow/active.lua";
    //Get flow counters for L4 protocols
    /*
    Parameters

Name	Position	Description	Type
ifid	query	Interface identifier	integer
    * */
    private final static String url_flow_l4_counters = "/lua/rest/v1/get/flow/l4/counters.lua";
    //Get flow counters for L7 protocols
    /*ifid	query	Interface identifier	integer
    * */
    private final static String url_flow_l7_counters = "/lua/rest/v1/get/flow/l7/counters.lua";

    //GET /lua/pro/rest/v1/get/db/topk_flows.lua
    /**
     * Get Top-K flows data. Columns include (but are not limited to) IP_PROTOCOL_VERSION, FLOW_TIME, FIRST_SEEN, LAST_SEEN, VLAN_ID, PACKETS, TOTAL_BYTES, SRC2DST_BYTES, DST2SRC_BYTES, IPV4_SRC_ADDR, IPV4_DST_ADDR, IPV6_SRC_ADDR, IPV6_DST_ADDR, PROTOCOL, L7_PROTO
     *
     * Name	Position	Description	Type
     * ifid	query	Interface identifier	integer
     * begin_time_clause	query	Start time (epoch)	integer
     * end_time_clause	query	Start time (epoch)	integer
     * select_keys_clause	query	Select comma-separated keys list (default: IPV4_SRC_ADDR,IPV4_DST_ADDR,L7_PROTO)	string
     * select_values_clause	query	Select value (default: BYTES)	string
     * where_clause	query	Where clause (default: none)	string
     * topk_clause	query	Top-K clause (default: SUM)	string
     * approx_search	query	Approximate search (default: true)	string
     * maxhits_clause	query	Max hits (default: 10)
     *
     */
    private final static String url_flow_db_topk_flows = "/lua/pro/rest/v1/get/db/topk_flows.lua";
    //Live PCAP traffic extraction
    /**
     * ifid	query	Interface identifier	integer
     * epoch_begin	query	Start time (epoch)	integer
     * epoch_end	query	Start time (epoch)	integer
     * bpf_filter	query	BPF filter	string
     */
    private final static String url_flow_pcap_live_extraction = "/lua/rest/v1/get/pcap/live_extraction.lua";

    /*=======================================Protocols==================================*/
    //Get L4 protocol constants
    private final static String url_flow_proto_l4 = "/lua/rest/v1/get/l4/protocol/consts.lua";
    //Get L7 application protocol constants
    private final static String url_flow_proto_l7 = "/lua/rest/v1/get/l7/application/consts.lua";
    //Get L7 application category constants
    private final static String url_flow_category_consts = "/lua/rest/v1/get/l7/category/consts.lua";
    //Get one or all interface pools
    private final static String url_flow_interface_pools = "/lua/rest/v1/get/interface/pools.lua";

    /*========================================Pools======================================*/
    //Get one or all host pools
    private final static String url_flow_host_pools = "/lua/rest/v1/get/host/pools.lua";
    //Get one or all local network pools
    private final static String url_flow_network_pools = "/lua/rest/v1/get/network/pools.lua";
    //Get all pools of any type
    private final static String url_flow_pools = "/lua/rest/v1/get/pools.lua";
    //Get one or all active monitoring pools
    private final static String url_flow_active_monitoring_pools = "/lua/rest/v1/get/active_monitoring/pool.lua";
    //Get one or all flow pools
    private final static String url_flow_flow_pools = "/lua/rest/v1/get/flow/pools.lua";
    //Get one or all MAC pools
    private final static String url_flow_mac_pools = "/lua/rest/v1/get/mac/pools.lua";
    //Get one or all host pool pools
    private final static String url_flow_host_pool_pools = "/lua/rest/v1/get/host_pool/pools.lua";
    //Get one or all system pools
    private final static String url_flow_system_pools = "/lua/rest/v1/get/system/pools.lua";
    //Get all host pool members
    private final static String url_flow_host_pool_members = "/lua/rest/v1/get/host/pool/members.lua";
    //Get an host pool given a member
    private final static String url_flow_pool_by_member = "/lua/rest/v1/get/host/pool_by_member.lua";

    /**
     *
     * @param url
     * @return
     */
    public static JSONObject ntopng_getData(String url){
        if(StringUtils.isEmpty(auth)){
            auth = user + ":" + pass;
            byte[] binaryData = new byte[0];
            try {
                binaryData = auth.getBytes("utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            auth = Base64.encode(binaryData);
            System.out.println("create auth:" + auth);
        }
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Basic " + auth);
        try {
            HttpResult result = HttpUtil.doGet(HttpUtil.getHttpClient(), url, headers);
            JSONObject json = JSONObject.parseObject(result.getData());
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 拼接字符串
     * 如果value不为空，则拼接成 param=value的格式
     * @param url
     * @param param
     * @param value
     * @return
     */
    public static String joinUrl(String url, String param, String value){
        if(StringUtils.isNotEmpty(value)){
            url = StringUtils.format("{}&{}={}", url, param, value);
        }
        return url;
    }
    /**
     * get interface data
     *
     * @param ifid interface identifier
     * @return
     */
    public static JSONObject ntopng_interface_data(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_interface_data, ifid);
        return ntopng_getData(url);
    }

    /**
     * get interface IP addresses
     * @param ifid
     * @return
     */
    public static JSONObject ntopng_interface_address(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_interface_address, ifid);
        return ntopng_getData(url);
    }

    /**
     *
     * @param ifid
     * @param ndpistats_mode
     * @return
     */
    public static JSONObject ntopng_interface_stats_l7(String ifid, String ndpistats_mode){
        String url = StringUtils.format("{}{}?ifid={}&ndpistats_mode={}", host, url_interface_stat_l7, ifid, ndpistats_mode);
        return ntopng_getData(url);
    }

    /**
     * get IP DSCP statistics for an interface
     * @param ifid
     * @return
     */
    public static JSONObject ntopng_stats_dscp(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_interface_stat_dscp, ifid);
        return ntopng_getData(url);
    }

    /**
     * get ntopng actively monitored interfaces names and ids
     * @return
     */
    public static JSONObject ntopng_interface_interfaces(){
        String url = StringUtils.format("{}{}", host, url_interface_interfaces);
        return ntopng_getData(url);
    }

    /**
     * get active hosts
     * @param ifid  interface identifier
     * @param currentPage page(optional)
     * @param prePage     items pre page(optional)
     * @param sortColumn  column for sorting(e.g. ip, name, since, last, alerts, country, vlan, num_flows, traffic, thpt)(optional)
     * @param sortOrder   sorting order: ‘asc’ or ‘desc’ (optional)
     * @param all         Get all hosts (optional)
     * @param mode        Mode filter: all, local, remote, broadcast_domain, filtered, blacklisted, dhcp (optional)
     * @return
     */
    public static JSONObject ntopng_interface_hosts(String ifid, String currentPage, String prePage, String sortColumn,
                                           String sortOrder, String all, String mode){
        String url = StringUtils.format("{}{}?ifid={}", host, url_host_hosts, ifid);
        url = joinUrl(url, "currentPage", currentPage);
        url = joinUrl(url, "prePage", prePage);
        url = joinUrl(url, "sortColumn", sortColumn);
        url = joinUrl(url, "sortOrder", sortOrder);
        url = joinUrl(url, "all", all);
        url = joinUrl(url, "mode", mode);
        System.out.println(url);

        return ntopng_getData(url);
    }

    /**
     * get host interfaces
     * @param hostip   Host address
     * @return
     */
    public static JSONObject ntopng_host_interfaces(String hostip){
        String url = StringUtils.format("{}{}?host={}", host, url_host_interfaces, hostip);
        return ntopng_getData(url);
    }

    /**
     * 获取指定主机的数据，对应页面：
     *    http://112.13.167.87:9002/lua/host_details.lua?host=10.76.135.45
     * @param ifid
     * @param hostip  Host address
     * @return
     */
    public static JSONObject ntopng_host_data(String ifid, String hostip){
        String url = StringUtils.format("{}{}?ifid={}&host={}", host, url_host_data, ifid, hostip);
        return ntopng_getData(url);
    }

    /**
     *
     * @param ifid        interface identifier
     * @param hostip      host address
     * @param field_alias field alias
     * @return
     */
    public static JSONObject ntopng_host_custom_data(String ifid, String hostip, String field_alias){
        String url = StringUtils.format("{}{}?ifid={}&host={}&field_alias={}", host, url_host_custom_data, ifid, hostip, field_alias);
        return ntopng_getData(url);
    }

    /**
     * get L7 statistics for a host
     * @param ifid           interface identifier
     * @param hostip         Host address
     * @param vlan           VLAN ID(optional)
     * @param breed          show breed(optional)
     * @param ndpi_category  Show nDPI category(optional)
     * @return
     */
    public static JSONObject ntopng_host_static_l7(String ifid, String hostip, String vlan, String breed, String ndpi_category){
        String url = StringUtils.format("{}{}?ifid={}&host={}", host, url_host_stats_l7, ifid, hostip);
        url = joinUrl(url, "vlan", vlan);
        url = joinUrl(url, "breed", breed);
        url = joinUrl(url, "ndpi_category", ndpi_category);

        return ntopng_getData(url);
    }

    /**
     *
     * @param ifid
     * @param hostip
     * @param vlan
     * @param direction  Select direction: 'sent" or "recvd'(default)
     * @return
     */
    public static JSONObject ntopng_host_static_dscp(String ifid, String hostip, String vlan, String direction){
        String url = StringUtils.format("{}{}?ifid={}&host={}", host, url_host_stats_dscp, ifid, hostip);
        url = joinUrl(url, "vlan", vlan);
        url = joinUrl(url, "direction", direction);

        return ntopng_getData(url);
    }

    /**
     * get alerts data
     * @param ifid             interface identifier
     * @param status           status filter(historical, historical-flows, engaged)
     * @param epoch_begin      Start time (epoch) (optional)
     * @param epoch_end        End time (epoch) (optional)
     * @param alert_type       Alert Type (optional)
     * @param alert_serverity  Alert Severity (optional)
     * @return
     */
    public static JSONObject ntopng_alert_data(String ifid, String status, String epoch_begin, String epoch_end, String alert_type, String alert_serverity){
        String url = StringUtils.format("{}{}?ifid={}&status={}", host, url_alert_data, ifid, status);

        url = joinUrl(url, "epoch_begin", epoch_begin);
        url = joinUrl(url, "epoch_end", epoch_end);
        url = joinUrl(url, "alert_type", alert_type);
        url = joinUrl(url, "alert_serverity", alert_serverity);

        return ntopng_getData(url);
    }
    //====

    /**
     * Get active flows
     * @param ifid           query	Interface identifier	integer
     * @param currentPage    Pagination: page (optional)	integer
     * @param perPage        Pagination: items per page (optional)	integer
     * @param sortColumn     Pagination: column for sorting (e.g. ‘score’) (optional)	string
     * @param sortOrder      Pagination: sorting order: ‘asc’ or ‘desc’ (optional)	string
     * @param vhost           Host address filter (optional)	string
     * @param vlan           VLAN ID filter (optional)	integer
     * @param l4proto        L4 protocol filter (optional)	string
     * @param application    Application protocol filter (optional)	string
     * @param verbose        Add more details including TCP stats (optional)	boolean
     * @return
     */
    public static JSONObject ntopng_flow_active(String ifid, String currentPage, String perPage, String sortColumn, String sortOrder,
                                                String vhost, String vlan, String l4proto, String application, String verbose){
        String url = StringUtils.format("{}{}?ifid={}", host, url_flow_active, ifid);
        url = joinUrl(url, "currentPage", currentPage);
        url = joinUrl(url, "perPage", perPage);
        url = joinUrl(url, "sortColumn", sortColumn);
        url = joinUrl(url, "sortOrder", sortOrder);
        url = joinUrl(url, "host", vhost);
        url = joinUrl(url, "vlan", vlan);
        url = joinUrl(url, "l4proto", l4proto);
        url = joinUrl(url, "application", application);
        url = joinUrl(url, "verbose", verbose);
        return ntopng_getData(url);
    }

    /**
     * Get flow counters for L4 protocols
     * @param ifid    ifid	query	Interface identifier	integer
     * @return
     */
    public static JSONObject ntopng_flow_l4_counters(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_flow_l4_counters, ifid);

        return ntopng_getData(url);
    }

    /**
     * Get flow counters for L7 protocols
     * @param ifid
     * @return
     */
    public static JSONObject ntopng_flow_l7_counters(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_flow_l7_counters, ifid);

        return ntopng_getData(url);
    }

    /**
     * Get Top-K flows data.
     * Columns include (but are not limited to) IP_PROTOCOL_VERSION, FLOW_TIME, FIRST_SEEN, LAST_SEEN, VLAN_ID, PACKETS,
     *                                          TOTAL_BYTES, SRC2DST_BYTES, DST2SRC_BYTES, IPV4_SRC_ADDR, IPV4_DST_ADDR,
     *                                          IPV6_SRC_ADDR, IPV6_DST_ADDR, PROTOCOL, L7_PROTO
     * @param ifid                   Interface identifier	integer
     * @param begin_time_clause      Start time (epoch)	integer
     * @param end_time_clause        End time (epoch)	integer
     * @param select_keys_clause     Select comma-separated keys list (default: IPV4_SRC_ADDR,IPV4_DST_ADDR,L7_PROTO)	string
     * @param select_values_clause   Select value (default: BYTES)	string
     * @param where_clause           Where clause (default: none)	string
     * @param topk_clause            Top-K clause (default: SUM)	string
     * @param approx_search          Approximate search (default: true)	string
     * @param maxhits_clause         Max hits (default: 10)
     * @return
     */
    public static JSONObject ntopng_flow_db_topk_flows(String ifid, String begin_time_clause, String end_time_clause,
                                                       String select_keys_clause, String select_values_clause,
                                                       String where_clause, String topk_clause, String approx_search, String maxhits_clause){
        String url = StringUtils.format("{}{}?ifid={}", host, url_flow_db_topk_flows, ifid);
        url = joinUrl(url, "begin_time_clause", begin_time_clause);
        url = joinUrl(url, "end_time_clause", end_time_clause);
        url = joinUrl(url, "select_keys_clause", select_keys_clause);
        url = joinUrl(url, "select_values_clause", select_values_clause);
        url = joinUrl(url, "where_clause", where_clause);
        url = joinUrl(url, "topk_clause", topk_clause);
        url = joinUrl(url, "approx_search", approx_search);
        url = joinUrl(url, "maxhits_clause", maxhits_clause);
        return ntopng_getData(url);
    }

    /**
     * Live PCAP traffic extraction
     * @param ifid         Interface identifier	integer
     * @param epoch_begin  Start time (epoch)	integer
     * @param epoch_end    Start time (epoch)	integer
     * @param bpf_filter   BPF filter	string
     * @return
     */
    public static JSONObject ntopng_flow_pcap_live_extraction(String ifid, String epoch_begin, String epoch_end, String bpf_filter){
        String url = StringUtils.format("{}{}?ifid={}&epoch_begin={}&epoch_end={}&bpf_filter={}", host, url_flow_pcap_live_extraction,
                ifid, epoch_begin, epoch_end,bpf_filter);
        return ntopng_getData(url);
    }

    /**
     * Get L4 protocol constants
     * @param ifid
     * @return
     */
    public static JSONObject ntopng_flow_proto_l4(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_flow_proto_l4, ifid);
        return ntopng_getData(url);
    }

    /**
     * Get L7 application protocol constants
     * @param ifid
     * @return
     */
    public static JSONObject ntopng_flow_proto_l7(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_flow_proto_l7, ifid);
        return ntopng_getData(url);
    }
    /**
     *Get L7 application category constants
     * @param ifid
     * @return
     */
    public static JSONObject ntopng_flow_category_consts(String ifid){
        String url = StringUtils.format("{}{}?ifid={}", host, url_flow_category_consts, ifid);
        return ntopng_getData(url);
    }
    /**
     *Get one or all interface pools
     * @return
     */
    public static JSONObject ntopng_flow_interface_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_interface_pools);
        return ntopng_getData(url);
    }
    /**
     *Get one or all host pools
     * @return
     */
    public static JSONObject ntopng_flow_host_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_host_pools);
        return ntopng_getData(url);
    }
    /**
     *Get one or all local network pools
     * @return
     */
    public static JSONObject ntopng_flow_network_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_network_pools);
        return ntopng_getData(url);
    }
    /**
     *Get all pools of any type
     * @return
     */
    public static JSONObject ntopng_flow_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_pools);
        return ntopng_getData(url);
    }
    /**
     *Get one or all active monitoring pools
     * @return
     */
//    public static JSONObject ntopng_flow_active_monitoring_pools(){
//        String url = StringUtils.format("{}{}", host, url_flow_active_monitoring_pools);
//        return ntopng_getData(url);
//    }
    /**
     *Get one or all flow pools
     * @return
     */
    public static JSONObject ntopng_flow_flow_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_flow_pools);
        return ntopng_getData(url);
    }
    //

    /**
     *Get one or all MAC pools
     * @return
     */
    public static JSONObject ntopng_flow_mac_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_mac_pools);
        return ntopng_getData(url);
    }
    /**
     *Get one or all host pool pools
     * @return
     */
    public static JSONObject ntopng_flow_host_pool_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_host_pool_pools);
        return ntopng_getData(url);
    }
    /**
     *Get one or all system pools
     * @return
     */
    public static JSONObject ntopng_flow_system_pools(){
        String url = StringUtils.format("{}{}", host, url_flow_system_pools);
        return ntopng_getData(url);
    }
    /**
     *Get all host pool members
     * @return
     */
    public static JSONObject ntopng_flow_host_pool_members(){
        String url = StringUtils.format("{}{}", host, url_flow_host_pool_members);
        return ntopng_getData(url);
    }
    /**
     *Get an host pool given a member
     * @return
     */
    public static JSONObject ntopng_flow_pool_by_member(){
        String url = StringUtils.format("{}{}", host, url_flow_pool_by_member);
        return ntopng_getData(url);
    }

    public static void main(String[] args) {
        JSONObject json = null;
//
//        System.out.println("ntopng_interface_data");
//        json = ntopng_interface_data("0");
//        System.out.println(json);

//        System.out.println("ntopng_alert_data");
//        json = ntopng_alert_data("0", "historical", "", "", "", "");
//        System.out.println(json);

        System.out.println("ntopng_interface_hosts");
        json = ntopng_interface_hosts("0", "", "", "","", "", "");
        System.out.println(json);
//
//        System.out.println("ntopng_host_data");
//        json = ntopng_host_data("0", "10.76.135.45");
//        System.out.println(json);
        /*

        json = json.getJSONObject("rsp");
//        System.out.println(json.getTimestamp("localtime"));
        System.out.println("ntopng_interface_address");
        json = ntopng_interface_address("0");
        System.out.println(json);
        System.out.println("ntopng_interface_stats_l7");
        json = ntopng_interface_stats_l7("0", "count");
        System.out.println(json);
        System.out.println("ntopng_stats_dscp");
        json = ntopng_stats_dscp("0");
        System.out.println(json);
        System.out.println("ntopng_interface_interfaces");
        json = ntopng_interface_interfaces();
        System.out.println(json);

//        System.out.println("ntopng_host_interfaces");
//        json = ntopng_host_interfaces("0");
//        System.out.println(json);
        System.out.println("ntopng_host_data");
        json = ntopng_host_data("0", "10.76.135.45");
        System.out.println(json);
//        System.out.println("ntopng_host_custom_data");
//        json = ntopng_host_custom_data("0", "10.76.135.45", "");
//        System.out.println(json);
        //
        System.out.println("ntopng_host_static_l7");
        json = ntopng_host_static_l7("0", "10.76.135.45", "", "", "");
        System.out.println(json);
        System.out.println("ntopng_host_static_dscp");
        json = ntopng_host_static_dscp("0", "10.76.135.45", "0", "sent");
        System.out.println(json);

//        System.out.println("");
//        json = ntopng_flow_active("0", "", "", "", "", "", "", "", "", "");
//        System.out.println(json);json
        System.out.println("ntopng_flow_l4_counters");
        json = ntopng_flow_l4_counters("0");
        System.out.println(json);
        System.out.println("ntopng_flow_l7_counters");
        json = ntopng_flow_l7_counters("0");
        System.out.println(json);
//        System.out.println("");
//        json = ntopng_flow_db_topk_flows("0");
//        System.out.println(json);
        System.out.println("ntopng_flow_proto_l4");
        json = ntopng_flow_proto_l4("0");
        System.out.println(json);
        System.out.println("ntopng_flow_proto_l7");
        json = ntopng_flow_proto_l7("0");
        System.out.println(json);
        System.out.println("ntopng_flow_category_consts");
        json = ntopng_flow_category_consts("0");
        System.out.println(json);
        System.out.println("ntopng_flow_interface_pools");
        json = ntopng_flow_interface_pools();
        System.out.println(json);
        System.out.println("ntopng_flow_host_pools");
        json = ntopng_flow_host_pools();
        System.out.println(json);
        System.out.println("ntopng_flow_network_pools");
        json = ntopng_flow_network_pools();
        System.out.println(json);

        System.out.println("ntopng_flow_pools");
        json = ntopng_flow_pools();
        System.out.println(json);
//        System.out.println("ntopng_flow_active_monitoring_pools");
//        json = ntopng_flow_active_monitoring_pools("0");
//        System.out.println(json);
        System.out.println("ntopng_flow_flow_pools");
        json = ntopng_flow_flow_pools();
        System.out.println(json);
        System.out.println("ntopng_flow_mac_pools");
        json = ntopng_flow_mac_pools();
        System.out.println(json);
        System.out.println("ntopng_flow_host_pools");
        json = ntopng_flow_host_pools();
        System.out.println(json);
        System.out.println("ntopng_flow_system_pools");
        json = ntopng_flow_system_pools();
        System.out.println(json);

        System.out.println("ntopng_flow_host_pool_members");
        json = ntopng_flow_host_pool_members();
        System.out.println(json);
//        System.out.println("ntopng_flow_pool_by_member");
//        json = ntopng_flow_pool_by_member();
//        System.out.println(json);
        //{"rc":-5,"rc_str_hr":"Invalid arguments","rc_str":"INVALID_ARGUMENTS","rsp":[]}
        System.out.println("===end===");*/
    }
}
