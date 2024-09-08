package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanleixingView;


/**
 * 会员类型
 *
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface HuiyuanleixingService extends IService<HuiyuanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanleixingVO> selectListVO(Wrapper<HuiyuanleixingEntity> wrapper);
   	
   	HuiyuanleixingVO selectVO(@Param("ew") Wrapper<HuiyuanleixingEntity> wrapper);
   	
   	List<HuiyuanleixingView> selectListView(Wrapper<HuiyuanleixingEntity> wrapper);
   	
   	HuiyuanleixingView selectView(@Param("ew") Wrapper<HuiyuanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanleixingEntity> wrapper);
   	

}

