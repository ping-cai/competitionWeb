package com.lu.ping.registration.service.myImpl;

import com.lu.ping.registration.entity.RoleRoot;
import com.lu.ping.registration.service.myInterface.RoleRootService;

import java.util.List;

public class RoleRootServiceImpl implements RoleRootService {

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(RoleRoot record) {
        return 0;
    }

    @Override
    public RoleRoot selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(RoleRoot record) {
        return 0;
    }

    @Override
    public List<RoleRoot> selectAllRoleRoots() {
        return null;
    }
}
