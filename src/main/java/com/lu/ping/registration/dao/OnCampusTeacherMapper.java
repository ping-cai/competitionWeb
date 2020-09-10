package com.lu.ping.registration.dao;

import com.lu.ping.registration.entity.OnCampusTeacher;

public interface OnCampusTeacherMapper {
    int deleteByPrimaryKey(Integer workNumber);

    int insert(OnCampusTeacher record);

    int insertSelective(OnCampusTeacher record);

    OnCampusTeacher selectByPrimaryKey(Integer workNumber);

    int updateByPrimaryKeySelective(OnCampusTeacher record);

    int updateByPrimaryKey(OnCampusTeacher record);
}