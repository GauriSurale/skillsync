package com.example.demo.controller;

import com.example.demo.entity.ProjectRequirement;
import com.example.demo.service.ProjectRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project-requirements")
public class ProjectRequirementController {

    @Autowired
    private ProjectRequirementService requirementService;

    @PostMapping
    public ProjectRequirement createRequirement(@RequestBody ProjectRequirement requirement) {
        return requirementService.saveRequirement(requirement);
    }

    @GetMapping
    public List<ProjectRequirement> getAllRequirements() {
        return requirementService.getAllRequirements();
    }
}
