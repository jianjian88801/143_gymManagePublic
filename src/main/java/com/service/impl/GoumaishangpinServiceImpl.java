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


import com.dao.GoumaishangpinDao;
import com.entity.GoumaishangpinEntity;
import com.service.GoumaishangpinService;
import com.entity.vo.GoumaishangpinVO;
import com.entity.view.GoumaishangpinView;

@Service("goumaishangpinService")
public class GoumaishangpinServiceImpl extends ServiceImpl<GoumaishangpinDao, GoumaishangpinEntity> implements GoumaishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaishangpinEntity> page = this.selectPage(
                new Query<GoumaishangpinEntity>(params).getPage(),
                new EntityWrapper<GoumaishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaishangpinEntity> wrapper) {
		  Page<GoumaishangpinView> page =new Query<GoumaishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaishangpinVO> selectListVO(Wrapper<GoumaishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaishangpinVO selectVO(Wrapper<GoumaishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaishangpinView> selectListView(Wrapper<GoumaishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaishangpinView selectView(Wrapper<GoumaishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
