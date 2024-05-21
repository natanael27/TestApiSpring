package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MercadoDto {
    private Long id;
    private String descripcion,codigo,pais;
    private Set<ComitenteDto> comitentes;
}
