package com.example.demo.controller;

import com.example.demo.model.dto.ComitenteDto;
import com.example.demo.service.ComitenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comitentes")
public class ComitenteController {

    @Autowired
    private ComitenteService comitenteService;

    @PostMapping
        public ResponseEntity<?> createComitente(@RequestBody ComitenteDto newComitenteDto){
        return new ResponseEntity<>(comitenteService.createComitente(newComitenteDto), HttpStatus.CREATED);
    }
}
