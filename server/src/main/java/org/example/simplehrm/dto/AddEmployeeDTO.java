package org.example.simplehrm.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class AddEmployeeDTO {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String phoneNumber;

    @Getter
    @Setter
    private LocalDate hireDate;

    @Getter
    @Setter
    private String jobTitle;

    @Getter
    @Setter
    private int departmentId;

    @Getter
    @Setter
    private UUID managerId;

    @Getter
    @Setter
    private BigDecimal salary;
}
