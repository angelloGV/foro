package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eliminar")
public class EliminarContenidoForo {

    @DeleteMapping
    public void eliminarcontenido()
    {
        System.out.println("Ingreso Correctamente");
    }
}
