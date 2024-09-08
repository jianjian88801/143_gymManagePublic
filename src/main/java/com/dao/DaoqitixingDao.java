package com.dao;

import com.entity.DaoqitixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaoqitixingVO;
import com.entity.view.DaoqitixingView;


/**
 * 到期提醒
 * 
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface DaoqitixingDao extends BaseMapper<DaoqitixingEntity> {
	
	List<DaoqitixingVO> selectListVO(@Param("ew") Wrapper<DaoqitixingEntity> wrapper);
	
	DaoqitixingVO selectVO(@Param("ew") Wrapper<DaoqitixingEntity> wrapper);
	
	List<DaoqitixingView> selectListView(@Param("ew") Wrapper<DaoqitixingEntity> wrapper);

	List<DaoqitixingView> selectListView(Pagination page,@Param("ew") Wrapper<DaoqitixingEntity> wrapper);
	
	DaoqitixingView selectView(@Param("ew") Wrapper<DaoqitixingEntity> wrapper);
	

}
