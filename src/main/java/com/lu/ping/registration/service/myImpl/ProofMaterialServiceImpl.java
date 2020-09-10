package com.lu.ping.registration.service.myImpl;

import com.lu.ping.registration.dao.ProofMaterialMapper;
import com.lu.ping.registration.entity.ProofMaterial;
import com.lu.ping.registration.service.myInterface.ProofMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProofMaterialServiceImpl implements ProofMaterialService {
    @Autowired
    private ProofMaterialMapper proofMaterialMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        proofMaterialMapper.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int insertSelective(ProofMaterial record) {
        proofMaterialMapper.insertSelective(record);
        return 0;
    }

    @Override
    public ProofMaterial selectByPrimaryKey(Integer id) {
        proofMaterialMapper.selectByPrimaryKey(id);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ProofMaterial record) {
        proofMaterialMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public List<ProofMaterial> selectAllProofMaterials() {
        return null;
    }
}
