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
 * 补货提醒
 *
 * @author 
 * @email
 */
@TableName("buhuotixing")
public class BuhuotixingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BuhuotixingEntity() {

	}

	public BuhuotixingEntity(T t) {
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
    @TableField(value = "buhuotixing_name")

    private String buhuotixingName;


    /**
     * 物品类型
     */
    @TableField(value = "buhuotixing_types")

    private Integer buhuotixingTypes;


    /**
     * 补货数量
     */
    @TableField(value = "buhuotixing_number")

    private Integer buhuotixingNumber;


    /**
     * 补货状态
     */
    @TableField(value = "buhuotixing_stauts_types")

    private Integer buhuotixingStautsTypes;


    /**
     * 假删
     */
    @TableField(value = "buhuotixing_delete")

    private Integer buhuotixingDelete;


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
    public String getBuhuotixingName() {
        return buhuotixingName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setBuhuotixingName(String buhuotixingName) {
        this.buhuotixingName = buhuotixingName;
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
	 * 设置：补货数量
	 */
    public Integer getBuhuotixingNumber() {
        return buhuotixingNumber;
    }


    /**
	 * 获取：补货数量
	 */

    public void setBuhuotixingNumber(Integer buhuotixingNumber) {
        this.buhuotixingNumber = buhuotixingNumber;
    }
    /**
	 * 设置：补货状态
	 */
    public Integer getBuhuotixingStautsTypes() {
        return buhuotixingStautsTypes;
    }


    /**
	 * 获取：补货状态
	 */

    public void setBuhuotixingStautsTypes(Integer buhuotixingStautsTypes) {
        this.buhuotixingStautsTypes = buhuotixingStautsTypes;
    }
    /**
	 * 设置：假删
	 */
    public Integer getBuhuotixingDelete() {
        return buhuotixingDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setBuhuotixingDelete(Integer buhuotixingDelete) {
        this.buhuotixingDelete = buhuotixingDelete;
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
        return "Buhuotixing{" +
            "id=" + id +
            ", buhuotixingName=" + buhuotixingName +
            ", buhuotixingTypes=" + buhuotixingTypes +
            ", buhuotixingNumber=" + buhuotixingNumber +
            ", buhuotixingStautsTypes=" + buhuotixingStautsTypes +
            ", buhuotixingDelete=" + buhuotixingDelete +
            ", createTime=" + createTime +
        "}";
    }
}
