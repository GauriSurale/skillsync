// ProjectRequirement.java
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skill;
    private int level;

    @ManyToOne
    @JoinColumn(name = "project_id") // foreign key column in ProjectRequirement table
    private Project project;  // <-- THIS is required for `mappedBy = "project"` to work

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
