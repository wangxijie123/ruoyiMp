package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.Flow;
import com.ruoyi.common.utils.ListUtils;
import com.ruoyi.common.utils.NtopngUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.quartz.mapper.FlowMapper;
import com.ruoyi.quartz.service.IFlowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-02-02
 */
@Service
public class FlowServiceImpl implements IFlowService {
    @Resource
    private FlowMapper mapper;


    @Override
    public void insertTest() {
        JSONObject json = null;
        String cookie = "tzoffset=28800; _gaDiagram=GA1.1.1648044454.1608621682; session=9c1994a1cb89df61fe5acff47d8df853";
        List<Flow> list = new ArrayList<>(100);
        Map map = new HashMap();
        for (int i = 1; i <= 20; i++) {
            String url = StringUtils.format("http://112.13.167.87:9002/lua/get_flows_data.lua?currentPage={}&perPage=10&sortColumn=column_client&sortOrder=asc", i);
            System.out.println(url);
            json = NtopngUtil.ntopng_web_spider(url, cookie);
            if (json == null) {
                break;
            } else {
                JSONArray data = json.getJSONArray("data");
                if (data.size() == 0) break;
                for (int r = 0; r < data.size(); r++) {
                    map.clear();
                    JSONObject item = data.getJSONObject(r);
                    System.out.println(item.getString("column_key"));
                    for (Map.Entry<String, Object> entry : item.entrySet()) {
                        Object o = entry.getValue();
                        if (o instanceof String) {
                            String v = (String) entry.getValue();
                            System.out.println("key:" + entry.getKey() + "，value:" + NtopngUtil.getHtmlText(v));
                            map.put(entry.getKey(), NtopngUtil.getHtmlText(v));
                        }
                    }
                    if (map.size() > 0) {
                        Flow flow = JSONObject.parseObject(JSONObject.toJSONString(map), Flow.class);
                        list.add(flow);
                    }
                }
            }
        }
        if (ListUtils.isNotEmpty(list)) {
            mapper.batchInsert(list);
        }
    }

    @Override
    public List<Flow> select() {
        return mapper.select();
    }
}
