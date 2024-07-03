package com.duygu.employeeservice.core.dtos.address.requests;

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
public class CreateAddressRequest {

    @NotBlank(message = "This field is required")
    private String City;

    @NotBlank(message = "This field is required")
    private String District;

    @NotBlank(message = "This field is required")
    private String Street;

    @NotBlank(message = "This field is required")
    private String ApartmentNo;

    private String ApartmentName;

    @NotBlank(message = "This field is required")
    private String PostCode;

    private Long employeeId;

}
