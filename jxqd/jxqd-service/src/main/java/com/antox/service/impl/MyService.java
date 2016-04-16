package com.antox.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antox.dao.IUserDao;
import com.antox.entity.User;
import com.antox.service.IMyService;

@Service
public class MyService implements IMyService {
	
	@Autowired
	private IUserDao userDao;

	@Override
	public User queryLoginId(String loginId) {
		return userDao.queryUserByLoginId(loginId);
	}
	 
}
