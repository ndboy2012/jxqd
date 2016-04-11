package com.antox.entity;

/**
 * @author 66(987927981@qq.com)<br>
 * @date 2016-01-05
 * 
 * @version 2.0
 */
public class ConstArea {

	/** 自动编号，行政区域的编号，非自增值。 */
	private java.lang.Integer id;

	/** 行政地区的全名称：合肥市，安徽省等，包括了市或省等行政级别的名称。 */
	private java.lang.String areaName;

	/** 行政名称的短名称，如安徽省，简称：安徽； */
	private java.lang.String shortName;

	/** 省、市，县，区，直辖市等 */
	private java.lang.String rank;

	/** 如合肥市全拼为:he fei shi，行政名称的拼音。 */
	private java.lang.String pinyin;

	/** 如合肥，简拼为hf */
	private java.lang.String py;

	/***/
	private java.lang.Integer parentId;

	/** 1：省、直辖市或自治区，2：区，市等；3：市内的区、县或县级市。 */
	private java.lang.Integer level;

	/** 安徽称为皖，合肥称为合等，南京称为宁等，如果不知道，设为空。 */
	private java.lang.String alias;

	/** 纬度 */
	private java.lang.Double latitude;

	/** 经度 */
	private java.lang.Double longitude;

	/** 地区编号 */
	private java.lang.String areaCode;

	/** 本地区的邮政编码，仅供参考使用，现在邮编基本上已经没有意义。 */
	private java.lang.String zipCode;

	/** 在相同父地区下的排序号； */
	private java.lang.Integer sortNo;
	
	// 0，表示未开通，1，表示已开通
	private Integer state;

	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * 方法: 设置自动编号，行政区域的编号，非自增值。
	 * 
	 * @param: java.lang.Integer id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getAreaName() {
		return areaName;
	}

	/**
	 * 方法: 设置行政地区的全名称：合肥市，安徽省等，包括了市或省等行政级别的名称。
	 * 
	 * @param: java.lang.String areaName
	 */
	public void setAreaName(java.lang.String areaName) {
		this.areaName = areaName;
	}

	public java.lang.String getShortName() {
		return shortName;
	}

	/**
	 * 方法: 设置行政名称的短名称，如安徽省，简称：安徽；
	 * 
	 * @param: java.lang.String shortName
	 */
	public void setShortName(java.lang.String shortName) {
		this.shortName = shortName;
	}

	public java.lang.String getRank() {
		return rank;
	}

	/**
	 * 方法: 设置省、市，县，区，直辖市等
	 * 
	 * @param: java.lang.String rank
	 */
	public void setRank(java.lang.String rank) {
		this.rank = rank;
	}

	public java.lang.String getPinyin() {
		return pinyin;
	}

	/**
	 * 方法: 设置如合肥市全拼为:he fei shi，行政名称的拼音。
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
	 * 方法: 设置如合肥，简拼为hf
	 * 
	 * @param: java.lang.String py
	 */
	public void setPy(java.lang.String py) {
		this.py = py;
	}

	public java.lang.Integer getParentId() {
		return parentId;
	}

	/**
	 * 方法: 设置
	 * 
	 * @param: java.lang.Integer parentId
	 */
	public void setParentId(java.lang.Integer parentId) {
		this.parentId = parentId;
	}

	public java.lang.Integer getLevel() {
		return level;
	}

	/**
	 * 方法: 设置1：省、直辖市或自治区，2：区，市等；3：市内的区、县或县级市。
	 * 
	 * @param: java.lang.Integer level
	 */
	public void setLevel(java.lang.Integer level) {
		this.level = level;
	}

	public java.lang.String getAlias() {
		return alias;
	}

	/**
	 * 方法: 设置安徽称为皖，合肥称为合等，南京称为宁等，如果不知道，设为空。
	 * 
	 * @param: java.lang.String alias
	 */
	public void setAlias(java.lang.String alias) {
		this.alias = alias;
	}

	public java.lang.Double getLatitude() {
		return latitude;
	}

	/**
	 * 方法: 设置纬度
	 * 
	 * @param: java.lang.Double latitude
	 */
	public void setLatitude(java.lang.Double latitude) {
		this.latitude = latitude;
	}

	public java.lang.Double getLongitude() {
		return longitude;
	}

	/**
	 * 方法: 设置经度
	 * 
	 * @param: java.lang.Double longitude
	 */
	public void setLongitude(java.lang.Double longitude) {
		this.longitude = longitude;
	}

	public java.lang.String getAreaCode() {
		return areaCode;
	}

	/**
	 * 方法: 设置地区编号
	 * 
	 * @param: java.lang.String areaCode
	 */
	public void setAreaCode(java.lang.String areaCode) {
		this.areaCode = areaCode;
	}

	public java.lang.String getZipCode() {
		return zipCode;
	}

	/**
	 * 方法: 设置本地区的邮政编码，仅供参考使用，现在邮编基本上已经没有意义。
	 * 
	 * @param: java.lang.String zipCode
	 */
	public void setZipCode(java.lang.String zipCode) {
		this.zipCode = zipCode;
	}

	public java.lang.Integer getSortNo() {
		return sortNo;
	}

	/**
	 * 方法: 设置在相同父地区下的排序号；
	 * 
	 * @param: java.lang.Integer sortNo
	 */
	public void setSortNo(java.lang.Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Integer getState() {
		if(state == null)  return 0;
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}
