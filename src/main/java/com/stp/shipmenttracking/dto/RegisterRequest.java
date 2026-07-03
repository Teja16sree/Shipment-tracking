package com.stp.shipmenttracking.dto;

import com.stp.shipmenttracking.enums.RoleType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email")
    private String email;

    @Size(min = 6, message = "Password must contain at least 6 characters")
    private String password;

    private RoleType role;
}
