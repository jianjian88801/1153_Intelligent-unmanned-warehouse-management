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
 * 补货申请
 *
 * @author 
 * @email
 */
@TableName("buhuoshneqing")
public class BuhuoshneqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BuhuoshneqingEntity() {

	}

	public BuhuoshneqingEntity(T t) {
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
     * 补货信息
     */
    @TableField(value = "buhuotixing_id")

    private Integer buhuotixingId;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 审核状态
     */
    @TableField(value = "buhuoshneqing_yesno_types")

    private Integer buhuoshneqingYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "buhuoshneqing_yesno_text")

    private String buhuoshneqingYesnoText;


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
	 * 设置：补货信息
	 */
    public Integer getBuhuotixingId() {
        return buhuotixingId;
    }


    /**
	 * 获取：补货信息
	 */

    public void setBuhuotixingId(Integer buhuotixingId) {
        this.buhuotixingId = buhuotixingId;
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
	 * 设置：审核状态
	 */
    public Integer getBuhuoshneqingYesnoTypes() {
        return buhuoshneqingYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setBuhuoshneqingYesnoTypes(Integer buhuoshneqingYesnoTypes) {
        this.buhuoshneqingYesnoTypes = buhuoshneqingYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getBuhuoshneqingYesnoText() {
        return buhuoshneqingYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setBuhuoshneqingYesnoText(String buhuoshneqingYesnoText) {
        this.buhuoshneqingYesnoText = buhuoshneqingYesnoText;
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
        return "Buhuoshneqing{" +
            "id=" + id +
            ", buhuotixingId=" + buhuotixingId +
            ", yonghuId=" + yonghuId +
            ", buhuoshneqingYesnoTypes=" + buhuoshneqingYesnoTypes +
            ", buhuoshneqingYesnoText=" + buhuoshneqingYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
