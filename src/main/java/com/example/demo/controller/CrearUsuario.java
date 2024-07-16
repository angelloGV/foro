package com.example.demo.controller;

import com.example.demo.obtenerDatos.Conversor;
import com.example.demo.obtenerDatos.DataUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crearUsuario")
public class CrearUsuario {

    Conversor conversor = new Conversor();

    @PostMapping
    public void createUser(@RequestBody DataUsuario usuario)
    {
        System.out.println("Ingreso Correctamente");
        System.out.println(usuario);
       //var dataUsuario = conversor.obtenerDatos(usuario, DataUsuario.class);
    }
}
