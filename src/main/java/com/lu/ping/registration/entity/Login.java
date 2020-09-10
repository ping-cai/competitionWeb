package com.lu.ping.registration.entity;

public class Login {
    private Integer id;

    private String userName;

    private String psw;

    private Integer theGrant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw == null ? null : psw.trim();
    }

    public Integer getTheGrant() {
        return theGrant;
    }

    public void setTheGrant(Integer theGrant) {
        this.theGrant = theGrant;
    }
}