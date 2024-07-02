package com.duygu.employeeservice.repositories;

import com.duygu.employeeservice.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
