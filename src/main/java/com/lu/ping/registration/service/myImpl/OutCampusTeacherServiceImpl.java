package com.lu.ping.registration.service.myImpl;

import com.lu.ping.registration.entity.OutCampusTeacher;
import com.lu.ping.registration.service.myInterface.OutCampusTeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutCampusTeacherServiceImpl implements OutCampusTeacherService {
    @Override
    public int deleteByPrimaryKey(String idNumber) {
        return 0;
    }

    @Override
    public int insertSelective(OutCampusTeacher record) {
        return 0;
    }

    @Override
    public OutCampusTeacher selectByPrimaryKey(String idNumber) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(OutCampusTeacher record) {
        return 0;
    }

    @Override
    public List<OutCampusTeacher> selectAllOutCampusTeachers() {
        return null;
    }
}
