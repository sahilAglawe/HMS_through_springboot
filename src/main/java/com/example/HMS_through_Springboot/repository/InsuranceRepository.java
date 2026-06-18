package com.example.HMS_through_Springboot.repository;

import com.example.HMS_through_Springboot.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}