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


import com.dao.YuechongzhiDao;
import com.entity.YuechongzhiEntity;
import com.service.YuechongzhiService;
import com.entity.vo.YuechongzhiVO;
import com.entity.view.YuechongzhiView;

@Service("yuechongzhiService")
public class YuechongzhiServiceImpl extends ServiceImpl<YuechongzhiDao, YuechongzhiEntity> implements YuechongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuechongzhiEntity> page = this.selectPage(
                new Query<YuechongzhiEntity>(params).getPage(),
                new EntityWrapper<YuechongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuechongzhiEntity> wrapper) {
		  Page<YuechongzhiView> page =new Query<YuechongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuechongzhiVO> selectListVO(Wrapper<YuechongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuechongzhiVO selectVO(Wrapper<YuechongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuechongzhiView> selectListView(Wrapper<YuechongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuechongzhiView selectView(Wrapper<YuechongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
