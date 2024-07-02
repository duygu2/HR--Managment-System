package com.duygu.employeeservice.repositories;

import com.duygu.employeeservice.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education,Long> {
}
