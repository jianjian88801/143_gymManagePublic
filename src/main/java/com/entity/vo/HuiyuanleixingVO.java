package com.entity.vo;

import com.entity.HuiyuanleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员类型
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public class HuiyuanleixingVO  implements Serializable {
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
