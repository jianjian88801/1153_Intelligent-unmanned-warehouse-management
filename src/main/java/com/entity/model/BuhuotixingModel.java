package com.entity.model;

import com.entity.BuhuotixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 补货提醒
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BuhuotixingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物品名称
     */
    private String buhuotixingName;


    /**
     * 物品类型
     */
    private Integer buhuotixingTypes;


    /**
     * 补货数量
     */
    private Integer buhuotixingNumber;


    /**
     * 补货状态
     */
    private Integer buhuotixingStautsTypes;


    /**
     * 假删
     */
    private Integer buhuotixingDelete;


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
    public String getBuhuotixingName() {
        return buhuotixingName;
    }


    /**
	 * 设置：物品名称
	 */
    public void setBuhuotixingName(String buhuotixingName) {
        this.buhuotixingName = buhuotixingName;
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
	 * 获取：补货数量
	 */
    public Integer getBuhuotixingNumber() {
        return buhuotixingNumber;
    }


    /**
	 * 设置：补货数量
	 */
    public void setBuhuotixingNumber(Integer buhuotixingNumber) {
        this.buhuotixingNumber = buhuotixingNumber;
    }
    /**
	 * 获取：补货状态
	 */
    public Integer getBuhuotixingStautsTypes() {
        return buhuotixingStautsTypes;
    }


    /**
	 * 设置：补货状态
	 */
    public void setBuhuotixingStautsTypes(Integer buhuotixingStautsTypes) {
        this.buhuotixingStautsTypes = buhuotixingStautsTypes;
    }
    /**
	 * 获取：假删
	 */
    public Integer getBuhuotixingDelete() {
        return buhuotixingDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setBuhuotixingDelete(Integer buhuotixingDelete) {
        this.buhuotixingDelete = buhuotixingDelete;
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
