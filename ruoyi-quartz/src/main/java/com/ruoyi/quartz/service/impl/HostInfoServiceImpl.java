package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.HostInfo;
import com.ruoyi.common.core.domain.InterfaceData;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NtopngUtil;
import com.ruoyi.quartz.mapper.HostInfoMapper;
import com.ruoyi.quartz.service.IHostInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-01-22
 */
@Service
public class HostInfoServiceImpl implements IHostInfoService {
    @Resource
    private HostInfoMapper mapper;


    @Override
    public void insertTest() {
        //线上数据
        JSONObject jsonObject = NtopngUtil.ntopng_host_data("0", "10.76.135.45");
        //测试数据
//        String res = "{\"rc\":0,\"rc_str_hr\":\"Success\",\"rc_str\":\"OK\",\"rsp\":{\"localtime\":\"10:57:23 +0800\",\"tcpPacketStats\":{\"out_of_order\":2349,\"lost\":2226,\"retransmissions\":9008},\"is_view\":false,\"num_flows\":28,\"dropped_alerts\":0,\"ifid\":\"0\",\"epoch\":1610679443,\"alerted_flows_notice\":22,\"speed\":1000,\"packets\":1035504,\"bytes_download\":68280758,\"drops\":0,\"throughput_bps\":15264.291015625,\"ifname\":\"ens160\",\"ts_alerts\":[],\"alerted_flows_error\":0,\"flows_pctg\":1,\"packets_upload\":560087,\"throughput\":{\"download\":{\"pps\":18.995882034302,\"bps\":2900.5710449219},\"upload\":{\"pps\":20.795492172241,\"bps\":12363.719726562}},\"local2remote\":325610423,\"num_local_hosts\":1,\"throughput_pps\":39.791374206543,\"has_alerts\":true,\"remote2local\":56476496,\"num_devices\":3,\"alerted_flows_warning\":1,\"profiles\":[],\"bytes_upload\":339266459,\"macs_pctg\":1,\"remote_pps\":0,\"packets_download\":475417,\"uptime\":\"1 Day, 17:46:12\",\"num_hosts\":7,\"num_live_captures\":0,\"hosts_pctg\":1,\"periodic_stats_update_frequency_secs\":5,\"bytes\":407547217,\"remote_bps\":0,\"engaged_alerts\":0,\"alerted_flows\":23,\"system_host_stats\":{\"alerts_queries\":51358,\"mem_used\":2027752,\"mem_ntopng_resident\":328048,\"mem_cached\":1441264,\"cpu_states\":{\"guest_nice\":0.0,\"system\":0.2252816020025,\"softirq\":0.025031289111389,\"steal\":0.0,\"idle\":96.695869837297,\"irq\":0.0,\"guest\":0.0,\"iowait\":0.20025031289111,\"user\":2.8535669586984,\"nice\":0.0},\"dropped_alerts\":0,\"mem_buffers\":140720,\"mem_ntopng_virtual\":3089568,\"alerts_stats\":{\"alert_queues\":{\"internal_alerts_queue\":{\"pct_not_enqueued\":0}}},\"mem_total\":16266128,\"written_alerts\":42676,\"mem_shmem\":61324,\"mem_free\":12534184,\"engaged_alerts\":0,\"cpu_load\":0.050000000745058,\"mem_sreclaimable\":183532}}}";
//        JSONObject jsonObject = JSONObject.parseObject(res);

        /*================================*/
        if (null == jsonObject) {
            return;
        }
        insert(jsonObject,"10.76.135.45");
    }

    @Override
    public HostInfo getInfoByIp(String ip) {
        return mapper.getInfoByIp(ip);
    }

    @Override
    public void insert(JSONObject jsonObject, String ip) {
        Long time = DateUtils.getLongTime();
        JSONObject json = jsonObject.getJSONObject("rsp");
        JSONObject sent = json.getJSONObject("tcpPacketStats.sent");
        JSONObject rcvd = json.getJSONObject("tcpPacketStats.rcvd");
        HostInfo interfaceData = new HostInfo(time,
                json.getString("mac"), 0L, json.getString("ip"), json.getLong("(local_network_name)"),
                json.getString("name"), json.getLong("tcp.bytes.sent.anomaly_index"), json.getLong("active_alerted_flows"),
                json.getLong("seen.first"), json.getLong("seen.last"), json.getLong("packets.sent"),
                json.getLong("bytes.sent"), json.getLong("packets.rcvd"), json.getLong("bytes.rcvd"),
                json.getLong("active_flows.as_client"), json.getLong("total_flows.as_client"),
                json.getLong("alerted_flows.as_client"), json.getLong("unreachable_flows.as_client"),
                json.getLong("active_flows.as_server"), json.getLong("total_flows.as_server"),
                json.getLong("alerted_flows.as_server"), json.getLong("unreachable_flows.as_server"),
                json.getLong("contacts.as_client"), json.getLong("contacts.as_server"),
                sent.getLong("out_of_order"),
                sent.getLong("lost"),
                sent.getLong("retransmissions"), sent.getLong("keep_alive"),
                rcvd.getLong("out_of_order"),
                rcvd.getLong("lost"),
                rcvd.getLong("retransmissions"), rcvd.getLong("keep_alive")
        );
        mapper.insertHostInfo(interfaceData);
    }
}
