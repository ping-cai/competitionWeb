package com.lu.ping.registration.service.myInterface;

import com.lu.ping.registration.entity.SystemSetting;

import java.util.List;

public interface SystemSettingService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(SystemSetting record);

    SystemSetting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemSetting record);

    List<SystemSetting> selectAllSystemSettings();

}
