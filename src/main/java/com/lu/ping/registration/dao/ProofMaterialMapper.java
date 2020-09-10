package com.lu.ping.registration.dao;

import com.lu.ping.registration.entity.ProofMaterial;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface ProofMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProofMaterial record);

    int insertSelective(ProofMaterial record);

    ProofMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProofMaterial record);

    int updateByPrimaryKey(ProofMaterial record);
}