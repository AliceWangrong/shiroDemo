package com.yang.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.dao.UserDao;
import com.yang.entity.User;
import com.yang.service.UserService;
/**
 * 
 * created by yangqing on 2018年2月19日 下午9:45:51
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public User getByUserName(String username) {
		return userDao.getByUserName(username);
	}

	public Set<String> getRoles(String username) {
		return userDao.getRoles(username);
	}

	public Set<String> getPermissions(String username) {
		return userDao.getPermissions(username);
	}

	public List<User> selectUser() {
		return userDao.listuser();
	}

}
