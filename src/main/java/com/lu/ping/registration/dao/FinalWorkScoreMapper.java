package com.lu.ping.registration.dao;

import com.lu.ping.registration.entity.FinalWorkScore;

public interface FinalWorkScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinalWorkScore record);

    int insertSelective(FinalWorkScore record);

    FinalWorkScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinalWorkScore record);

    int updateByPrimaryKey(FinalWorkScore record);
}