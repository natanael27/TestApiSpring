package com.example.demo.service;

import com.example.demo.model.dto.MercadoDto;
import com.example.demo.model.entity.Mercado;
import com.example.demo.repository.MercadoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MercadoServiceImpl implements MercadoService{
    private final ModelMapper mapper;
    private final MercadoRepository mercadoRepository;

    public MercadoServiceImpl(ModelMapper mapper, MercadoRepository mercadoRepository) {
        this.mapper = mapper;
        this.mercadoRepository = mercadoRepository;
    }

    @Override
    public MercadoDto createMercado(MercadoDto mercadoDto) {
        Mercado mercadoToSave = mapper.map(mercadoDto,Mercado.class);
        mercadoToSave = mercadoRepository.save(mercadoToSave);
        return mapper.map(mercadoToSave,MercadoDto.class);
    }

    @Override
    public void updateMercado(MercadoDto mercadoDto, Long id) {

    }

    @Override
    public void deleteMercado(MercadoDto mercadoDto, Long id) {

    }

    @Override
    public MercadoDto getMercado(Long id) {
        return null;
    }

    @Override
    public Set<MercadoDto> getAllsMercados(Set<MercadoDto> mercadosDtoSet) {
        return null;
    }
}
