package com.example.HMS_through_Springboot.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorResponseDto {
    private Long id;
    private String name;
    private String specialization;
    private String email;
}