package com.lu.ping.registration.controller;

import com.lu.ping.registration.dao.OutCampusTeacherMapper;
import com.lu.ping.registration.entity.OutCampusTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class outCampusTeacherController {
    private OutCampusTeacherMapper outCampusTeacherMapper;

    @PostMapping("/out_teacher/add")
    @ResponseBody
    public void addOutTeacher(OutCampusTeacher outCampusTeacher) {
        outCampusTeacherMapper.insert(outCampusTeacher);
    }
}
