package com.example.demo.controller;

import com.example.demo.entity.EmployeeSkill;
import com.example.demo.service.EmployeeSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-skills")
public class EmployeeSkillController {

    @Autowired
    private EmployeeSkillService employeeSkillService;

    @PostMapping
    public EmployeeSkill createEmployeeSkill(@RequestBody EmployeeSkill skill) {
        return employeeSkillService.saveEmployeeSkill(skill);
    }

    @GetMapping
    public List<EmployeeSkill> getAllEmployeeSkills() {
        return employeeSkillService.getAllEmployeeSkills();
    }
}
