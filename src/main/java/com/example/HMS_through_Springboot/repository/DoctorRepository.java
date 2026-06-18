package com.example.HMS_through_Springboot.repository;

import com.example.HMS_through_Springboot.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}