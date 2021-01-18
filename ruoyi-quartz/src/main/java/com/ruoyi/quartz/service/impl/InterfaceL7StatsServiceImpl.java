package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.InterfaceL7Stats;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.quartz.mapper.InterfaceL7StatsMapper;
import com.ruoyi.quartz.service.IInterfaceL7StatsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-01-18
 */
@Transactional
@Service
public class InterfaceL7StatsServiceImpl implements IInterfaceL7StatsService {
    @Resource
    private InterfaceL7StatsMapper mapper;

    @Override
    public void insert() {
        //线上数据
//        JSONObject json = NtopngUtil.ntopng_interface_stats_l7("0", "count");

        //测试数据
        String res  = "{\"rc\":0,\"rc_str_hr\":\"Success\",\"rc_str\":\"OK\",\"rsp\":[{\"label\":\"HTTP\",\"value\":26,\"url\":\"/lua/flows_stats.lua?application=HTTP\"},{\"label\":\"ICMP\",\"value\":2,\"url\":\"/lua/flows_stats.lua?application=ICMP\"},{\"label\":\"Unknown\",\"value\":1,\"url\":\"/lua/flows_stats.lua?application=Unknown\"},{\"label\":\"SSH\",\"value\":1,\"url\":\"/lua/flows_stats.lua?application=SSH\"},{\"label\":\"Syslog\",\"value\":1,\"url\":\"/lua/flows_stats.lua?application=Syslog\"}]}";
        JSONObject json = JSONObject.parseObject(res);

        /*===================================================*/
        JSONArray rsp = json.getJSONArray("rsp");
        if (null != rsp) {
            Long time = DateUtils.getLongTime();
            for (int i = 0; i < rsp.size(); i++) {
                JSONObject item = rsp.getJSONObject(i);
                InterfaceL7Stats interfaceL7Stats = new InterfaceL7Stats(time, 0,
                        item.getString("label"), item.getLong("value"), item.getString("url"));
                mapper.insertInterfaceL7Stats(interfaceL7Stats);
            }
        }

    }

    @Override
    public List<InterfaceL7Stats> getList() {
        return mapper.getList();
    }
}
