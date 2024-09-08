package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenshangpinView;


/**
 * 健身商品
 *
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface JianshenshangpinService extends IService<JianshenshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenshangpinVO> selectListVO(Wrapper<JianshenshangpinEntity> wrapper);
   	
   	JianshenshangpinVO selectVO(@Param("ew") Wrapper<JianshenshangpinEntity> wrapper);
   	
   	List<JianshenshangpinView> selectListView(Wrapper<JianshenshangpinEntity> wrapper);
   	
   	JianshenshangpinView selectView(@Param("ew") Wrapper<JianshenshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenshangpinEntity> wrapper);
   	

}

