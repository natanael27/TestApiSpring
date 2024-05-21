package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "comitentes")
public class Comitente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    @ManyToMany(mappedBy = "comitentes")
    private Set<Mercado> mercadosList = new HashSet<>();
}
