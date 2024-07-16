package com.example.demo.controller;


import com.example.demo.obtenerDatos.DataTopico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registroContenidoForo")

public class RegistroContenidoForo {

    @PostMapping
    public void insertTopico(@RequestBody DataTopico topico)
    {
        System.out.println("Ingreso Correctamente");
        System.out.println(topico);
    }

}
