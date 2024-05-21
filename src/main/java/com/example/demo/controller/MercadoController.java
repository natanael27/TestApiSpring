package com.example.demo.controller;

import com.example.demo.model.dto.MercadoDto;
import com.example.demo.service.MercadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MercadoController {

    @Autowired
    private MercadoService mercadoService;

    @PostMapping("/api/mercado")
    public ResponseEntity<?> createMercado(@RequestBody MercadoDto newMercadoDto){
        return new ResponseEntity<>(mercadoService.createMercado(newMercadoDto), HttpStatus.CREATED);
    }
}
