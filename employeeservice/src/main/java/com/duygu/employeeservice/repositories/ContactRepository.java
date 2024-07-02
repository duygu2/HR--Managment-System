package com.duygu.employeeservice.repositories;

import com.duygu.employeeservice.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
