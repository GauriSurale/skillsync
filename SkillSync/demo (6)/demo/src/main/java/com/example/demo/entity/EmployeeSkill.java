package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeSkill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User employee;

    @ManyToOne
    private Skill skill;

    private int proficiencyLevel; // 1 to 10 scale

	public int getProficiencyLevel() {
		return proficiencyLevel;
	}

	public void setProficiencyLevel(int proficiencyLevel) {
		this.proficiencyLevel = proficiencyLevel;
	}
}
