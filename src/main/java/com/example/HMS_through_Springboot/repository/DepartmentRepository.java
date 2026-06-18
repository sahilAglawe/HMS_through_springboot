package com.example.HMS_through_Springboot.repository;

import com.example.HMS_through_Springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}