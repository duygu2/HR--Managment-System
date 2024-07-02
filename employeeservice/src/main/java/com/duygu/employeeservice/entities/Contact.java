package com.duygu.employeeservice.entities;

import com.duygu.employeeservice.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contacts")
public class Contact extends BaseEntity {

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;




}
