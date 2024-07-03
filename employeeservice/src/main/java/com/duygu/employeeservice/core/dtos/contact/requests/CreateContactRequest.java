package com.duygu.employeeservice.core.dtos.contact.requests;

import com.duygu.employeeservice.entities.Employee;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateContactRequest {

    @NotBlank(message = "This field is required")
    private String email;

    @NotBlank(message = "This field is required")
    private String mobilePhone;

    private Long employeeId;


}
