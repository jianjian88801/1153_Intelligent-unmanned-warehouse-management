package com.entity.vo;

import com.entity.BuhuotixingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 补货提醒
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("buhuotixing")
public class BuhuotixingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
