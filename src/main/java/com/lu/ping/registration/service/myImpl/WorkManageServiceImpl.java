package com.lu.ping.registration.service.myImpl;

import com.lu.ping.registration.entity.WorkManage;
import com.lu.ping.registration.service.myInterface.WorkManageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkManageServiceImpl implements WorkManageService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(WorkManage record) {
        return 0;
    }

    @Override
    public WorkManage selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(WorkManage record) {
        return 0;
    }

    @Override
    public List<WorkManage> selectAllWorkManages() {
        return null;
    }
}
