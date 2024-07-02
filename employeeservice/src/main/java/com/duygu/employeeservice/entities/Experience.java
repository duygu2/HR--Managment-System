package com.duygu.employeeservice.entities;

import com.duygu.employeeservice.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "experiences")
public class Experience extends BaseEntity {
    private String Company;

    private String position;

    private Date startDate;

    private Date endDate;

    private String description;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
