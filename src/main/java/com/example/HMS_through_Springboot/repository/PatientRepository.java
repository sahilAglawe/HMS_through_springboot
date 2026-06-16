package com.example.HMS_through_Springboot.repository;

import com.example.HMS_through_Springboot.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
