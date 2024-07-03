package com.duygu.employeeservice.entities;

import com.duygu.employeeservice.core.entities.BaseEntity;
import jakarta.persistence.*;
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
@Table(name = "educations")
public class Education extends BaseEntity {
    @Column(name = "school")
    private String school;
    @Column(name = "degree")
    private String degree;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "gpa")
    private double gpa;
    @Column(name = "grade")
    private String grade;
    @Column(name = "is_graduated")
    private boolean isGraduated;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
