package com.lu.ping.registration.dao;

import com.lu.ping.registration.entity.RoleRoot;

public interface RoleRootMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleRoot record);

    int insertSelective(RoleRoot record);

    RoleRoot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleRoot record);

    int updateByPrimaryKey(RoleRoot record);
}