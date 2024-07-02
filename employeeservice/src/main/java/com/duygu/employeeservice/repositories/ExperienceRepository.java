package com.duygu.employeeservice.repositories;

import com.duygu.employeeservice.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience,Long> {
}
