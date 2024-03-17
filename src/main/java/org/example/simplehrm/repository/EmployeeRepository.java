package org.example.simplehrm.repository;

import org.example.simplehrm.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    Optional<Employee> findById(UUID id);

    void deleteById(UUID id);
}
