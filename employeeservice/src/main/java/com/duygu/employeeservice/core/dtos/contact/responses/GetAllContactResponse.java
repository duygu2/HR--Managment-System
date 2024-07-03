package com.duygu.employeeservice.core.dtos.contact.responses;

import jakarta.validation.constraints.NotBlank;

public class GetAllContactResponse {
    private Long contactId;
    @NotBlank(message = "This field is required")
    private String email;

    @NotBlank(message = "This field is required")
    private String mobilePhone;

    private Long employeeId;
}
