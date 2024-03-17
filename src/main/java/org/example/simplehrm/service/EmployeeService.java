package org.example.simplehrm.service;

import org.example.simplehrm.dto.AddEmployeeDTO;
import org.example.simplehrm.model.Employee;
import org.example.simplehrm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(AddEmployeeDTO employee) {
        Employee newEmployee = new Employee(employee);
        return employeeRepository.save(newEmployee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(UUID id) {
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(UUID id, Employee updatedEmployee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);

        if(existingEmployee.isPresent()) {
            Employee employee = existingEmployee.get();

            employee.setFirstName(updatedEmployee.getFirstName());
            employee.setLastName(updatedEmployee.getLastName());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setPhoneNumber(updatedEmployee.getPhoneNumber());
            employee.setHireDate(updatedEmployee.getHireDate());
            employee.setDepartmentId(updatedEmployee.getDepartmentId());
            employee.setManagerId(updatedEmployee.getManagerId());
            employee.setJobTitle(updatedEmployee.getJobTitle());
            employee.setSalary(updatedEmployee.getSalary());

            return employeeRepository.save(employee);
        } else {
            throw new RuntimeException("Employee not found");
        }
    }

    public void deleteEmployee(UUID id) {
        employeeRepository.deleteById(id);
    }
}
