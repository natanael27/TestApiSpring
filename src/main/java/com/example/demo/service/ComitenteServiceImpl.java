package com.example.demo.service;

import com.example.demo.model.dto.ComitenteDto;
import com.example.demo.model.entity.Comitente;
import com.example.demo.repository.ComitenteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class ComitenteServiceImpl implements ComitenteService {
    private final ModelMapper mapper;
    private final ComitenteRepository comitenteRepository;

    public ComitenteServiceImpl(ModelMapper mapper, ComitenteRepository comitenteRepository) {
        this.mapper = mapper;
        this.comitenteRepository = comitenteRepository;
    }

    @Override
    public ComitenteDto createComitente(ComitenteDto comitenteDto) {
        Comitente comitente= mapper.map(comitenteDto,Comitente.class);
        comitente = comitenteRepository.save(comitente);
        return mapper.map(comitente, ComitenteDto.class);
    }

    @Override
    public void updateComitente() {

    }

    @Override
    public void deleteComitente() {

    }
}
