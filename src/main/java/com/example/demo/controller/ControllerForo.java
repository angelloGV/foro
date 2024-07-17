package com.example.demo.controller;


import com.example.demo.datosValidacion.TopicoValidacion;
import com.example.demo.repositorio.CTopico;
import com.example.demo.repositorio.TopicoRepositorio;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foro")

public class ControllerForo {

    @Autowired
    private TopicoRepositorio topicoRepositorio;

    @PostMapping
    public void insertTopico(@RequestBody @Valid TopicoValidacion topicoValidacion)
    {
        System.out.println("Ingreso Correctamente");
        topicoRepositorio.save(new CTopico(topicoValidacion));
    }

    @GetMapping
    public List<CTopico> listarContenido()
    {
        return topicoRepositorio.findAll();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarcontenido(@PathVariable Long id)
    {
        CTopico topico = topicoRepositorio.getReferenceById(id);
        topicoRepositorio.delete(topico);
    }

}
