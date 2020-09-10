package com.lu.ping.registration.entity;

public class RoleRoot {
    private Integer id;

    private Integer theGroup;

    private String seeWork;

    private String systemSet;

    private String globalRoot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTheGroup() {
        return theGroup;
    }

    public void setTheGroup(Integer theGroup) {
        this.theGroup = theGroup;
    }

    public String getSeeWork() {
        return seeWork;
    }

    public void setSeeWork(String seeWork) {
        this.seeWork = seeWork == null ? null : seeWork.trim();
    }

    public String getSystemSet() {
        return systemSet;
    }

    public void setSystemSet(String systemSet) {
        this.systemSet = systemSet == null ? null : systemSet.trim();
    }

    public String getGlobalRoot() {
        return globalRoot;
    }

    public void setGlobalRoot(String globalRoot) {
        this.globalRoot = globalRoot == null ? null : globalRoot.trim();
    }
}