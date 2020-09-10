package com.lu.ping.registration.service.myInterface;

import com.lu.ping.registration.entity.OutCampusTeacher;

import java.util.List;

public interface OutCampusTeacherService {
    int deleteByPrimaryKey(String idNumber);

    int insertSelective(OutCampusTeacher record);

    OutCampusTeacher selectByPrimaryKey(String idNumber);

    int updateByPrimaryKeySelective(OutCampusTeacher record);

    List<OutCampusTeacher> selectAllOutCampusTeachers();
}
