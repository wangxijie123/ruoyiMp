package com.ruoyi.quartz.mapper;

import com.ruoyi.common.core.domain.MainAlert;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
public interface MainAlertMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public MainAlert selectAlertById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param alert 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MainAlert> selectAlertList(MainAlert alert);

    /**
     * 新增【请填写功能名称】
     *
     * @param alert 【请填写功能名称】
     * @return 结果
     */
    public int insertAlert(MainAlert alert);

    /**
     * 修改【请填写功能名称】
     *
     * @param alert 【请填写功能名称】
     * @return 结果
     */
    public int updateAlert(MainAlert alert);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAlertById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAlertByIds(Long[] ids);

    void batchInsert(@Param("list") List<Map<String , Object>> list);

    Long getMaxTime();
}
