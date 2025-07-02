package com.example.demo.service;

import com.example.demo.entity.ProjectRequirement;
import com.example.demo.repository.ProjectRequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectRequirementService {

    @Autowired
    private ProjectRequirementRepository projectRequirementRepository;

    public ProjectRequirement saveRequirement(ProjectRequirement requirement) {
        return projectRequirementRepository.save(requirement);
    }

    public List<ProjectRequirement> getAllRequirements() {
        return projectRequirementRepository.findAll();
    }
}
