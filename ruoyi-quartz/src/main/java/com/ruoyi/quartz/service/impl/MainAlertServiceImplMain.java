package com.ruoyi.quartz.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.MainAlert;
import com.ruoyi.common.utils.NtopngUtil;
import com.ruoyi.quartz.mapper.MainAlertMapper;
import com.ruoyi.quartz.service.MainIAlertService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-01-28
 */
@Service
public class MainAlertServiceImplMain implements MainIAlertService {
    @Resource
    private MainAlertMapper mapper;

    @Override
    public void insertTest() {
        JSONObject jsonObject = NtopngUtil.ntopng_alert_data("0", "historical", "", "", "", "");
        insert(jsonObject, null, null);
    }

    @Override
    public void insert(JSONObject jsonObject, Long from, Long end) {
        JSONArray rsp = jsonObject.getJSONArray("rsp");
        if (null != rsp && rsp.size() > 0) {
            List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(rsp.size());
            Map<String, Object> map = new HashMap<String, Object>();
            for (int i = 0; i < rsp.size(); i++) {
                JSONObject json = rsp.getJSONObject(i);
                Long date = json.getLong("date");
                if (from != null && (date <= from || date > end)) {
                    continue;
                }
                map.clear();
                String msg = json.getString("msg");
                msg = NtopngUtil.getHtmlText(msg);
                map.put("date", date);
                map.put("severity", json.getString("severity"));
                map.put("duration", json.getLong("duration"));
                map.put("msg", msg);
                map.put("entityVal", json.getString("entity_val"));
                map.put("count", json.getLong("count"));
                map.put("type", json.getString("type"));
                map.put("entity", json.getString("entity"));
                list.add(map);
            }
            if (list.size()>0){
                mapper.batchInsert(list);
            }
        }
    }

    @Override
    public Long getMaxTime() {
        return mapper.getMaxTime();
    }

    @Override
    public List<MainAlert> listAll() {
        return mapper.listAll();
    }
}
