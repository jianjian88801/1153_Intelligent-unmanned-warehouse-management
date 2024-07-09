package com.entity.view;

import com.entity.BuhuotixingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 补货提醒
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("buhuotixing")
public class BuhuotixingView extends BuhuotixingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 物品类型的值
		*/
		private String buhuotixingValue;
		/**
		* 补货状态的值
		*/
		private String buhuotixingStautsValue;



	public BuhuotixingView() {

	}

	public BuhuotixingView(BuhuotixingEntity buhuotixingEntity) {
		try {
			BeanUtils.copyProperties(this, buhuotixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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








}
