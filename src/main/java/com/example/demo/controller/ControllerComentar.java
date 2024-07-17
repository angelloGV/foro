package com.example.demo.controller;

import com.example.demo.datosValidacion.ComentarioValidacion;
import com.example.demo.repositorio.CComentario;
import com.example.demo.repositorio.ComentarioRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentar")
public class ControllerComentar {

    @Autowired
    private ComentarioRepositorio comentRepo;

    @PutMapping
    public void comentar(@RequestBody @Valid ComentarioValidacion comValidacion)
    {
        System.out.println("Ingreso Correctamente");
        comentRepo.save(new CComentario(comValidacion));
    }

}
