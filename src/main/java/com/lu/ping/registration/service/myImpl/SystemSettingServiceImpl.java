package com.lu.ping.registration.service.myImpl;

import com.lu.ping.registration.entity.SystemSetting;
import com.lu.ping.registration.service.myInterface.SystemSettingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemSettingServiceImpl implements SystemSettingService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(SystemSetting record) {
        return 0;
    }

    @Override
    public SystemSetting selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SystemSetting record) {
        return 0;
    }

    @Override
    public List<SystemSetting> selectAllSystemSettings() {
        return null;
    }
}
