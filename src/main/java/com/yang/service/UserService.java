package com.yang.service;

import java.util.List;
import java.util.Set;

import com.yang.entity.User;

/**
 * 
 * created by yangqing on 2018年2月19日 下午9:44:23
 */
public interface UserService {

	/**
	 *  通过用户名查找用户
	 *  @param username
	 *  @return User
	 */
	public User getByUserName(String username);
	
	/**
	 *  通过用户名查找该用户所有的角色并保存在Set集合中
	 *  @param username
	 *  @return Set<String>
	 */
	public Set<String> getRoles(String username);
	
	/**
	 *  通过用户名查找该用户所有的权限并保存在Set集合中
	 *  @param username
	 *  @return Set<String>
	 */	
	public Set<String> getPermissions(String username);
	public List<User> selectUser();
}
