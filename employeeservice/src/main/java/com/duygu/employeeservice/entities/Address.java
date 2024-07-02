package com.duygu.employeeservice.entities;

import com.duygu.employeeservice.core.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {

    @Column(name = "city")
    private String City;

    @Column(name = "district")
    private String District;

    @Column(name = "street")
    private String Street;

    @Column(name = "apartment_no")
    private String ApartmentNo;

    @Column(name = "apartment_name")
    private String ApartmentName;

    @Column(name = "post_code")
    private String PostCode;

    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
}
