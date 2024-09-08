package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DaoqitixingDao;
import com.entity.DaoqitixingEntity;
import com.service.DaoqitixingService;
import com.entity.vo.DaoqitixingVO;
import com.entity.view.DaoqitixingView;

@Service("daoqitixingService")
public class DaoqitixingServiceImpl extends ServiceImpl<DaoqitixingDao, DaoqitixingEntity> implements DaoqitixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaoqitixingEntity> page = this.selectPage(
                new Query<DaoqitixingEntity>(params).getPage(),
                new EntityWrapper<DaoqitixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaoqitixingEntity> wrapper) {
		  Page<DaoqitixingView> page =new Query<DaoqitixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaoqitixingVO> selectListVO(Wrapper<DaoqitixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaoqitixingVO selectVO(Wrapper<DaoqitixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaoqitixingView> selectListView(Wrapper<DaoqitixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaoqitixingView selectView(Wrapper<DaoqitixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
