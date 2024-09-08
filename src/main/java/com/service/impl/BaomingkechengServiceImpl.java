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


import com.dao.BaomingkechengDao;
import com.entity.BaomingkechengEntity;
import com.service.BaomingkechengService;
import com.entity.vo.BaomingkechengVO;
import com.entity.view.BaomingkechengView;

@Service("baomingkechengService")
public class BaomingkechengServiceImpl extends ServiceImpl<BaomingkechengDao, BaomingkechengEntity> implements BaomingkechengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaomingkechengEntity> page = this.selectPage(
                new Query<BaomingkechengEntity>(params).getPage(),
                new EntityWrapper<BaomingkechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaomingkechengEntity> wrapper) {
		  Page<BaomingkechengView> page =new Query<BaomingkechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaomingkechengVO> selectListVO(Wrapper<BaomingkechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaomingkechengVO selectVO(Wrapper<BaomingkechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaomingkechengView> selectListView(Wrapper<BaomingkechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaomingkechengView selectView(Wrapper<BaomingkechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
