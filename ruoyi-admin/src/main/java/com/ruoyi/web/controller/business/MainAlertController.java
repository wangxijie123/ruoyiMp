package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.quartz.service.MainIAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
@RestController
@RequestMapping("/system/alert")
public class MainAlertController extends BaseController
{
    @Resource
    private MainIAlertService service;

    @GetMapping("/")
    public void insertTest(){
        service.insertTest();
    }
}
