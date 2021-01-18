package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.HostHttp;
import com.ruoyi.quartz.mapper.HostHttpMapper;
import com.ruoyi.quartz.mapper.InterfaceHostsMapper;
import com.ruoyi.quartz.service.IHostHttpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-01-15
 */
@Service
@Transactional
public class HostHttpServiceImpl implements IHostHttpService {
    @Resource
    private HostHttpMapper mapper;

    @Resource
    private InterfaceHostsMapper hostsMapper;


    @Override
    public void insertTest() {
        List<String> list = hostsMapper.selectAllIp();
        String res = "{\"rc\":0,\"rc_str_hr\":\"Success\",\"rc_str\":\"OK\",\"rsp\":{\"total_alerts\":42651,\"broadcast_domain_host\":true,\"active_http_hosts\":1,\"host_services_bitmap\":0,\"bytes.rcvd\":393792527039.0,\"systemhost\":true,\"score\":3550,\"ndpi_categories\":{\"Email\":{\"duration\":5,\"bytes.sent\":0,\"bytes\":74,\"category\":3,\"bytes.rcvd\":74},\"RPC\":{\"duration\":70,\"bytes.sent\":3993,\"bytes\":9881,\"category\":16,\"bytes.rcvd\":5888},\"Collaborative\":{\"duration\":23205,\"bytes.sent\":2445205,\"bytes\":59075230,\"category\":15,\"bytes.rcvd\":56630025},\"VoIP\":{\"duration\":45,\"bytes.sent\":1323,\"bytes\":5129,\"category\":10,\"bytes.rcvd\":3806},\"Unspecified\":{\"duration\":497770,\"bytes.sent\":30285733,\"bytes\":37873577,\"category\":0,\"bytes.rcvd\":7587844},\"System\":{\"duration\":1182685,\"bytes.sent\":662778003,\"bytes\":664284905,\"category\":18,\"bytes.rcvd\":1506902},\"Mining\":{\"duration\":5,\"bytes.sent\":1104,\"bytes\":2435,\"category\":99,\"bytes.rcvd\":1331},\"IoT-Scada\":{\"duration\":10,\"bytes.sent\":375,\"bytes\":1281,\"category\":31,\"bytes.rcvd\":906},\"DataTransfer\":{\"duration\":75,\"bytes.sent\":2868,\"bytes\":6608,\"category\":4,\"bytes.rcvd\":3740},\"Web\":{\"duration\":440960,\"bytes.sent\":23624071133.0,\"bytes\":416868867778.0,\"category\":5,\"bytes.rcvd\":393244796645.0},\"RemoteAccess\":{\"duration\":166335,\"bytes.sent\":108582155,\"bytes\":131272434,\"category\":12,\"bytes.rcvd\":22690279},\"Network\":{\"duration\":2032385,\"bytes.sent\":311745481,\"bytes\":756841045,\"category\":14,\"bytes.rcvd\":445095564},\"Database\":{\"duration\":1280,\"bytes.sent\":27594,\"bytes\":61426,\"category\":11,\"bytes.rcvd\":33832},\"Malware\":{\"duration\":2320,\"bytes.sent\":150829,\"bytes\":203826,\"category\":100,\"bytes.rcvd\":52997},\"Download-FileTransfer-FileSharing\":{\"duration\":100,\"bytes.sent\":322625,\"bytes\":14439831,\"category\":7,\"bytes.rcvd\":14117206}},\"other_ip.bytes.rcvd\":0,\"dscp\":{\"cs0\":{\"bytes.sent\":290364995,\"packets.rcvd\":447797,\"bytes.rcvd\":54078999,\"packets.sent\":532396},\"cs5\":{\"bytes.sent\":34312244,\"packets.rcvd\":20125,\"bytes.rcvd\":2312681,\"packets.sent\":21793},\"cs6\":{\"bytes.sent\":121528,\"packets.rcvd\":257,\"bytes.rcvd\":25935,\"packets.sent\":163},\"le\":{\"bytes.sent\":661901,\"packets.rcvd\":345,\"bytes.rcvd\":32462,\"packets.sent\":410},\"unknown\":{\"bytes.sent\":158400,\"packets.rcvd\":432,\"bytes.rcvd\":33261,\"packets.sent\":386}},\"tcp.packets.seq_problems\":true,\"bytes.rcvd.anomaly_index\":50,\"other_ip.bytes.sent.anomaly_index\":0,\"tskey\":\"10.76.135.45\",\"other_ip.bytes.sent\":0,\"active_alerted_flows\":24,\"ndpi\":{\"MQTT\":{\"duration\":20,\"bytes.sent\":3243,\"packets.rcvd\":4272,\"num_flows\":0,\"bytes.rcvd\":4272,\"packets.sent\":3243,\"breed\":\"Acceptable\"},\"Corba\":{\"duration\":40,\"bytes.sent\":750,\"packets.rcvd\":1470,\"num_flows\":0,\"bytes.rcvd\":1470,\"packets.sent\":750,\"breed\":\"Acceptable\"},\"LDAP\":{\"duration\":55,\"bytes.sent\":1945,\"packets.rcvd\":2544,\"num_flows\":0,\"bytes.rcvd\":2544,\"packets.sent\":1945,\"breed\":\"Acceptable\"},\"LotusNotes\":{\"duration\":40,\"bytes.sent\":824,\"packets.rcvd\":1592,\"num_flows\":0,\"bytes.rcvd\":1592,\"packets.sent\":824,\"breed\":\"Acceptable\"},\"RX\":{\"duration\":10,\"bytes.sent\":0,\"packets.rcvd\":146,\"num_flows\":0,\"bytes.rcvd\":146,\"packets.sent\":0,\"breed\":\"Acceptable\"},\"POP3\":{\"duration\":5,\"bytes.sent\":0,\"packets.rcvd\":74,\"num_flows\":0,\"bytes.rcvd\":74,\"packets.sent\":0,\"breed\":\"Unsafe\"},\"DNS\":{\"duration\":1577840,\"bytes.sent\":106528094,\"packets.rcvd\":227226634,\"num_flows\":1078,\"bytes.rcvd\":227349553,\"packets.sent\":106442206,\"breed\":\"Acceptable\"},\"Targus Dataspeed\":{\"duration\":100,\"bytes.sent\":37000,\"packets.rcvd\":14516,\"num_flows\":1,\"bytes.rcvd\":15406,\"packets.sent\":35931,\"breed\":\"Acceptable\"},\"SSDP\":{\"duration\":5,\"bytes.sent\":181,\"packets.rcvd\":0,\"num_flows\":0,\"bytes.rcvd\":0,\"packets.sent\":181,\"breed\":\"Acceptable\"},\"AFP\":{\"duration\":40,\"bytes.sent\":824,\"packets.rcvd\":1424,\"num_flows\":0,\"bytes.rcvd\":1424,\"packets.sent\":824,\"breed\":\"Acceptable\"},\"NTP\":{\"duration\":83700,\"bytes.sent\":1535580,\"packets.rcvd\":1423801,\"num_flows\":915,\"bytes.rcvd\":1503990,\"packets.sent\":1454145,\"breed\":\"Acceptable\"},\"Mining\":{\"duration\":5,\"bytes.sent\":1104,\"packets.rcvd\":1331,\"num_flows\":0,\"bytes.rcvd\":1331,\"packets.sent\":1104,\"breed\":\"Unsafe\"},\"Teredo\":{\"duration\":5,\"bytes.sent\":0,\"packets.rcvd\":103,\"num_flows\":0,\"bytes.rcvd\":103,\"packets.sent\":0,\"breed\":\"Acceptable\"},\"Unknown\":{\"duration\":471020,\"bytes.sent\":29419788,\"packets.rcvd\":7509616,\"num_flows\":0,\"bytes.rcvd\":7509616,\"packets.sent\":29419788,\"breed\":\"Unrated\"},\"ntop\":{\"duration\":670,\"bytes.sent\":1301067,\"packets.rcvd\":25717553,\"num_flows\":9,\"bytes.rcvd\":26153507,\"packets.sent\":1276024,\"breed\":\"Safe\"},\"FTP_CONTROL\":{\"duration\":90,\"bytes.sent\":30185,\"packets.rcvd\":35583,\"num_flows\":0,\"bytes.rcvd\":35583,\"packets.sent\":30185,\"breed\":\"Unsafe\"},\"Whois-DAS\":{\"duration\":80,\"bytes.sent\":435644,\"packets.rcvd\":46534,\"num_flows\":1,\"bytes.rcvd\":47403,\"packets.sent\":434542,\"breed\":\"Acceptable\"},\"MySQL\":{\"duration\":1105,\"bytes.sent\":24752,\"packets.rcvd\":299,\"num_flows\":2,\"bytes.rcvd\":27518,\"packets.sent\":324,\"breed\":\"Acceptable\"},\"SNMP\":{\"duration\":240,\"bytes.sent\":0,\"packets.rcvd\":32140,\"num_flows\":0,\"bytes.rcvd\":32140,\"packets.sent\":0,\"breed\":\"Acceptable\"},\"Gnutella\":{\"duration\":5,\"bytes.sent\":3180,\"packets.rcvd\":2586,\"num_flows\":0,\"bytes.rcvd\":2586,\"packets.sent\":3180,\"breed\":\"Potentially Dangerous\"},\"TLS\":{\"duration\":101375,\"bytes.sent\":23081088,\"packets.rcvd\":452484463,\"num_flows\":267,\"bytes.rcvd\":454194702,\"packets.sent\":22535393,\"breed\":\"Safe\"},\"NFS\":{\"duration\":35,\"bytes.sent\":2044,\"packets.rcvd\":2316,\"num_flows\":0,\"bytes.rcvd\":2316,\"packets.sent\":2044,\"breed\":\"Acceptable\"},\"Microsoft\":{\"duration\":30,\"bytes.sent\":131689,\"packets.rcvd\":8432,\"num_flows\":0,\"bytes.rcvd\":8432,\"packets.sent\":131689,\"breed\":\"Safe\"},\"Telnet\":{\"duration\":5,\"bytes.sent\":0,\"packets.rcvd\":74,\"num_flows\":0,\"bytes.rcvd\":74,\"packets.sent\":0,\"breed\":\"Unsafe\"},\"Oracle\":{\"duration\":5,\"bytes.sent\":0,\"packets.rcvd\":74,\"num_flows\":0,\"bytes.rcvd\":74,\"packets.sent\":0,\"breed\":\"Acceptable\"},\"ICMP\":{\"duration\":1911080,\"bytes.sent\":204240898,\"packets.rcvd\":177976377,\"num_flows\":17,\"bytes.rcvd\":192566369,\"packets.sent\":189650586,\"breed\":\"Acceptable\"},\"RDP\":{\"duration\":1090,\"bytes.sent\":125423,\"packets.rcvd\":98741,\"num_flows\":26,\"bytes.rcvd\":106647,\"packets.sent\":116681,\"breed\":\"Acceptable\"},\"MsSQL-TDS\":{\"duration\":35,\"bytes.sent\":618,\"packets.rcvd\":1244,\"num_flows\":0,\"bytes.rcvd\":1244,\"packets.sent\":618,\"breed\":\"Acceptable\"},\"Google\":{\"duration\":30,\"bytes.sent\":1911009,\"packets.rcvd\":124229356,\"num_flows\":0,\"bytes.rcvd\":124229356,\"packets.sent\":1911009,\"breed\":\"Unrated\"},\"Github\":{\"duration\":105,\"bytes.sent\":1658018,\"packets.rcvd\":55579774,\"num_flows\":0,\"bytes.rcvd\":55579774,\"packets.sent\":1658018,\"breed\":\"Acceptable\"},\"NetBIOS\":{\"duration\":20,\"bytes.sent\":0,\"packets.rcvd\":368,\"num_flows\":0,\"bytes.rcvd\":368,\"packets.sent\":0,\"breed\":\"Acceptable\"},\"SSH\":{\"duration\":165630,\"bytes.sent\":108489727,\"packets.rcvd\":22582340,\"num_flows\":5,\"bytes.rcvd\":22609754,\"packets.sent\":108427058,\"breed\":\"Acceptable\"},\"HTTP\":{\"duration\":357390,\"bytes.sent\":23587815865.0,\"packets.rcvd\":392303964519.0,\"num_flows\":39666,\"bytes.rcvd\":392342875900.0,\"packets.sent\":23288336586.0,\"breed\":\"Acceptable\"},\"HTTP_Connect\":{\"duration\":195,\"bytes.sent\":780885,\"packets.rcvd\":53037,\"num_flows\":1,\"bytes.rcvd\":53595,\"packets.sent\":780365,\"breed\":\"Acceptable\"},\"DRDA\":{\"duration\":35,\"bytes.sent\":560,\"packets.rcvd\":1288,\"num_flows\":0,\"bytes.rcvd\":1288,\"packets.sent\":560,\"breed\":\"Acceptable\"},\"Yahoo\":{\"duration\":5,\"bytes.sent\":1564,\"packets.rcvd\":1458,\"num_flows\":0,\"bytes.rcvd\":1458,\"packets.sent\":1564,\"breed\":\"Safe\"},\"Syslog\":{\"duration\":1143280,\"bytes.sent\":661240297,\"packets.rcvd\":0,\"num_flows\":1,\"bytes.rcvd\":0,\"packets.sent\":651976727,\"breed\":\"Acceptable\"},\"XDMCP\":{\"duration\":5,\"bytes.sent\":0,\"packets.rcvd\":60,\"num_flows\":0,\"bytes.rcvd\":60,\"packets.sent\":0,\"breed\":\"Acceptable\"},\"IEC60870\":{\"duration\":10,\"bytes.sent\":375,\"packets.rcvd\":906,\"num_flows\":0,\"bytes.rcvd\":906,\"packets.sent\":375,\"breed\":\"Acceptable\"},\"MongoDB\":{\"duration\":105,\"bytes.sent\":1664,\"packets.rcvd\":3708,\"num_flows\":0,\"bytes.rcvd\":3708,\"packets.sent\":1664,\"breed\":\"Acceptable\"},\"FTP_DATA\":{\"duration\":75,\"bytes.sent\":270952,\"packets.rcvd\":14076817,\"num_flows\":0,\"bytes.rcvd\":14076817,\"packets.sent\":270952,\"breed\":\"Acceptable\"},\"SIP\":{\"duration\":45,\"bytes.sent\":1323,\"packets.rcvd\":3806,\"num_flows\":0,\"bytes.rcvd\":3806,\"packets.sent\":1323,\"breed\":\"Acceptable\"},\"Amazon\":{\"duration\":950,\"bytes.sent\":8999436,\"packets.rcvd\":323256820,\"num_flows\":1,\"bytes.rcvd\":323264538,\"packets.sent\":8997382,\"breed\":\"Acceptable\"},\"HTTP_Proxy\":{\"duration\":170,\"bytes.sent\":1388065,\"packets.rcvd\":134950,\"num_flows\":0,\"bytes.rcvd\":134950,\"packets.sent\":1388065,\"breed\":\"Acceptable\"},\"Cloudflare\":{\"duration\":820,\"bytes.sent\":53521,\"packets.rcvd\":28191,\"num_flows\":5,\"bytes.rcvd\":28321,\"packets.sent\":49291,\"breed\":\"Acceptable\"}},\"ICMPv4\":{\"0,0\":{\"rcvd\":19253,\"sent\":63},\"3,1\":{\"rcvd\":4,\"sent\":0},\"3,3\":{\"rcvd\":0,\"sent\":13},\"8,0\":{\"rcvd\":63,\"sent\":19253}},\"other_ip.bytes.rcvd.anomaly_index\":0,\"icmp.bytes.sent\":14740713,\"tcp.bytes.sent\":301396089,\"udp.bytes.sent\":9482266,\"ipkey\":172787501,\"udp.bytes.rcvd\":205151,\"tcp.bytes.rcvd\":41537803,\"privatehost\":true,\"ip\":\"10.76.135.45\",\"dns\":{\"rcvd\":{\"num_replies_ok\":1529044,\"num_replies_error\":0,\"num_queries\":3,\"queries\":{\"num_other\":0,\"num_any\":0,\"num_ptr\":2,\"num_txt\":0,\"num_ns\":0,\"num_aaaa\":0,\"num_mx\":0,\"num_a\":1,\"num_soa\":0,\"num_cname\":0}},\"sent\":{\"num_replies_ok\":0,\"num_replies_error\":0,\"num_queries\":1457967,\"queries\":{\"num_other\":0,\"num_any\":0,\"num_ptr\":858,\"num_txt\":0,\"num_ns\":0,\"num_aaaa\":728155,\"num_mx\":0,\"num_a\":728954,\"num_soa\":0,\"num_cname\":0}}},\"flows.as_client\":851627,\"is_blacklisted\":false,\"pktStats.recv\":{\"size\":{\"upTo6500\":97,\"upTo256\":120,\"upTo2500\":81,\"upTo512\":3878,\"upTo1024\":36696,\"upTo128\":233415,\"upTo1518\":716,\"upTo9000\":0,\"upTo64\":193962,\"above9000\":0},\"tcp_flags\":{\"rst\":171,\"finack\":40241,\"synack\":275,\"syn\":40193}},\"bytes.sent.anomaly_index\":51,\"devtype\":3,\"unreachable_flows.as_client\":35167,\"packets.sent\":153940733,\"icmp.bytes.rcvd\":14740384,\"continent\":\"\",\"city\":\"\",\"local_network_id\":1,\"latitude\":0.0,\"packets.rcvd\":246462570,\"icmp.packets.rcvd\":150392,\"active_flows.as_server\":26,\"alerted_flows.as_client\":404581,\"mac\":\"00:50:56:9C:D6:6A\",\"hits.syn_scan_attacker\":4,\"vlan\":0,\"icmp.packets.sent\":150401,\"icmp.bytes.sent.anomaly_index\":100,\"score.as_client\":0,\"throughput_pps\":31.996097564697,\"score_pct\":{\"score_breakdown_client\":{\"0\":0.0,\"1\":0.0},\"score_breakdown_server\":{\"0\":1.4084507226944,\"1\":98.59154510498}},\"tcpPacketStats.sent\":{\"out_of_order\":18887,\"lost\":56578,\"retransmissions\":183818,\"keep_alive\":4775},\"num_flow_alerts\":0,\"tcpPacketStats.rcvd\":{\"out_of_order\":7542217,\"lost\":2886189,\"retransmissions\":67687,\"keep_alive\":4552},\"tcp.bytes.sent.anomaly_index\":51,\"seen.first\":1607933404,\"throughput_trend_bps\":2,\"names\":{\"resolved\":\"ZJHZ-QLY-Adapter05\"},\"bytes.sent\":24740418421.0,\"contacts.as_client\":1,\"packets.sent.anomaly_index\":51,\"host_unreachable_flows.as_client\":4,\"bytes.ndpi.unknown\":37920967,\"asn\":0,\"total_flows.as_client\":851627,\"hits.syn_flood_victim\":2,\"country\":\"\",\"udp.bytes.rcvd.anomaly_index\":0,\"dhcpHost\":false,\"tcp.bytes.rcvd.anomaly_index\":50,\"hassh_fingerprint\":{\"6832F1CE43D4397C2C0A3E2F8C94334E\":{\"app_name\":\"\",\"num_uses\":1}},\"total_activity_time\":2258065,\"flows.as_server\":508267,\"local_network_name\":\"10.76.135.0/26\",\"hits.flow_flood_victim\":2,\"unreachable_flows.as_server\":11,\"num_triggered_alerts\":{\"min\":0,\"hour\":0,\"5mins\":0,\"day\":0},\"icmp.bytes.rcvd.anomaly_index\":100,\"longitude\":0.0,\"localhost\":true,\"os_detail\":\"\",\"score.as_server\":3550,\"tcp.packets.sent\":359566,\"tcp.packets.rcvd\":316521,\"packets.rcvd.anomaly_index\":51,\"is_broadcast\":false,\"udp.packets.sent\":45181,\"other_ip.packets.rcvd\":0,\"udp.bytes.sent.anomaly_index\":0,\"asname\":\"\",\"udpBytesSent.non_unicast\":181,\"alerted_flows.as_server\":508019,\"udp.packets.rcvd\":2043,\"other_ip.packets.sent\":0,\"name\":\"ZJHZ-QLY-Adapter05\",\"http\":{\"virtual_hosts\":{\"112.13.167.87\":{\"bytes.sent\":17541025,\"http.requests_trend\":1,\"http.act_num_requests\":6,\"bytes.rcvd\":209889131,\"http.requests\":16494}},\"receiver\":{\"rate\":{\"response\":{\"1xx\":0,\"2xx\":0,\"3xx\":0,\"4xx\":0,\"5xx\":0},\"query\":{\"head\":0,\"other\":0,\"post\":0,\"get\":2,\"put\":0}},\"response\":{\"total\":5787,\"num_1xx\":0,\"num_2xx\":5758,\"num_3xx\":27,\"num_4xx\":2,\"num_5xx\":0},\"query\":{\"num_other\":2766,\"num_post\":294680,\"total\":1020597,\"num_put\":75,\"num_get\":717157,\"num_head\":5919}},\"sender\":{\"rate\":{\"response\":{\"1xx\":0,\"2xx\":2,\"3xx\":0,\"4xx\":0,\"5xx\":0},\"query\":{\"head\":0,\"other\":0,\"post\":0,\"get\":0,\"put\":0}},\"response\":{\"total\":1011375,\"num_1xx\":0,\"num_2xx\":656222,\"num_3xx\":145713,\"num_4xx\":208727,\"num_5xx\":713},\"query\":{\"num_other\":0,\"num_post\":0,\"total\":5833,\"num_put\":0,\"num_get\":5833,\"num_head\":0}}},\"num_alerts\":0,\"udpBytesSent.unicast\":769548609,\"contacts.as_server\":1,\"active_flows.as_client\":4,\"ifid\":0,\"host_pool_id\":0,\"duration\":2746041,\"throughput_bps\":11594.251953125,\"is_multicast\":false,\"total_flows.as_server\":508267,\"throughput_trend_pps\":1,\"host_unreachable_flows.as_server\":17,\"os\":1,\"pktStats.sent\":{\"size\":{\"upTo6500\":71444,\"upTo256\":36475,\"upTo2500\":8706,\"upTo512\":62184,\"upTo1024\":2325,\"upTo128\":232094,\"upTo1518\":21195,\"upTo9000\":153,\"upTo64\":120579,\"above9000\":1},\"tcp_flags\":{\"rst\":37,\"finack\":37636,\"synack\":40480,\"syn\":10308}},\"ja3_fingerprint\":{\"37f691b063c10372135db21579643bf1\":{\"app_name\":\"\",\"num_uses\":18},\"df669e7ea913f1ac0c0cce9a201a2ec1\":{\"app_name\":\"\",\"num_uses\":1},\"d0ee3237a14bbd89ca4d2b5356ab20ba\":{\"app_name\":\"\",\"num_uses\":252}},\"score.total\":3550,\"hiddenFromTop\":false,\"cardinality\":{\"num_host_contacted_ports_as_server\":27388,\"num_contacted_services_as_client\":19,\"num_host_contacts_as_server\":41,\"num_contacted_hosts_as_client\":34,\"num_contacted_ports_as_client\":42},\"seen.last\":1610679444}}\n";
        for (String ip : list) {
//            JSONObject json = NtopngUtil.ntopng_host_data("0", ip);
            if (ip.equals("10.76.135.45")) {
                insert(JSONObject.parseObject(res),ip);
            }
        }
    }

    @Override
    public void insert(JSONObject json ,String ip) {
        if (json != null && json.getInteger("rc") == 0) {
            JSONObject rsp = json.getJSONObject("rsp");
            //对应application页面的数据
            if (rsp.containsKey("http")) {
                long l = System.currentTimeMillis();
                String s = l + "0000";
                Long time = Long.parseLong(s);
                JSONObject http = rsp.getJSONObject("http");
                if (null != http) {
                    JSONObject receiver = http.getJSONObject("receiver");
                    Map<String, Long> buildReceiver = build(receiver);
                    JSONObject sender = http.getJSONObject("sender");
                    Map<String, Long> buildSender = build(sender);
                    HostHttp hostHttp = new HostHttp(time, 0L, ip,
                            buildReceiver.get("1xx"),
                            buildReceiver.get("2xx"),
                            buildReceiver.get("3xx"),
                            buildReceiver.get("4xx"),
                            buildReceiver.get("5xx"),
                            buildReceiver.get("head"),
                            buildReceiver.get("other"),
                            buildReceiver.get("post"),
                            buildReceiver.get("get"),
                            buildReceiver.get("put"),
                            buildReceiver.get("total"),
                            buildReceiver.get("num_1xx"),
                            buildReceiver.get("num_2xx"),
                            buildReceiver.get("num_3xx"),
                            buildReceiver.get("num_4xx"),
                            buildReceiver.get("num_5xx"),
                            buildReceiver.get("num_other"),
                            buildReceiver.get("num_post"),
                            buildReceiver.get("total"),
                            buildReceiver.get("num_put"),
                            buildReceiver.get("num_get"),
                            buildReceiver.get("num_head"),
                            buildSender.get("1xx"),
                            buildSender.get("2xx"),
                            buildSender.get("3xx"),
                            buildSender.get("4xx"),
                            buildSender.get("5xx"),
                            buildSender.get("head"),
                            buildSender.get("other"),
                            buildSender.get("post"),
                            buildSender.get("get"),
                            buildSender.get("put"),
                            buildSender.get("total"),
                            buildSender.get("num_1xx"),
                            buildSender.get("num_2xx"),
                            buildSender.get("num_3xx"),
                            buildSender.get("num_4xx"),
                            buildSender.get("num_5xx"),
                            buildSender.get("num_other"),
                            buildSender.get("num_post"),
                            buildSender.get("total"),
                            buildSender.get("num_put"),
                            buildSender.get("num_get"),
                            buildSender.get("num_head")
                    );
                    JSONObject virtual_hosts = http.getJSONObject("virtual_hosts");
                    if (null!=virtual_hosts){
                        for (Map.Entry<String, Object> map : virtual_hosts.entrySet() ){
                            JSONObject value = (JSONObject)map.getValue();
                            hostHttp.setVirtualHostsName(map.getKey());
                            hostHttp.setVirtualHostsBytesSent(value.getLong("bytes.sent"));
                            hostHttp.setVirtualHostsHttpRequestsTrend(value.getLong("http.requests_trend"));
                            hostHttp.setVirtualHostsHttpActNumRequests(value.getLong("http.act_num_requests"));
                            hostHttp.setVirtualHostsBytesRcvd(value.getLong("bytes.rcvd"));
                            hostHttp.setVirtualHostsHttpRequests(value.getLong("http.requests"));
                        }
                    }
                    mapper.insertHostHttp(hostHttp);
                }
            }
        }
    }

    @Override
    public HostHttp getInfoByIp(String ip) {
        return mapper.getInfoByIp(ip);
    }

    private Map<String, Long> build(JSONObject json) {
        Map<String, Long> map = new HashMap<>();
        JSONObject rate = json.getJSONObject("rate");
        JSONObject response1 = rate.getJSONObject("response");
        map.put("1xx", response1.getLongValue("1xx"));
        map.put("2xx", response1.getLongValue("2xx"));
        map.put("3xx", response1.getLongValue("3xx"));
        map.put("4xx", response1.getLongValue("4xx"));
        map.put("5xx", response1.getLongValue("5xx"));
        JSONObject query1 = rate.getJSONObject("query");
        map.put("head", query1.getLongValue("head"));
        map.put("other", query1.getLongValue("other"));
        map.put("post", query1.getLongValue("post"));
        map.put("get", query1.getLongValue("get"));
        map.put("put", query1.getLongValue("put"));
        JSONObject response = json.getJSONObject("response");
        map.put("total", response.getLongValue("total"));
        map.put("num_1xx", response.getLongValue("num_1xx"));
        map.put("num_2xx", response.getLongValue("num_2xx"));
        map.put("num_3xx", response.getLongValue("num_3xx"));
        map.put("num_4xx", response.getLongValue("num_4xx"));
        map.put("num_5xx", response.getLongValue("num_5xx"));
        JSONObject query = json.getJSONObject("query");
        map.put("num_other", query.getLongValue("num_other"));
        map.put("num_post", query.getLongValue("num_post"));
        map.put("query_total", query.getLongValue("total"));
        map.put("num_put", query.getLongValue("num_put"));
        map.put("num_get", query.getLongValue("num_get"));
        map.put("num_head", query.getLongValue("num_head"));
        return map;
    }
}
