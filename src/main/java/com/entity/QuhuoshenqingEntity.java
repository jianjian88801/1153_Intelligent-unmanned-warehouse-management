package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 取货申请
 *
 * @author 
 * @email
 */
@TableName("quhuoshenqing")
public class QuhuoshenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QuhuoshenqingEntity() {

	}

	public QuhuoshenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 物品名称
     */
    @TableField(value = "quhuoshenqing_name")

    private String quhuoshenqingName;


    /**
     * 物品类型
     */
    @TableField(value = "buhuotixing_types")

    private Integer buhuotixingTypes;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 取货数量
     */
    @TableField(value = "quhuoshenqing_number")

    private Integer quhuoshenqingNumber;


    /**
     * 审核状态
     */
    @TableField(value = "quhuoshenqing_yesno_types")

    private Integer quhuoshenqingYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "quhuoshenqing_yesno_text")

    private String quhuoshenqingYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物品名称
	 */
    public String getQuhuoshenqingName() {
        return quhuoshenqingName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setQuhuoshenqingName(String quhuoshenqingName) {
        this.quhuoshenqingName = quhuoshenqingName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getBuhuotixingTypes() {
        return buhuotixingTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setBuhuotixingTypes(Integer buhuotixingTypes) {
        this.buhuotixingTypes = buhuotixingTypes;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：员工
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：取货数量
	 */
    public Integer getQuhuoshenqingNumber() {
        return quhuoshenqingNumber;
    }


    /**
	 * 获取：取货数量
	 */

    public void setQuhuoshenqingNumber(Integer quhuoshenqingNumber) {
        this.quhuoshenqingNumber = quhuoshenqingNumber;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getQuhuoshenqingYesnoTypes() {
        return quhuoshenqingYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setQuhuoshenqingYesnoTypes(Integer quhuoshenqingYesnoTypes) {
        this.quhuoshenqingYesnoTypes = quhuoshenqingYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getQuhuoshenqingYesnoText() {
        return quhuoshenqingYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setQuhuoshenqingYesnoText(String quhuoshenqingYesnoText) {
        this.quhuoshenqingYesnoText = quhuoshenqingYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Quhuoshenqing{" +
            "id=" + id +
            ", quhuoshenqingName=" + quhuoshenqingName +
            ", buhuotixingTypes=" + buhuotixingTypes +
            ", yonghuId=" + yonghuId +
            ", quhuoshenqingNumber=" + quhuoshenqingNumber +
            ", quhuoshenqingYesnoTypes=" + quhuoshenqingYesnoTypes +
            ", quhuoshenqingYesnoText=" + quhuoshenqingYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
