package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.quartz.service.IHostHttpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-01-15
 */
@RestController
@RequestMapping("/system/http")
public class HostHttpController extends BaseController
{
    @Resource
    private IHostHttpService service;

    @GetMapping("/")
    public void get(){
        service.insertTest();
    }

    @GetMapping("/infoByIp")
    public AjaxResult getInfoByIp(String ip){
        return AjaxResult.success(service.getInfoByIp(ip));
    }
}
