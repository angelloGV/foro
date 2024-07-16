package com.example.demo.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actualizar")
public class ActualizarForo {

    @PutMapping
    public void actualizar()
    {
        System.out.println("Ingreso Correctamente");
    }

}
