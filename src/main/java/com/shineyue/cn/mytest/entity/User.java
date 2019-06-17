package com.shineyue.cn.mytest.entity;

import java.util.Date;

public class User {
	Integer userid;
	String username;
	Integer age;
	Date birth;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", age=" + age + ", birth=" + birth + "]";
	}
	
	
}