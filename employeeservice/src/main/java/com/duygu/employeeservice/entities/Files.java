package com.duygu.employeeservice.entities;

import com.duygu.employeeservice.core.entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "files")
public class Files extends BaseEntity {
    private String fileName;
    private String fileType;
    private String filePath;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
