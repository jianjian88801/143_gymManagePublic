package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanbankaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanbankaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanbankaView;


/**
 * 会员办卡
 *
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface HuiyuanbankaService extends IService<HuiyuanbankaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanbankaVO> selectListVO(Wrapper<HuiyuanbankaEntity> wrapper);
   	
   	HuiyuanbankaVO selectVO(@Param("ew") Wrapper<HuiyuanbankaEntity> wrapper);
   	
   	List<HuiyuanbankaView> selectListView(Wrapper<HuiyuanbankaEntity> wrapper);
   	
   	HuiyuanbankaView selectView(@Param("ew") Wrapper<HuiyuanbankaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanbankaEntity> wrapper);
   	

}

