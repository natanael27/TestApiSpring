package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "mercados")
public class Mercado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion,codigo,pais;
    @ManyToMany
    @JoinTable( name = "mercados_comitentes",
                joinColumns = @JoinColumn(name = "mercados_id"),
                inverseJoinColumns = @JoinColumn(name = "comitentes_id"))
    private Set<Comitente> comitentes = new HashSet<>();
}
