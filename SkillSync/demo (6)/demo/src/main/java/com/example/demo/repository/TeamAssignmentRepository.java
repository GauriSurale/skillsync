package com.example.demo.repository;

import com.example.demo.entity.TeamAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamAssignmentRepository extends JpaRepository<TeamAssignment, Long> {
}
