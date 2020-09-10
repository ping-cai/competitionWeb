package com.lu.ping.registration.controller;

import com.lu.ping.registration.dao.ProofMaterialMapper;
import com.lu.ping.registration.entity.ProofMaterial;
import com.lu.ping.registration.service.myImpl.ProofMaterialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProofMaterialController {
    @Autowired
    private ProofMaterialServiceImpl proofMaterialService;

    @PostMapping("/proof_material/add")
    @ResponseBody
    public String proofAdd(ProofMaterial proofMaterial) {
        proofMaterialService.insertSelective(proofMaterial);
        return "success";
    }
    @GetMapping("/proof_material/get")
    @ResponseBody
    public String proofGet(Integer id) {
        proofMaterialService.selectByPrimaryKey(id);
        return "success";
    }
    @PutMapping("/proof_material/update")
    @ResponseBody
    public String proofUpdate(ProofMaterial proofMaterial) {
        proofMaterialService.updateByPrimaryKeySelective(proofMaterial);
        return "success";
    }

    @PutMapping("/proof_material/delete")
    @ResponseBody
    public String proofDelete(Integer id) {
        proofMaterialService.deleteByPrimaryKey(id);
        return "success";
    }
}
