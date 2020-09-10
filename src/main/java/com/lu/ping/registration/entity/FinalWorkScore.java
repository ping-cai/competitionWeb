package com.lu.ping.registration.entity;

public class FinalWorkScore {
    private Integer id;

    private String workName;

    private String workMaker;

    private Integer grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public String getWorkMaker() {
        return workMaker;
    }

    public void setWorkMaker(String workMaker) {
        this.workMaker = workMaker == null ? null : workMaker.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}