package com.entity.model;

import com.entity.BuhuoshneqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 补货申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BuhuoshneqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 补货信息
     */
    private Integer buhuotixingId;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 审核状态
     */
    private Integer buhuoshneqingYesnoTypes;


    /**
     * 审核意见
     */
    private String buhuoshneqingYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：补货信息
	 */
    public Integer getBuhuotixingId() {
        return buhuotixingId;
    }


    /**
	 * 设置：补货信息
	 */
    public void setBuhuotixingId(Integer buhuotixingId) {
        this.buhuotixingId = buhuotixingId;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：员工
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getBuhuoshneqingYesnoTypes() {
        return buhuoshneqingYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setBuhuoshneqingYesnoTypes(Integer buhuoshneqingYesnoTypes) {
        this.buhuoshneqingYesnoTypes = buhuoshneqingYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getBuhuoshneqingYesnoText() {
        return buhuoshneqingYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setBuhuoshneqingYesnoText(String buhuoshneqingYesnoText) {
        this.buhuoshneqingYesnoText = buhuoshneqingYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
