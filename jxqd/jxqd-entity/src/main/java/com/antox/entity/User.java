package com.antox.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 66(987927981@qq.com)<br>
 * @date 2016-02-19
 * 
 * @version 2.0
 */
@SuppressWarnings("serial")
public class User implements Serializable {

	public User(String loginId, String seed, String hash, String accountId, String deviceId, String clientKey, String sales) {
		super();
		this.loginId = loginId;
		this.seed = seed;
		this.hash = hash;
		this.accountId = accountId;
		this.deviceId = deviceId;
		this.clientKey = clientKey;
		this.sales = sales;
	}

	public User(String loginId, String mobile, Date regDate, String regIpv4, String seed, String hash, String accountId, String name, String deviceId, String clientKey, String sales, Integer state) {
		super();
		this.loginId = loginId;
		this.mobile = mobile;
		this.regDate = regDate;
		this.regIpv4 = regIpv4;
		this.seed = seed;
		this.hash = hash;
		this.accountId = accountId;
		this.name = name;
		this.deviceId = deviceId;
		this.clientKey = clientKey;
		this.sales = sales;
		this.citizenCode = "";
		this.citizenImage = "";
		this.student = 0;
		this.state = state;
		this.realname = 0;
		this.realstudent = 0;
	}

	public User() {
	}

	/** 用户编号 */
	private java.lang.String id;

	private Integer regionId;

	/** 登录名称 */
	private java.lang.String loginId;

	/** 绑定邮箱 */
	private java.lang.String email;

	/** 绑定手机 */
	private java.lang.String mobile;

	/** 注册日期 */
	private java.util.Date regDate;

	/** 注册地址 */
	private java.lang.String regIpv4;

	/** 前台登录密码种子。 */
	private java.lang.String seed;

	/** 前台登录密码。 */
	private java.lang.String hash;

	/** 账户编号 */
	private java.lang.String accountId;

	/** 姓名 */
	private java.lang.String name;

	/** 出生年 */
	private java.lang.Integer birthYear;

	/** 出生月 */
	private java.lang.Integer birthMonth;

	/** 出生日 */
	private java.lang.Integer birthDay;

	/***/
	private java.util.Date birthday;

	/** 性别 */
	private java.lang.Integer gender;

	/** VIP级别 */
	private java.lang.Integer vip;

	/** 姓名拼音 */
	private java.lang.String pinyin;

	/** 姓名简拼 */
	private java.lang.String py;

	/** 昵称 */
	private java.lang.String nick;

	/** 头像 */
	private java.lang.String header;

	/** 参数设置 */
	private java.lang.String settings;

	/** 设备唯一标识 */
	private java.lang.String deviceId;

	/** token */
	private java.lang.String clientKey;

	/** 销售人员编码 */
	private java.lang.String sales;

	/** 身份证号 */
	private java.lang.String citizenCode;

	/** 身份证图 */
	private java.lang.String citizenImage;

	/** QQ */
	private java.lang.String qq;

	/** 微信 */
	private java.lang.String weixin;

	/** 微博 */
	private java.lang.String weibo;

	/** 我是学生，0，社会人员，1，学生。 */
	private java.lang.Integer student;

	/** 是否实名 */
	private java.lang.Integer realname;

	/** 是否实名学生 */
	private java.lang.Integer realstudent;

	/** 上次登录时间 */
	private java.util.Date lastLogin;
	/**
	 * 正常状态：1，临时锁定状态，0，禁用或删除状态：-1
	 */
	private java.lang.Integer state;

	public java.lang.String getId() {
		return id;
	}

	/**
	 * 方法: 设置用户编号
	 * 
	 * @param: java.lang.String id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public java.lang.String getLoginId() {
		return loginId;
	}

	/**
	 * 方法: 设置登录名称
	 * 
	 * @param: java.lang.String loginId
	 */
	public void setLoginId(java.lang.String loginId) {
		this.loginId = loginId;
	}

	public java.lang.String getEmail() {
		return email;
	}

	/**
	 * 方法: 设置绑定邮箱
	 * 
	 * @param: java.lang.String email
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getMobile() {
		return mobile;
	}

	/**
	 * 方法: 设置绑定手机
	 * 
	 * @param: java.lang.String mobile
	 */
	public void setMobile(java.lang.String mobile) {
		this.mobile = mobile;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public java.util.Date getRegDate() {
		return regDate;
	}

	/**
	 * 方法: 设置注册日期
	 * 
	 * @param: java.util.Date regDate
	 */
	public void setRegDate(java.util.Date regDate) {
		this.regDate = regDate;
	}

	public java.lang.String getRegIpv4() {
		return regIpv4;
	}

	/**
	 * 方法: 设置注册地址
	 * 
	 * @param: java.lang.String regIpv4
	 */
	public void setRegIpv4(java.lang.String regIpv4) {
		this.regIpv4 = regIpv4;
	}

	public java.lang.String getSeed() {
		return seed;
	}

	/**
	 * 方法: 设置前台登录密码种子。
	 * 
	 * @param: java.lang.String seed
	 */
	public void setSeed(java.lang.String seed) {
		this.seed = seed;
	}

	public java.lang.String getHash() {
		return hash;
	}

	/**
	 * 方法: 设置前台登录密码。
	 * 
	 * @param: java.lang.String hash
	 */
	public void setHash(java.lang.String hash) {
		this.hash = hash;
	}

	public java.lang.String getAccountId() {
		return accountId;
	}

	/**
	 * 方法: 设置账户编号
	 * 
	 * @param: java.lang.Long accountId
	 */
	public void setAccountId(java.lang.String accountId) {
		this.accountId = accountId;
	}

	public java.lang.String getName() {
		return name;
	}

	/**
	 * 方法: 设置姓名
	 * 
	 * @param: java.lang.String name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getBirthYear() {
		return birthYear;
	}

	/**
	 * 方法: 设置出生年
	 * 
	 * @param: java.lang.Integer birthYear
	 */
	public void setBirthYear(java.lang.Integer birthYear) {
		this.birthYear = birthYear;
	}

	public java.lang.Integer getBirthMonth() {
		return birthMonth;
	}

	/**
	 * 方法: 设置出生月
	 * 
	 * @param: java.lang.Integer birthMonth
	 */
	public void setBirthMonth(java.lang.Integer birthMonth) {
		this.birthMonth = birthMonth;
	}

	public java.lang.Integer getBirthDay() {
		return birthDay;
	}

	/**
	 * 方法: 设置出生日
	 * 
	 * @param: java.lang.Integer birthDay
	 */
	public void setBirthDay(java.lang.Integer birthDay) {
		this.birthDay = birthDay;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public java.util.Date getBirthday() {
		return birthday;
	}

	/**
	 * 方法: 设置
	 * 
	 * @param: java.util.Date birthday
	 */
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}

	public java.lang.Integer getGender() {
		return gender;
	}

	/**
	 * 方法: 设置性别
	 * 
	 * @param: java.lang.Integer gender
	 */
	public void setGender(java.lang.Integer gender) {
		this.gender = gender;
	}

	public java.lang.Integer getVip() {
		return vip;
	}

	/**
	 * 方法: 设置VIP级别
	 * 
	 * @param: java.lang.Integer vip
	 */
	public void setVip(java.lang.Integer vip) {
		this.vip = vip;
	}

	public java.lang.String getPinyin() {
		return pinyin;
	}

	/**
	 * 方法: 设置姓名拼音
	 * 
	 * @param: java.lang.String pinyin
	 */
	public void setPinyin(java.lang.String pinyin) {
		this.pinyin = pinyin;
	}

	public java.lang.String getPy() {
		return py;
	}

	/**
	 * 方法: 设置姓名简拼
	 * 
	 * @param: java.lang.String py
	 */
	public void setPy(java.lang.String py) {
		this.py = py;
	}

	public java.lang.String getNick() {
		return nick;
	}

	/**
	 * 方法: 设置昵称
	 * 
	 * @param: java.lang.String nick
	 */
	public void setNick(java.lang.String nick) {
		this.nick = nick;
	}

	public java.lang.String getHeader() {
		return header;
	}

	/**
	 * 方法: 设置头像
	 * 
	 * @param: java.lang.String header
	 */
	public void setHeader(java.lang.String header) {
		this.header = header;
	}

	public java.lang.String getSettings() {
		return settings;
	}

	/**
	 * 方法: 设置参数设置
	 * 
	 * @param: java.lang.String settings
	 */
	public void setSettings(java.lang.String settings) {
		this.settings = settings;
	}

	public java.lang.String getDeviceId() {
		return deviceId;
	}

	/**
	 * 方法: 设置设备唯一标识
	 * 
	 * @param: java.lang.String deviceId
	 */
	public void setDeviceId(java.lang.String deviceId) {
		this.deviceId = deviceId;
	}

	public java.lang.String getClientKey() {
		return clientKey;
	}

	/**
	 * 方法: 设置token
	 * 
	 * @param: java.lang.String clientKey
	 */
	public void setClientKey(java.lang.String clientKey) {
		this.clientKey = clientKey;
	}

	public java.lang.String getSales() {
		return sales;
	}

	/**
	 * 方法: 设置销售人员编码
	 * 
	 * @param: java.lang.String sales
	 */
	public void setSales(java.lang.String sales) {
		this.sales = sales;
	}

	public java.lang.String getCitizenCode() {
		return citizenCode;
	}

	/**
	 * 方法: 设置身份证号
	 * 
	 * @param: java.lang.String citizenCode
	 */
	public void setCitizenCode(java.lang.String citizenCode) {
		this.citizenCode = citizenCode;
	}

	public java.lang.String getCitizenImage() {
		return citizenImage;
	}

	/**
	 * 方法: 设置身份证图
	 * 
	 * @param: java.lang.String citizenImage
	 */
	public void setCitizenImage(java.lang.String citizenImage) {
		this.citizenImage = citizenImage;
	}

	public java.lang.String getQq() {
		return qq;
	}

	/**
	 * 方法: 设置QQ
	 * 
	 * @param: java.lang.String qq
	 */
	public void setQq(java.lang.String qq) {
		this.qq = qq;
	}

	public java.lang.String getWeixin() {
		return weixin;
	}

	/**
	 * 方法: 设置微信
	 * 
	 * @param: java.lang.String weixin
	 */
	public void setWeixin(java.lang.String weixin) {
		this.weixin = weixin;
	}

	public java.lang.String getWeibo() {
		return weibo;
	}

	/**
	 * 方法: 设置微博
	 * 
	 * @param: java.lang.String weibo
	 */
	public void setWeibo(java.lang.String weibo) {
		this.weibo = weibo;
	}

	public java.lang.Integer getStudent() {
		return student;
	}

	/**
	 * 方法: 设置我是学生，0，社会人员，1，学生。
	 * 
	 * @param: java.lang.Integer student
	 */
	public void setStudent(java.lang.Integer student) {
		this.student = student;
	}

	public java.lang.Integer getRealname() {
		return realname;
	}

	/**
	 * 方法: 设置是否实名
	 * 
	 * @param: java.lang.Integer realname
	 */
	public void setRealname(java.lang.Integer realname) {
		this.realname = realname;
	}

	public java.lang.Integer getRealstudent() {
		return realstudent;
	}

	/**
	 * 方法: 设置是否实名学生
	 * 
	 * @param: java.lang.Integer realstudent
	 */
	public void setRealstudent(java.lang.Integer realstudent) {
		this.realstudent = realstudent;
	}

	public java.lang.Integer getState() {
		return state;
	}

	/**
	 * 方法: 设置正常状态：1，临时锁定状态，0，禁用或删除状态：-1
	 * 
	 * @param: java.lang.Integer state
	 */
	public void setState(java.lang.Integer state) {
		this.state = state;
	}

	public java.util.Date getLastLogin() {
		return lastLogin;
	}

	/**
	 * 
	 * 
	 * @param: java.lang.Integer state
	 */
	public void setLastLogin(java.util.Date lastLogin) {
		this.lastLogin = lastLogin;
	}
}
