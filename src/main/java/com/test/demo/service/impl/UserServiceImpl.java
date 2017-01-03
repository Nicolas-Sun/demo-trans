package com.test.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.bean.User;
import com.test.demo.dao.IUserDao;
import com.test.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}

	public User getUserById(int id) {
		return userDao.selectById(id);
	}
}
