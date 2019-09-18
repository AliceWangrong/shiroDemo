package com.yang.entity;

public class Roel {
    private Integer id;
    private String rolename;

    public Roel(Integer id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }
    public Roel(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
