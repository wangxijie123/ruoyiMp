package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.quartz.service.IFlowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-02-02
 */
@RestController
@RequestMapping("/system/flows")
public class FlowController extends BaseController
{
    @Resource
    private IFlowService service;

    @GetMapping("/insertTest")
    public AjaxResult insertTest(){
        service.insertTest();
        return AjaxResult.success();
    }

    @GetMapping("/list")
    public TableDataInfo getList(){
        return getDataTable(service.select());
    }
}
