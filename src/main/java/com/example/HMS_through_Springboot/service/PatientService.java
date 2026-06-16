package com.example.HMS_through_Springboot.service;

import com.example.HMS_through_Springboot.entity.Patient;
import com.example.HMS_through_Springboot.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    @Transactional
    public Optional<Patient> getPatientById(long id) {
        return patientRepository.findById(id);
    }
}
