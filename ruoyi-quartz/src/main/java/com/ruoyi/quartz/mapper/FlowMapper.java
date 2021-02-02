package com.ruoyi.quartz.mapper;

import com.ruoyi.common.core.domain.Flow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-02-02
 */
public interface FlowMapper
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param hashId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Flow selectFlowsById(Long hashId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param flow 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Flow> selectFlowsList(Flow flow);

    /**
     * 新增【请填写功能名称】
     * 
     * @param flow 【请填写功能名称】
     * @return 结果
     */
    public int insertFlows(Flow flow);

    /**
     * 修改【请填写功能名称】
     * 
     * @param flow 【请填写功能名称】
     * @return 结果
     */
    public int updateFlows(Flow flow);

    /**
     * 删除【请填写功能名称】
     * 
     * @param hashId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFlowsById(Long hashId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param hashIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteFlowsByIds(Long[] hashIds);

    void batchInsert(@Param("list") List<Flow> list);

    List<Flow> select();

}
