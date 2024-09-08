package com.dao;

import com.entity.JianshenshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenshangpinVO;
import com.entity.view.JianshenshangpinView;


/**
 * 健身商品
 * 
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface JianshenshangpinDao extends BaseMapper<JianshenshangpinEntity> {
	
	List<JianshenshangpinVO> selectListVO(@Param("ew") Wrapper<JianshenshangpinEntity> wrapper);
	
	JianshenshangpinVO selectVO(@Param("ew") Wrapper<JianshenshangpinEntity> wrapper);
	
	List<JianshenshangpinView> selectListView(@Param("ew") Wrapper<JianshenshangpinEntity> wrapper);

	List<JianshenshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenshangpinEntity> wrapper);
	
	JianshenshangpinView selectView(@Param("ew") Wrapper<JianshenshangpinEntity> wrapper);
	

}
