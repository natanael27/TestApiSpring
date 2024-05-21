package com.example.demo.service;

import com.example.demo.model.dto.MercadoDto;
import java.util.Set;

public interface MercadoService {
    MercadoDto createMercado(MercadoDto mercadoDto);
    void updateMercado(MercadoDto mercadoDto,Long id);
    void deleteMercado(MercadoDto mercadoDto,Long id);
    MercadoDto getMercado(Long id);
    Set<MercadoDto> getAllsMercados(Set<MercadoDto> mercadosDtoSet);
}
