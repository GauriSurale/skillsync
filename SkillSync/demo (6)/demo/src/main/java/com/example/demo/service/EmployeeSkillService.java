package com.example.demo.service;

import com.example.demo.entity.EmployeeSkill;
import com.example.demo.repository.EmployeeSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSkillService {

    @Autowired
    private EmployeeSkillRepository employeeSkillRepository;

    public EmployeeSkill saveEmployeeSkill(EmployeeSkill employeeSkill) {
        return employeeSkillRepository.save(employeeSkill);
    }

    public List<EmployeeSkill> getAllEmployeeSkills() {
        return employeeSkillRepository.findAll();
    }
}
