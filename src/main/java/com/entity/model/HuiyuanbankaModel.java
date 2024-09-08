package com.entity.model;

import com.entity.HuiyuanbankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员办卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public class HuiyuanbankaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 会员卡类型
	 */
	
	private String huiyuankaleixing;
		
	/**
	 * 售价
	 */
	
	private Float jine;
		
	/**
	 * 有效天数
	 */
	
	private String youxiaotianshu;
		
	/**
	 * 办卡时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bankashijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：会员卡类型
	 */
	 
	public void setHuiyuankaleixing(String huiyuankaleixing) {
		this.huiyuankaleixing = huiyuankaleixing;
	}
	
	/**
	 * 获取：会员卡类型
	 */
	public String getHuiyuankaleixing() {
		return huiyuankaleixing;
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
	 * 设置：有效天数
	 */
	 
	public void setYouxiaotianshu(String youxiaotianshu) {
		this.youxiaotianshu = youxiaotianshu;
	}
	
	/**
	 * 获取：有效天数
	 */
	public String getYouxiaotianshu() {
		return youxiaotianshu;
	}
				
	
	/**
	 * 设置：办卡时间
	 */
	 
	public void setBankashijian(Date bankashijian) {
		this.bankashijian = bankashijian;
	}
	
	/**
	 * 获取：办卡时间
	 */
	public Date getBankashijian() {
		return bankashijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}