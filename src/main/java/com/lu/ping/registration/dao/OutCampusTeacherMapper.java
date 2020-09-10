package com.lu.ping.registration.dao;

import com.lu.ping.registration.entity.OutCampusTeacher;

public interface OutCampusTeacherMapper {
    int deleteByPrimaryKey(String idNumber);

    int insert(OutCampusTeacher record);

    int insertSelective(OutCampusTeacher record);

    OutCampusTeacher selectByPrimaryKey(String idNumber);

    int updateByPrimaryKeySelective(OutCampusTeacher record);

    int updateByPrimaryKey(OutCampusTeacher record);
}