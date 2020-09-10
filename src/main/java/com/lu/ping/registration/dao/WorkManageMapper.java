package com.lu.ping.registration.dao;

import com.lu.ping.registration.entity.WorkManage;

public interface WorkManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkManage record);

    int insertSelective(WorkManage record);

    WorkManage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkManage record);

    int updateByPrimaryKey(WorkManage record);
}