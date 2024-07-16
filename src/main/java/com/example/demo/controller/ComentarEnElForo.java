package com.example.demo.controller;

import com.example.demo.obtenerDatos.DataComentario;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actualizar")
public class ComentarEnElForo{

    @PutMapping
    public void comentar(@RequestBody DataComentario dataComentario)
    {
        System.out.println("Ingreso Correctamente");
        System.out.println(dataComentario);
    }

}
