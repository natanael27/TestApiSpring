package com.example.demo.repository;

import com.example.demo.model.entity.Mercado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercadoRepository extends JpaRepository<Mercado,Long> {
}
