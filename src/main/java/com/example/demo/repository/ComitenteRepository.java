package com.example.demo.repository;

import com.example.demo.model.entity.Comitente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComitenteRepository extends JpaRepository<Comitente,Long> {
}
