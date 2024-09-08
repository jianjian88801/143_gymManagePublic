package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuechongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuechongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuechongzhiView;


/**
 * 余额充值
 *
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface YuechongzhiService extends IService<YuechongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuechongzhiVO> selectListVO(Wrapper<YuechongzhiEntity> wrapper);
   	
   	YuechongzhiVO selectVO(@Param("ew") Wrapper<YuechongzhiEntity> wrapper);
   	
   	List<YuechongzhiView> selectListView(Wrapper<YuechongzhiEntity> wrapper);
   	
   	YuechongzhiView selectView(@Param("ew") Wrapper<YuechongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuechongzhiEntity> wrapper);
   	

}

