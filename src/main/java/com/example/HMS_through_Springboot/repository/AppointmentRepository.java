package com.example.HMS_through_Springboot.repository;

import com.example.HMS_through_Springboot.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}