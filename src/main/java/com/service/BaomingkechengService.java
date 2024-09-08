package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaomingkechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaomingkechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaomingkechengView;


/**
 * 报名课程
 *
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface BaomingkechengService extends IService<BaomingkechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaomingkechengVO> selectListVO(Wrapper<BaomingkechengEntity> wrapper);
   	
   	BaomingkechengVO selectVO(@Param("ew") Wrapper<BaomingkechengEntity> wrapper);
   	
   	List<BaomingkechengView> selectListView(Wrapper<BaomingkechengEntity> wrapper);
   	
   	BaomingkechengView selectView(@Param("ew") Wrapper<BaomingkechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaomingkechengEntity> wrapper);
   	

}

