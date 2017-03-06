package com.imooc.model;

import java.util.Date;

public class Goddess {
	private Integer id;
	private String user_name;
	private Integer sex;
	private Integer age;
	private Date birthday;
	private String email;
	private String mobile;
	private String creater_user;
	private String update_user;
	private Date creater_date;
	private Date update_date;
	private Integer isdel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreater_user() {
		return creater_user;
	}

	public void setCreater_user(String creater_user) {
		this.creater_user = creater_user;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public Date getCreater_date() {
		return creater_date;
	}

	public void setCreater_date(Date creater_date) {
		this.creater_date = creater_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "Goddess [id=" + id + ", user_name=" + user_name + ", sex=" + sex + ", age=" + age + ", birthday="
				+ birthday + ", email=" + email + ", mobile=" + mobile + ", creater_user=" + creater_user
				+ ", update_user=" + update_user + ", creater_date=" + creater_date + ", update_date=" + update_date
				+ ", isdel=" + isdel + "]";
	}

}
