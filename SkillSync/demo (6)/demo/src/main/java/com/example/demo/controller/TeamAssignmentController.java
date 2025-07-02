package com.example.demo.controller;

import com.example.demo.entity.TeamAssignment;
import com.example.demo.service.TeamAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team-assignments")
public class TeamAssignmentController {

    @Autowired
    private TeamAssignmentService assignmentService;

    @PostMapping
    public TeamAssignment assignTeam(@RequestBody TeamAssignment assignment) {
        return assignmentService.saveAssignment(assignment);
    }

    @GetMapping
    public List<TeamAssignment> getAllAssignments() {
        return assignmentService.getAllAssignments();
    }
}
