package com.example.belajarspringboot.repository;
import com.example.belajarspringboot.dto.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
