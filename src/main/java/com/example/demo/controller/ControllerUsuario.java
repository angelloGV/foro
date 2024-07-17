package com.example.demo.controller;

import com.example.demo.datosValidacion.UsuarioValidacion;
import com.example.demo.repositorio.CUsuario;
import com.example.demo.repositorio.UsuarioRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class ControllerUsuario {

    @Autowired
    private UsuarioRepositorio userRepo;

    @PostMapping
    public void createUser(@RequestBody @Valid UsuarioValidacion validacionUsuario)
    {
        System.out.println("Ingreso Correctamente");
        System.out.println(validacionUsuario);
        userRepo.save(new CUsuario(validacionUsuario));
    }

    @PostMapping("/auntenticar")
    public void autenticar(@RequestBody String json)
    {
        System.out.println("Ingreso Correctamente");
        System.out.println(json);
    }
}
