package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.InterfaceHosts;
import com.ruoyi.quartz.mapper.InterfaceHostsMapper;
import com.ruoyi.quartz.service.IInterfaceHostsService;
import com.ruoyi.common.utils.NtopngUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
@Service
@Transactional
public class InterfaceHostsServiceImpl implements IInterfaceHostsService
{
    @Resource
    private InterfaceHostsMapper interfaceHostsMapper;

    @Override
    public void insert() {
        interfaceHostsMapper.deleteAll();
        JSONObject jsonObject = NtopngUtil.ntopng_interface_hosts("0", "", "", "", "", "", "");
        JSONObject rsp = jsonObject.getJSONObject("rsp");
        JSONArray data = rsp.getJSONArray("data");
        long l = System.currentTimeMillis();
        String s = l + "000000";
        Long time = Long.parseLong(s);
        if(data != null && data.size() > 0){
            for(int i=0; i< data.size(); i++){
                JSONObject item = data.getJSONObject(i);
                JSONObject num_flows = item.getJSONObject("num_flows");
                JSONObject thpt = item.getJSONObject("thpt");
                JSONObject bytes = item.getJSONObject("bytes");
                InterfaceHosts interfaceHosts = new InterfaceHosts(0L,item.getString("country"),
                        item.getLong("first_seen"),item.getLong("last_seen"), item.getLong("os"), item.getString("ip"), item.getInteger("is_blacklisted"),
                        item.getInteger("is_broadcast"), item.getInteger("is_multicast"), item.getInteger("is_localhost"), item.getInteger("is_broadcast_domain"),
                        item.getLong("vlan"), item.getString("name"), item.getLong("num_alerts"), num_flows.getLong("as_client"), num_flows.getLong("total"),
                        num_flows.getLong("as_server"), thpt.getDoubleValue("pps"), thpt.getDoubleValue("bps"), bytes.getLong("total"), bytes.getLong("recvd"),
                        bytes.getLong("sent"),time
                );
                interfaceHostsMapper.insertInterfaceHosts(interfaceHosts);
            }
        }

    }
}
