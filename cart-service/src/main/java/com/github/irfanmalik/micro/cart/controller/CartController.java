package com.github.irfanmalik.micro.cart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public ResponseEntity getAllUsers(){
        return new ResponseEntity("Cart list here ...", HttpStatus.OK);
    }

}
