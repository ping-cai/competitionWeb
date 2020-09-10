package com.lu.ping.registration.service.myInterface;

import com.lu.ping.registration.entity.WorkManage;

import java.util.List;

public interface WorkManageService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(WorkManage record);

    WorkManage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkManage record);

    List<WorkManage> selectAllWorkManages();
}
