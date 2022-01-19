package com.example.belajarspringboot.repository;

import com.example.belajarspringboot.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}