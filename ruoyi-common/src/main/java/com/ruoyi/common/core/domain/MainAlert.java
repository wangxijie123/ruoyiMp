package com.ruoyi.common.core.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 alert
 * 
 * @author ruoyi
 * @date 2021-01-28
 */
public class MainAlert extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long date;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String severity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long duration;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String entityVal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long count;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String entity;

    public MainAlert() {
    }

    public MainAlert(Long date, String severity, Long duration, String msg, String entityVal, Long count, String type, String entity) {
        this.date = date;
        this.severity = severity;
        this.duration = duration;
        this.msg = msg;
        this.entityVal = entityVal;
        this.count = count;
        this.type = type;
        this.entity = entity;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDate(Long date) 
    {
        this.date = date;
    }

    public Long getDate() 
    {
        return date;
    }
    public void setSeverity(String severity) 
    {
        this.severity = severity;
    }

    public String getSeverity() 
    {
        return severity;
    }
    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
    }
    public void setMsg(String msg) 
    {
        this.msg = msg;
    }

    public String getMsg() 
    {
        return msg;
    }
    public void setEntityVal(String entityVal) 
    {
        this.entityVal = entityVal;
    }

    public String getEntityVal() 
    {
        return entityVal;
    }
    public void setCount(Long count) 
    {
        this.count = count;
    }

    public Long getCount() 
    {
        return count;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setEntity(String entity) 
    {
        this.entity = entity;
    }

    public String getEntity() 
    {
        return entity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("date", getDate())
            .append("severity", getSeverity())
            .append("duration", getDuration())
            .append("msg", getMsg())
            .append("entityVal", getEntityVal())
            .append("count", getCount())
            .append("type", getType())
            .append("entity", getEntity())
            .toString();
    }
}
