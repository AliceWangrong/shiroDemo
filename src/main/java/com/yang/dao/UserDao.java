package com.yang.dao;

import java.util.List;
import java.util.Set;

import com.yang.entity.User;
/**
 * created by yangqing on 2018年2月19日 下午9:32:29
 */
public interface UserDao {
	User getByUserName(String username);
	Set<String> getRoles(String username);
	Set<String> getPermissions(String username);
	List<User> listuser();
}
