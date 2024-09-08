package com.entity.view;

import com.entity.YuechongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 余额充值
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
@TableName("yuechongzhi")
public class YuechongzhiView  extends YuechongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuechongzhiView(){
	}
 
 	public YuechongzhiView(YuechongzhiEntity yuechongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, yuechongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
