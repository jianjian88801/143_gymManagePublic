package com.entity.model;

import com.entity.HuiyuanleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员类型
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public class HuiyuanleixingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 有效天数
	 */
	
	private Integer youxiaotianshu;
		
	/**
	 * 售价
	 */
	
	private Float jine;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：有效天数
	 */
	 
	public void setYouxiaotianshu(Integer youxiaotianshu) {
		this.youxiaotianshu = youxiaotianshu;
	}
	
	/**
	 * 获取：有效天数
	 */
	public Integer getYouxiaotianshu() {
		return youxiaotianshu;
	}
				
	
	/**
	 * 设置：售价
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：售价
	 */
	public Float getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
