package com.yang.entity;

/**  
 * created by yangqing on 2018年2月19日 下午9:27:56
 */
public class User {

	private Integer id;
	private String username;
	private String password;
	private Integer roleId;
	private Roel roel;

	public User(Integer id, String username, String password, Integer roleId, Roel roel) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.roleId = roleId;
		this.roel = roel;
	}
	public User(){
		super();
	}

	public Roel getRoel() {
		return roel;
	}

	public void setRoel(Roel roel) {
		this.roel = roel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
