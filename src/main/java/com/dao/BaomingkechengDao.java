package com.dao;

import com.entity.BaomingkechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaomingkechengVO;
import com.entity.view.BaomingkechengView;


/**
 * 报名课程
 * 
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface BaomingkechengDao extends BaseMapper<BaomingkechengEntity> {
	
	List<BaomingkechengVO> selectListVO(@Param("ew") Wrapper<BaomingkechengEntity> wrapper);
	
	BaomingkechengVO selectVO(@Param("ew") Wrapper<BaomingkechengEntity> wrapper);
	
	List<BaomingkechengView> selectListView(@Param("ew") Wrapper<BaomingkechengEntity> wrapper);

	List<BaomingkechengView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingkechengEntity> wrapper);
	
	BaomingkechengView selectView(@Param("ew") Wrapper<BaomingkechengEntity> wrapper);
	

}
