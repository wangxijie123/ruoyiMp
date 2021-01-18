package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSON;
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
import java.util.List;
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
    private InterfaceHostsMapper mapper;

    @Override
    public void insert() {
        mapper.deleteAll();

//        JSONObject jsonObject = NtopngUtil.ntopng_interface_hosts("0", "", "", "", "", "", "");

        String res ="{\"rc\":0,\"rc_str_hr\":\"Success\",\"rc_str\":\"OK\",\"rsp\":{\"perPage\":10,\"data\":[{\"country\":\"CN\",\"first_seen\":1610672613,\"os\":0,\"last_seen\":1610679444,\"ip\":\"60.190.233.178\",\"num_flows\":{\"as_client\":24,\"total\":24,\"as_server\":0},\"is_blacklisted\":false,\"thpt\":{\"pps\":25.663536071777,\"bps\":87437.3359375},\"is_broadcast\":false,\"is_multicast\":false,\"is_localhost\":false,\"is_broadcast_domain\":false,\"vlan\":0,\"bytes\":{\"total\":227509782,\"recvd\":209931856,\"sent\":17577926},\"name\":\"60.190.233.178\",\"num_alerts\":0,\"key\":\"60__190__233__178\"},{\"country\":\"CN\",\"first_seen\":1610529072,\"os\":0,\"last_seen\":1610679444,\"ip\":\"36.152.44.96\",\"num_flows\":{\"as_client\":0,\"total\":1,\"as_server\":1},\"is_blacklisted\":false,\"thpt\":{\"pps\":1.9997560977936,\"bps\":1567.8087158203},\"is_broadcast\":false,\"is_multicast\":false,\"is_localhost\":false,\"is_broadcast_domain\":false,\"vlan\":0,\"bytes\":{\"total\":29425676,\"recvd\":14712838,\"sent\":14712838},\"name\":\"36.152.44.96\",\"num_alerts\":0,\"key\":\"36__152__44__96\"},{\"country\":\"CN\",\"first_seen\":1610679249,\"os\":0,\"last_seen\":1610679444,\"ip\":\"36.152.44.95\",\"num_flows\":{\"as_client\":0,\"total\":1,\"as_server\":1},\"is_blacklisted\":false,\"thpt\":{\"pps\":1.9997560977936,\"bps\":1567.8087158203},\"is_broadcast\":false,\"is_multicast\":false,\"is_localhost\":false,\"is_broadcast_domain\":false,\"vlan\":0,\"bytes\":{\"total\":38024,\"recvd\":19012,\"sent\":19012},\"name\":\"36.152.44.95\",\"num_alerts\":0,\"key\":\"36__152__44__95\"},{\"country\":\"\",\"first_seen\":1610529076,\"os\":0,\"last_seen\":1610679444,\"ip\":\"192.168.8.55\",\"num_flows\":{\"as_client\":0,\"total\":1,\"as_server\":1},\"is_blacklisted\":false,\"thpt\":{\"pps\":0.33329266309738,\"bps\":197.30926513672},\"is_broadcast\":false,\"is_multicast\":false,\"is_localhost\":false,\"is_broadcast_domain\":false,\"vlan\":0,\"bytes\":{\"total\":742072,\"recvd\":742072,\"sent\":0},\"name\":\"192.168.8.55\",\"num_alerts\":0,\"key\":\"192__168__8__55\"},{\"country\":\"\",\"first_seen\":1610529074,\"os\":0,\"last_seen\":1610679437,\"ip\":\"192.168.0.1\",\"num_flows\":{\"as_client\":0,\"total\":1,\"as_server\":1},\"is_blacklisted\":false,\"thpt\":{\"pps\":0.0,\"bps\":0.0},\"is_broadcast\":false,\"is_multicast\":false,\"is_localhost\":false,\"is_broadcast_domain\":false,\"vlan\":0,\"bytes\":{\"total\":9312907,\"recvd\":9312907,\"sent\":0},\"name\":\"192.168.0.1\",\"num_alerts\":0,\"key\":\"192__168__0__1\"},{\"country\":\"\",\"first_seen\":1610679157,\"os\":0,\"last_seen\":1610679444,\"ip\":\"10.76.149.215\",\"num_flows\":{\"as_client\":1,\"total\":1,\"as_server\":0},\"is_blacklisted\":false,\"thpt\":{\"pps\":1.9997560977936,\"bps\":1983.7580566406},\"is_broadcast\":false,\"is_multicast\":false,\"is_localhost\":false,\"is_broadcast_domain\":false,\"vlan\":0,\"bytes\":{\"total\":72370,\"recvd\":49149,\"sent\":23221},\"name\":\"10.76.149.215\",\"num_alerts\":0,\"key\":\"10__76__149__215\"},{\"country\":\"\",\"first_seen\":1607933404,\"os\":1,\"last_seen\":1610679444,\"ip\":\"10.76.135.45\",\"num_flows\":{\"as_client\":4,\"total\":29,\"as_server\":25},\"is_blacklisted\":false,\"thpt\":{\"pps\":31.996097564697,\"bps\":92754.015625},\"is_broadcast\":false,\"is_multicast\":false,\"is_localhost\":true,\"is_broadcast_domain\":true,\"vlan\":0,\"bytes\":{\"total\":418532945460.0,\"recvd\":393792527039.0,\"sent\":24740418421.0},\"name\":\"ZJHZ-QLY-Adapter05\",\"num_alerts\":0,\"key\":\"10__76__135__45\"}],\"sort\":[[]],\"currentPage\":1}}";
        JSONObject jsonObject = JSON.parseObject(res);

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
                mapper.insertInterfaceHosts(interfaceHosts);
            }
        }

    }

    @Override
    public List<String> selectAllIp() {
        return mapper.selectAllIp();
    }

    @Override
    public List<InterfaceHosts> selectAll() {
        return mapper.selectAll();
    }
}
