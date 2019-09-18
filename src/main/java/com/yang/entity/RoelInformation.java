package com.yang.entity;

public class RoelInformation {
    private Integer roelId;
    private String roelName;
    private Integer roelParent;
    private Integer roelChildren;
    private Integer roelAuthority;

    public RoelInformation(Integer roelId, String roelName, Integer roelParent, Integer roelChildren, Integer roelAuthority) {
        this.roelId = roelId;
        this.roelName = roelName;
        this.roelParent = roelParent;
        this.roelChildren = roelChildren;
        this.roelAuthority = roelAuthority;
    }
    public RoelInformation(){
        super();
    }

    public Integer getRoelId() {
        return roelId;
    }

    public void setRoelId(Integer roelId) {
        this.roelId = roelId;
    }

    public String getRoelName() {
        return roelName;
    }

    public void setRoelName(String roelName) {
        this.roelName = roelName;
    }

    public Integer getRoelParent() {
        return roelParent;
    }

    public void setRoelParent(Integer roelParent) {
        this.roelParent = roelParent;
    }

    public Integer getRoelChildren() {
        return roelChildren;
    }

    public void setRoelChildren(Integer roelChildren) {
        this.roelChildren = roelChildren;
    }

    public Integer getRoelAuthority() {
        return roelAuthority;
    }

    public void setRoelAuthority(Integer roelAuthority) {
        this.roelAuthority = roelAuthority;
    }
}
