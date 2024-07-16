package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registroTopico")
public class RegistroTopico {

    @PostMapping
    public void insertTopico(@RequestBody String topico)
    {
        System.out.println("Ingreso Correctamente");
        System.out.println(topico);
    }

}
