package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users") // 'user' is a reserved keyword in many SQL databases
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private String role; // e.g., ADMIN, MANAGER, EMPLOYEE

    private boolean available;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeSkill> skills;

    @OneToMany(mappedBy = "toUser")
    private List<Feedback> feedbacksReceived;

    @OneToMany(mappedBy = "fromUser")
    private List<Feedback> feedbacksGiven;

    @OneToMany(mappedBy = "manager")
    private List<Project> managedProjects;

    @OneToMany(mappedBy = "employee")
    private List<TeamAssignment> teamAssignments;

    // These methods are optional if you are using Lombok's @Data
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
