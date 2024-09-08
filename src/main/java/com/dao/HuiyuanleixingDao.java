package com.dao;

import com.entity.HuiyuanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanleixingVO;
import com.entity.view.HuiyuanleixingView;


/**
 * 会员类型
 * 
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface HuiyuanleixingDao extends BaseMapper<HuiyuanleixingEntity> {
	
	List<HuiyuanleixingVO> selectListVO(@Param("ew") Wrapper<HuiyuanleixingEntity> wrapper);
	
	HuiyuanleixingVO selectVO(@Param("ew") Wrapper<HuiyuanleixingEntity> wrapper);
	
	List<HuiyuanleixingView> selectListView(@Param("ew") Wrapper<HuiyuanleixingEntity> wrapper);

	List<HuiyuanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanleixingEntity> wrapper);
	
	HuiyuanleixingView selectView(@Param("ew") Wrapper<HuiyuanleixingEntity> wrapper);
	

}
