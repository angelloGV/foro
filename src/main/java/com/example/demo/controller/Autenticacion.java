package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autenticacion")
public class Autenticacion {

    @PostMapping
    public void autenticar(@RequestBody String json)
    {
        System.out.println("Ingreso Correctamente");
        System.out.println(json);
    }
}
