package com.gionee.baserom.search.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class HotKeys {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column hot_keys.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column hot_keys.url
	 * @mbggenerated
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column hot_keys.hot_key
	 * @mbggenerated
	 */
	private String hotKey;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column hot_keys.stats
	 * @mbggenerated
	 */
	private Integer stats;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column hot_keys.sort_id
	 * @mbggenerated
	 */
	private Integer sortId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column hot_keys.type
	 * @mbggenerated
	 */
	private Integer type;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column hot_keys.id
	 * @return  the value of hot_keys.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column hot_keys.id
	 * @param id  the value for hot_keys.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column hot_keys.url
	 * @return  the value of hot_keys.url
	 * @mbggenerated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column hot_keys.url
	 * @param url  the value for hot_keys.url
	 * @mbggenerated
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column hot_keys.hot_key
	 * @return  the value of hot_keys.hot_key
	 * @mbggenerated
	 */
	public String getHotKey() {
		return hotKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column hot_keys.hot_key
	 * @param hotKey  the value for hot_keys.hot_key
	 * @mbggenerated
	 */
	public void setHotKey(String hotKey) {
		this.hotKey = hotKey == null ? null : hotKey.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column hot_keys.stats
	 * @return  the value of hot_keys.stats
	 * @mbggenerated
	 */
	public Integer getStats() {
		return stats;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column hot_keys.stats
	 * @param stats  the value for hot_keys.stats
	 * @mbggenerated
	 */
	public void setStats(Integer stats) {
		this.stats = stats;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column hot_keys.sort_id
	 * @return  the value of hot_keys.sort_id
	 * @mbggenerated
	 */
	public Integer getSortId() {
		return sortId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column hot_keys.sort_id
	 * @param sortId  the value for hot_keys.sort_id
	 * @mbggenerated
	 */
	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column hot_keys.type
	 * @return  the value of hot_keys.type
	 * @mbggenerated
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column hot_keys.type
	 * @param type  the value for hot_keys.type
	 * @mbggenerated
	 */
	public void setType(Integer type) {
		this.type = type;
	}
}