package com.entity.vo;

import com.entity.HuiyuanxukaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员续卡
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-07 08:13:51
 */
public class HuiyuanxukaVO  implements Serializable {
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
	 * 续卡时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xukashijian;
		
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
	 * 设置：续卡时间
	 */
	 
	public void setXukashijian(Date xukashijian) {
		this.xukashijian = xukashijian;
	}
	
	/**
	 * 获取：续卡时间
	 */
	public Date getXukashijian() {
		return xukashijian;
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
