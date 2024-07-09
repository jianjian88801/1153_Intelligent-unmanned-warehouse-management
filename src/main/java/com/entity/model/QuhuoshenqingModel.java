package com.entity.model;

import com.entity.QuhuoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 取货申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QuhuoshenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物品名称
     */
    private String quhuoshenqingName;


    /**
     * 物品类型
     */
    private Integer buhuotixingTypes;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 取货数量
     */
    private Integer quhuoshenqingNumber;


    /**
     * 审核状态
     */
    private Integer quhuoshenqingYesnoTypes;


    /**
     * 审核意见
     */
    private String quhuoshenqingYesnoText;


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
	 * 获取：物品名称
	 */
    public String getQuhuoshenqingName() {
        return quhuoshenqingName;
    }


    /**
	 * 设置：物品名称
	 */
    public void setQuhuoshenqingName(String quhuoshenqingName) {
        this.quhuoshenqingName = quhuoshenqingName;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getBuhuotixingTypes() {
        return buhuotixingTypes;
    }


    /**
	 * 设置：物品类型
	 */
    public void setBuhuotixingTypes(Integer buhuotixingTypes) {
        this.buhuotixingTypes = buhuotixingTypes;
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
	 * 获取：取货数量
	 */
    public Integer getQuhuoshenqingNumber() {
        return quhuoshenqingNumber;
    }


    /**
	 * 设置：取货数量
	 */
    public void setQuhuoshenqingNumber(Integer quhuoshenqingNumber) {
        this.quhuoshenqingNumber = quhuoshenqingNumber;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getQuhuoshenqingYesnoTypes() {
        return quhuoshenqingYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setQuhuoshenqingYesnoTypes(Integer quhuoshenqingYesnoTypes) {
        this.quhuoshenqingYesnoTypes = quhuoshenqingYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getQuhuoshenqingYesnoText() {
        return quhuoshenqingYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setQuhuoshenqingYesnoText(String quhuoshenqingYesnoText) {
        this.quhuoshenqingYesnoText = quhuoshenqingYesnoText;
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
