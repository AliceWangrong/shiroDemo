package com.yang.entity;

public class AuthorityInformation {
    private Integer authorityId;
    private String authorityName;
    private Integer authorityParent;
    private Integer authorityChildren;
    private String authorityUrl;
    private Integer authorityRoel;

    public AuthorityInformation(Integer authorityId, String authorityName, Integer authorityParent, Integer authorityChildren, String authorityUrl, Integer authorityRoel) {
        this.authorityId = authorityId;
        this.authorityName = authorityName;
        this.authorityParent = authorityParent;
        this.authorityChildren = authorityChildren;
        this.authorityUrl = authorityUrl;
        this.authorityRoel = authorityRoel;
    }
    public AuthorityInformation(){
        super();
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public Integer getAuthorityParent() {
        return authorityParent;
    }

    public void setAuthorityParent(Integer authorityParent) {
        this.authorityParent = authorityParent;
    }

    public Integer getAuthorityChildren() {
        return authorityChildren;
    }

    public void setAuthorityChildren(Integer authorityChildren) {
        this.authorityChildren = authorityChildren;
    }

    public String getAuthorityUrl() {
        return authorityUrl;
    }

    public void setAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl;
    }

    public Integer getAuthorityRoel() {
        return authorityRoel;
    }

    public void setAuthorityRoel(Integer authorityRoel) {
        this.authorityRoel = authorityRoel;
    }
}
