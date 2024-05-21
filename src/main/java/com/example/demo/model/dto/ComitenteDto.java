package com.example.demo.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComitenteDto {

    private Long id;
    private String description;
    private Set<MercadoDto> mercados;




}
