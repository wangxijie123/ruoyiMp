package com.ruoyi.quartz.mapper;

import com.ruoyi.common.core.domain.InterfaceL7Stats;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-18
 */
public interface InterfaceL7StatsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public InterfaceL7Stats selectInterfaceL7StatsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param interfaceL7Stats 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<InterfaceL7Stats> selectInterfaceL7StatsList(InterfaceL7Stats interfaceL7Stats);

    /**
     * 新增【请填写功能名称】
     * 
     * @param interfaceL7Stats 【请填写功能名称】
     * @return 结果
     */
    public int insertInterfaceL7Stats(InterfaceL7Stats interfaceL7Stats);

    /**
     * 修改【请填写功能名称】
     * 
     * @param interfaceL7Stats 【请填写功能名称】
     * @return 结果
     */
    public int updateInterfaceL7Stats(InterfaceL7Stats interfaceL7Stats);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteInterfaceL7StatsById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInterfaceL7StatsByIds(Long[] ids);

    List<InterfaceL7Stats> getList();

}
