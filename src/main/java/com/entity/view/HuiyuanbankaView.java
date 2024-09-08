package com.entity.view;

import com.entity.HuiyuanbankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员办卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
@TableName("huiyuanbanka")
public class HuiyuanbankaView  extends HuiyuanbankaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanbankaView(){
	}
 
 	public HuiyuanbankaView(HuiyuanbankaEntity huiyuanbankaEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanbankaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
