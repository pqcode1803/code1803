package com.jt.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.sys.mapper.UserMapper;
import com.jt.sys.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Integer findCheckUser(String username) {
		Integer count = userMapper.findCheckUser(username);
		return null;
	}

}
