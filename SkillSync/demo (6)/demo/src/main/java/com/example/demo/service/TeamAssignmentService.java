package com.example.demo.service;

import com.example.demo.entity.TeamAssignment;
import com.example.demo.repository.TeamAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamAssignmentService {

    @Autowired
    private TeamAssignmentRepository teamAssignmentRepository;

    public TeamAssignment saveAssignment(TeamAssignment assignment) {
        return teamAssignmentRepository.save(assignment);
    }

    public List<TeamAssignment> getAllAssignments() {
        return teamAssignmentRepository.findAll();
    }
}
