package com.jb.advanced_spring.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jb.advanced_spring.exception.NotFoundException;
import com.jb.advanced_spring.services.MishtakenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MishtakenController {
    private final MishtakenService mishtakenService;
    @GetMapping("/city/{city}")
    public ResponseEntity<?> getByCity(@PathVariable String city) throws JsonProcessingException, NotFoundException {
        return new ResponseEntity<>(mishtakenService.getByCity(city), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) throws JsonProcessingException {
        return new ResponseEntity<>(mishtakenService.getById(id),HttpStatus.OK);
    }
}
