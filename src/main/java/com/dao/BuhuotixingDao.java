package com.dao;

import com.entity.BuhuotixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BuhuotixingView;

/**
 * 补货提醒 Dao 接口
 *
 * @author 
 */
public interface BuhuotixingDao extends BaseMapper<BuhuotixingEntity> {

   List<BuhuotixingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
