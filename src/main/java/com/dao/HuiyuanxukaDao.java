package com.dao;

import com.entity.HuiyuanxukaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanxukaVO;
import com.entity.view.HuiyuanxukaView;


/**
 * 会员续卡
 * 
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface HuiyuanxukaDao extends BaseMapper<HuiyuanxukaEntity> {
	
	List<HuiyuanxukaVO> selectListVO(@Param("ew") Wrapper<HuiyuanxukaEntity> wrapper);
	
	HuiyuanxukaVO selectVO(@Param("ew") Wrapper<HuiyuanxukaEntity> wrapper);
	
	List<HuiyuanxukaView> selectListView(@Param("ew") Wrapper<HuiyuanxukaEntity> wrapper);

	List<HuiyuanxukaView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanxukaEntity> wrapper);
	
	HuiyuanxukaView selectView(@Param("ew") Wrapper<HuiyuanxukaEntity> wrapper);
	

}
