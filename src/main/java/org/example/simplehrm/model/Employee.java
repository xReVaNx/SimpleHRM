package org.example.simplehrm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.simplehrm.dto.AddEmployeeDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;

    @Column(name = "first_name")
    @Getter
    @Setter
    private String firstName;

    @Column(name = "last_name")
    @Getter
    @Setter
    private String lastName;

    @Column
    @Getter
    @Setter
    private String email;

    @Column(name = "phone_number")
    @Getter
    @Setter
    private String phoneNumber;

    @Column(name = "hire_date")
    @Getter
    @Setter
    private LocalDate hireDate;

    @Column(name = "job_title")
    @Getter
    @Setter
    private String jobTitle;

    @Column(name = "department_id")
    @Getter
    @Setter
    private int departmentId;

    @Column(name = "manager_id")
    @Getter
    @Setter
    private UUID managerId;

    @Column
    @Getter
    @Setter
    private BigDecimal salary;

    public Employee() {

    }
    public Employee(AddEmployeeDTO addEmployeeDTO) {
        this.setFirstName(addEmployeeDTO.getFirstName());
        this.setLastName(addEmployeeDTO.getLastName());
        this.setEmail(addEmployeeDTO.getEmail());
        this.setPhoneNumber(addEmployeeDTO.getPhoneNumber());
        this.setHireDate(addEmployeeDTO.getHireDate());
        this.setJobTitle(addEmployeeDTO.getJobTitle());
        this.setDepartmentId(addEmployeeDTO.getDepartmentId());
        this.setManagerId(addEmployeeDTO.getManagerId());
        this.setSalary(addEmployeeDTO.getSalary());
    }

}
