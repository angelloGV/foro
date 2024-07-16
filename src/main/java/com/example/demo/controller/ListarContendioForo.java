package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listar")
public class ListarContendioForo {

    @GetMapping
    public void listarContenido()
    {
        System.out.println("Ingreso Correctamente");
    }
}
