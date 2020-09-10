package com.lu.ping.registration.service.myInterface;

import com.lu.ping.registration.entity.ProofMaterial;

import java.util.List;

public interface ProofMaterialService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProofMaterial record);

    ProofMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProofMaterial record);

    List<ProofMaterial> selectAllProofMaterials();
}
