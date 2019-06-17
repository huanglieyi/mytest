package com.shineyue.cn.mytest.service;

import java.util.Date;

import com.shineyue.cn.mytest.entity.User;

public interface IMessageService {
	/**
	 * 查询用户信息
	 * @param id 用户id
	 * @param name 用户名
	 * @param age  用户年龄
	 * @param birthday  用户生日
	 * @return 
	 */
	User find(Integer userid);

	
}
