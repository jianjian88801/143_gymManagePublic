package com.entity.view;

import com.entity.HuiyuanxukaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员续卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
@TableName("huiyuanxuka")
public class HuiyuanxukaView  extends HuiyuanxukaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanxukaView(){
	}
 
 	public HuiyuanxukaView(HuiyuanxukaEntity huiyuanxukaEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanxukaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
