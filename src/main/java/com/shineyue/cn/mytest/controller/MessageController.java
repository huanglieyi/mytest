package com.shineyue.cn.mytest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shineyue.cn.mytest.entity.User;
import com.shineyue.cn.mytest.service.IMessageService;

@RestController
public class MessageController {
	@Autowired
	IMessageService imessageService;
	
	@RequestMapping("/message")
	public User use(Integer userid) {
		User user = imessageService.find(userid);
		System.out.println(user);
		return user;
	}
	
	
	
}
