package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanxukaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanxukaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanxukaView;


/**
 * 会员续卡
 *
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public interface HuiyuanxukaService extends IService<HuiyuanxukaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanxukaVO> selectListVO(Wrapper<HuiyuanxukaEntity> wrapper);
   	
   	HuiyuanxukaVO selectVO(@Param("ew") Wrapper<HuiyuanxukaEntity> wrapper);
   	
   	List<HuiyuanxukaView> selectListView(Wrapper<HuiyuanxukaEntity> wrapper);
   	
   	HuiyuanxukaView selectView(@Param("ew") Wrapper<HuiyuanxukaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanxukaEntity> wrapper);
   	

}

