package com.shineyue.cn.mytest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shineyue.cn.mytest.entity.User;
import com.shineyue.cn.mytest.mapper.MessageDao;
import com.shineyue.cn.mytest.service.IMessageService;
@Service
public class MessageImpl implements IMessageService{
	@Autowired
	MessageDao messageDao;

	@Override
	public User find(Integer userid) {
		User user = messageDao.getOne(userid);
		return user;
	}
	
//	private User get(Integer id) {
//		User rows = messageDao.getOne(id);
//		return rows;
//		
//	}
	

}
