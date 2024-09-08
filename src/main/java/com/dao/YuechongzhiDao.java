package com.dao;

import com.entity.YuechongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuechongzhiVO;
import com.entity.view.YuechongzhiView;


/**
 * 余额充值
 * 
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface YuechongzhiDao extends BaseMapper<YuechongzhiEntity> {
	
	List<YuechongzhiVO> selectListVO(@Param("ew") Wrapper<YuechongzhiEntity> wrapper);
	
	YuechongzhiVO selectVO(@Param("ew") Wrapper<YuechongzhiEntity> wrapper);
	
	List<YuechongzhiView> selectListView(@Param("ew") Wrapper<YuechongzhiEntity> wrapper);

	List<YuechongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<YuechongzhiEntity> wrapper);
	
	YuechongzhiView selectView(@Param("ew") Wrapper<YuechongzhiEntity> wrapper);
	

}
