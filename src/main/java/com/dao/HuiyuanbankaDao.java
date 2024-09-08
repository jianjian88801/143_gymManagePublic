package com.dao;

import com.entity.HuiyuanbankaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanbankaVO;
import com.entity.view.HuiyuanbankaView;


/**
 * 会员办卡
 * 
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface HuiyuanbankaDao extends BaseMapper<HuiyuanbankaEntity> {
	
	List<HuiyuanbankaVO> selectListVO(@Param("ew") Wrapper<HuiyuanbankaEntity> wrapper);
	
	HuiyuanbankaVO selectVO(@Param("ew") Wrapper<HuiyuanbankaEntity> wrapper);
	
	List<HuiyuanbankaView> selectListView(@Param("ew") Wrapper<HuiyuanbankaEntity> wrapper);

	List<HuiyuanbankaView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanbankaEntity> wrapper);
	
	HuiyuanbankaView selectView(@Param("ew") Wrapper<HuiyuanbankaEntity> wrapper);
	

}
