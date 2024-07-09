package com.entity.view;

import com.entity.BuhuoshneqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 补货申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("buhuoshneqing")
public class BuhuoshneqingView extends BuhuoshneqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核状态的值
		*/
		private String buhuoshneqingYesnoValue;



		//级联表 buhuotixing
			/**
			* 物品名称
			*/
			private String buhuotixingName;
			/**
			* 物品类型
			*/
			private Integer buhuotixingTypes;
				/**
				* 物品类型的值
				*/
				private String buhuotixingValue;
			/**
			* 补货数量
			*/
			private Integer buhuotixingNumber;
			/**
			* 补货状态
			*/
			private Integer buhuotixingStautsTypes;
				/**
				* 补货状态的值
				*/
				private String buhuotixingStautsValue;
			/**
			* 假删
			*/
			private Integer buhuotixingDelete;

		//级联表 yonghu
			/**
			* 员工姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 员工手机号
			*/
			private String yonghuPhone;
			/**
			* 员工身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public BuhuoshneqingView() {

	}

	public BuhuoshneqingView(BuhuoshneqingEntity buhuoshneqingEntity) {
		try {
			BeanUtils.copyProperties(this, buhuoshneqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核状态的值
			*/
			public String getBuhuoshneqingYesnoValue() {
				return buhuoshneqingYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setBuhuoshneqingYesnoValue(String buhuoshneqingYesnoValue) {
				this.buhuoshneqingYesnoValue = buhuoshneqingYesnoValue;
			}







				//级联表的get和set buhuotixing
					/**
					* 获取： 物品名称
					*/
					public String getBuhuotixingName() {
						return buhuotixingName;
					}
					/**
					* 设置： 物品名称
					*/
					public void setBuhuotixingName(String buhuotixingName) {
						this.buhuotixingName = buhuotixingName;
					}
					/**
					* 获取： 物品类型
					*/
					public Integer getBuhuotixingTypes() {
						return buhuotixingTypes;
					}
					/**
					* 设置： 物品类型
					*/
					public void setBuhuotixingTypes(Integer buhuotixingTypes) {
						this.buhuotixingTypes = buhuotixingTypes;
					}


						/**
						* 获取： 物品类型的值
						*/
						public String getBuhuotixingValue() {
							return buhuotixingValue;
						}
						/**
						* 设置： 物品类型的值
						*/
						public void setBuhuotixingValue(String buhuotixingValue) {
							this.buhuotixingValue = buhuotixingValue;
						}
					/**
					* 获取： 补货数量
					*/
					public Integer getBuhuotixingNumber() {
						return buhuotixingNumber;
					}
					/**
					* 设置： 补货数量
					*/
					public void setBuhuotixingNumber(Integer buhuotixingNumber) {
						this.buhuotixingNumber = buhuotixingNumber;
					}
					/**
					* 获取： 补货状态
					*/
					public Integer getBuhuotixingStautsTypes() {
						return buhuotixingStautsTypes;
					}
					/**
					* 设置： 补货状态
					*/
					public void setBuhuotixingStautsTypes(Integer buhuotixingStautsTypes) {
						this.buhuotixingStautsTypes = buhuotixingStautsTypes;
					}


						/**
						* 获取： 补货状态的值
						*/
						public String getBuhuotixingStautsValue() {
							return buhuotixingStautsValue;
						}
						/**
						* 设置： 补货状态的值
						*/
						public void setBuhuotixingStautsValue(String buhuotixingStautsValue) {
							this.buhuotixingStautsValue = buhuotixingStautsValue;
						}
					/**
					* 获取： 假删
					*/
					public Integer getBuhuotixingDelete() {
						return buhuotixingDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setBuhuotixingDelete(Integer buhuotixingDelete) {
						this.buhuotixingDelete = buhuotixingDelete;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 员工姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 员工手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 员工手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 员工身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 员工身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
