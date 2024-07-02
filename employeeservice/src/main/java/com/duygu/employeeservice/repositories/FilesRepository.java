package com.duygu.employeeservice.repositories;

import com.duygu.employeeservice.entities.Files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<Files,Long> {
}
