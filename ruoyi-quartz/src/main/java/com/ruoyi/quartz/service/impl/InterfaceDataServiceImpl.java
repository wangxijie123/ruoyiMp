package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.InterfaceData;
import com.ruoyi.common.core.domain.SystemHostStats;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.NtopngUtil;
import com.ruoyi.quartz.mapper.InterfaceDataMapper;
import com.ruoyi.quartz.mapper.SystemHostStatsMapper;
import com.ruoyi.quartz.service.IInterfaceDataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-01-18
 */
@Transactional
@Service
public class InterfaceDataServiceImpl implements IInterfaceDataService {

    @Resource
    private InterfaceDataMapper mapper;

    @Resource
    private SystemHostStatsMapper hostStatsMapper;

    @Override
    public void insert() {
        //线上数据
//        JSONObject jsonObject = NtopngUtil.ntopng_interface_data("0");

        //测试数据
        String res = "{\"rc\":0,\"rc_str_hr\":\"Success\",\"rc_str\":\"OK\",\"rsp\":{\"localtime\":\"10:57:23 +0800\",\"tcpPacketStats\":{\"out_of_order\":2349,\"lost\":2226,\"retransmissions\":9008},\"is_view\":false,\"num_flows\":28,\"dropped_alerts\":0,\"ifid\":\"0\",\"epoch\":1610679443,\"alerted_flows_notice\":22,\"speed\":1000,\"packets\":1035504,\"bytes_download\":68280758,\"drops\":0,\"throughput_bps\":15264.291015625,\"ifname\":\"ens160\",\"ts_alerts\":[],\"alerted_flows_error\":0,\"flows_pctg\":1,\"packets_upload\":560087,\"throughput\":{\"download\":{\"pps\":18.995882034302,\"bps\":2900.5710449219},\"upload\":{\"pps\":20.795492172241,\"bps\":12363.719726562}},\"local2remote\":325610423,\"num_local_hosts\":1,\"throughput_pps\":39.791374206543,\"has_alerts\":true,\"remote2local\":56476496,\"num_devices\":3,\"alerted_flows_warning\":1,\"profiles\":[],\"bytes_upload\":339266459,\"macs_pctg\":1,\"remote_pps\":0,\"packets_download\":475417,\"uptime\":\"1 Day, 17:46:12\",\"num_hosts\":7,\"num_live_captures\":0,\"hosts_pctg\":1,\"periodic_stats_update_frequency_secs\":5,\"bytes\":407547217,\"remote_bps\":0,\"engaged_alerts\":0,\"alerted_flows\":23,\"system_host_stats\":{\"alerts_queries\":51358,\"mem_used\":2027752,\"mem_ntopng_resident\":328048,\"mem_cached\":1441264,\"cpu_states\":{\"guest_nice\":0.0,\"system\":0.2252816020025,\"softirq\":0.025031289111389,\"steal\":0.0,\"idle\":96.695869837297,\"irq\":0.0,\"guest\":0.0,\"iowait\":0.20025031289111,\"user\":2.8535669586984,\"nice\":0.0},\"dropped_alerts\":0,\"mem_buffers\":140720,\"mem_ntopng_virtual\":3089568,\"alerts_stats\":{\"alert_queues\":{\"internal_alerts_queue\":{\"pct_not_enqueued\":0}}},\"mem_total\":16266128,\"written_alerts\":42676,\"mem_shmem\":61324,\"mem_free\":12534184,\"engaged_alerts\":0,\"cpu_load\":0.050000000745058,\"mem_sreclaimable\":183532}}}";
        JSONObject jsonObject = JSONObject.parseObject(res);

        /*================================*/
        if (null == jsonObject) {
            return;
        }
        Long time = DateUtils.getLongTime();
        JSONObject json = jsonObject.getJSONObject("rsp");
        JSONObject tcpPacketStats = json.getJSONObject("tcpPacketStats");
        JSONObject system_host_stats = json.getJSONObject("system_host_stats");
        InterfaceData interfaceData = new InterfaceData(time, 0,
                json.getString("ifname"), json.getString("uptime"), json.getLong("num_flows"), json.getLong("num_devices"),
                json.getLong("num_live_captures"), json.getLong("num_hosts"), json.getLong("dropped_alerts"), json.getLong("epoch"),
                json.getLong("alerted_flows_notice"), json.getLong("alerted_flows_warning"), json.getLong("speed"),
                json.getLong("packets"), json.getLong("bytes_download"), json.getLong("bytes_upload"), json.getLong("packets_download"),
                json.getLong("packets_upload"), json.getLong("local2remote"), json.getLong("remote2local"), json.getDoubleValue("throughput_bps"),
                json.getDoubleValue("throughput_pps"), json.getLong("drops"), json.getLong("flows_pctg"), json.getLong("hosts_pctg"),
                json.getLong("periodic_stats_update_frequency_secs"), json.getLong("bytes"), json.getLong("remote_bps"), json.getLong("alerted_flows"),
                json.getLong("engaged_alerts"), tcpPacketStats.getLong("out_of_order"), tcpPacketStats.getLong("lost"), tcpPacketStats.getLong("retransmissions")
        );
        mapper.insertInterfaceData(interfaceData);
        SystemHostStats systemHostStats = new SystemHostStats(time, 0, json.getString("ifname"), json.getString("uptime"),
                system_host_stats.getLong("alerts_queries"),
                system_host_stats.getLong("mem_used"),
                system_host_stats.getLong("mem_ntopng_resident"),
                system_host_stats.getLong("mem_cached"),
                system_host_stats.getLong("dropped_alerts"),
                system_host_stats.getLong("mem_buffers"),
                system_host_stats.getLong("mem_ntopng_virtual"),
                system_host_stats.getLong("mem_total"),
                system_host_stats.getLong("mem_shmem"),
                system_host_stats.getLong("mem_free"),
                system_host_stats.getLong("mem_sreclaimable"),
                system_host_stats.getLong("written_alerts"),
                system_host_stats.getLong("engaged_alerts"),
                system_host_stats.getLong("cpu_load")
        );
        hostStatsMapper.insertSystemHostStats(systemHostStats);
    }

    @Override
    public InterfaceData getInfo() {
        return mapper.getInfo();
    }
}
