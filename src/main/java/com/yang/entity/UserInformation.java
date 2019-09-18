package com.yang.entity;

public class UserInformation {
    private Integer userId;
    private String username;
    private String password;
    private Integer roel;

    public UserInformation(Integer userId, String username, String password, Integer roel) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.roel = roel;
    }
    public UserInformation(){
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getRoel() {
        return roel;
    }

    public void setRoel(Integer roel) {
        this.roel = roel;
    }
}
