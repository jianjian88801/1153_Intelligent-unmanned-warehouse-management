package com.entity.vo;

import com.entity.BuhuoshneqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 补货申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("buhuoshneqing")
public class BuhuoshneqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
