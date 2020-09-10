package com.lu.ping.registration.entity;

public class SystemSetting {
    private Integer id;

    private String webSet;

    private String copyRight;

    private String org;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebSet() {
        return webSet;
    }

    public void setWebSet(String webSet) {
        this.webSet = webSet == null ? null : webSet.trim();
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight == null ? null : copyRight.trim();
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }
}