package com.lu.ping.registration.service.myInterface;

import com.lu.ping.registration.entity.RoleRoot;

import java.util.List;

public interface RoleRootService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(RoleRoot record);

    RoleRoot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleRoot record);

    List<RoleRoot> selectAllRoleRoots();
}
