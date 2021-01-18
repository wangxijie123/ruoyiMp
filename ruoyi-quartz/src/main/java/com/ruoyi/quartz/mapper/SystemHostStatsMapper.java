package com.ruoyi.quartz.mapper;

import com.ruoyi.common.core.domain.SystemHostStats;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-18
 */
public interface SystemHostStatsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SystemHostStats selectSystemHostStatsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param systemHostStats 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SystemHostStats> selectSystemHostStatsList(SystemHostStats systemHostStats);

    /**
     * 新增【请填写功能名称】
     * 
     * @param systemHostStats 【请填写功能名称】
     * @return 结果
     */
    public int insertSystemHostStats(SystemHostStats systemHostStats);

    /**
     * 修改【请填写功能名称】
     * 
     * @param systemHostStats 【请填写功能名称】
     * @return 结果
     */
    public int updateSystemHostStats(SystemHostStats systemHostStats);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSystemHostStatsById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSystemHostStatsByIds(Long[] ids);

    public SystemHostStats getInfo(Long time);
}
