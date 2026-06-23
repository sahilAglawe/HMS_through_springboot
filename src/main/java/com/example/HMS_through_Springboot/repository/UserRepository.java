package com.example.HMS_through_Springboot.repository;

import com.example.HMS_through_Springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}