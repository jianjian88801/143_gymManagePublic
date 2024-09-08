package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaishangpinView;


/**
 * 购买商品
 *
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface GoumaishangpinService extends IService<GoumaishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaishangpinVO> selectListVO(Wrapper<GoumaishangpinEntity> wrapper);
   	
   	GoumaishangpinVO selectVO(@Param("ew") Wrapper<GoumaishangpinEntity> wrapper);
   	
   	List<GoumaishangpinView> selectListView(Wrapper<GoumaishangpinEntity> wrapper);
   	
   	GoumaishangpinView selectView(@Param("ew") Wrapper<GoumaishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaishangpinEntity> wrapper);
   	

}

