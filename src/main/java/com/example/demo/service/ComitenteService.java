package com.example.demo.service;


import com.example.demo.model.dto.ComitenteDto;
import com.example.demo.repository.ComitenteRepository;

public interface ComitenteService {

    ComitenteDto createComitente(ComitenteDto comitenteDto);

    public void updateComitente();
    public void deleteComitente();
}
