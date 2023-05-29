package com.example.devSuperior.desafio3.repositories;

import com.example.devSuperior.desafio3.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
