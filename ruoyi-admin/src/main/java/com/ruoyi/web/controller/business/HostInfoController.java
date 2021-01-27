package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.quartz.service.IHostInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-01-22
 */
@RestController
@RequestMapping("/system/info")
public class HostInfoController extends BaseController
{
    @Resource
    private IHostInfoService service;

    @GetMapping("/")
    public void get(){
        service.insertTest();
    }

    @GetMapping("/infoByIp")
    public AjaxResult getInfoByIp(String ip){
        return AjaxResult.success(service.getInfoByIp(ip));
    }
}
