package com.jb.currency.controller;

import com.jb.currency.exception.CurrencyException;
import com.jb.currency.service.CurrencyExchange;
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
public class CurrencyController {
    private final CurrencyExchange exchange;
    @GetMapping("/convert/{from}/{to}/{amount}")
    public ResponseEntity<?> getExchange(@PathVariable String from, @PathVariable String to, @PathVariable double amount) throws CurrencyException {
        try {
            return new ResponseEntity<>(exchange.getCurrencyData(from, to, amount), HttpStatus.OK);
        } catch (NullPointerException err){
           throw new CurrencyException("Bad currency type");
        }
    }
}
