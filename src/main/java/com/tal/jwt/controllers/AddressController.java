package com.tal.jwt.controllers;

import com.tal.jwt.beans.UserData;
import com.tal.jwt.services.AddressService;
import com.tal.jwt.util.JWT;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SignatureException;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;
    private final JWT jwt;

    @GetMapping("/get")
    public ResponseEntity<?> getAddress(@RequestHeader(name = "Authorization") String token) throws SignatureException {
        String newToken = jwt.checkUser(token);
        //return new ResponseEntity<>(addressService.getAllAddress(), HttpStatus.OK);
        return ResponseEntity.ok()
                .header("Authorization",newToken)
                .body(addressService.getAllAddress());
    }
}
