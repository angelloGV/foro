package com.example.demo.principal;

import com.example.demo.repositorio.ComentarioRepositorio;
import com.example.demo.repositorio.TopicoRepositorio;
import com.example.demo.repositorio.UsuarioRepositorio;

public class Principal {

    private ComentarioRepositorio comentRepo;
    private TopicoRepositorio topRepo;
    private UsuarioRepositorio userRepo;

    public Principal(){};

    public Principal(ComentarioRepositorio comentRepo,
                     TopicoRepositorio topRepo,
                     UsuarioRepositorio userRepo)
    {
        this.comentRepo = comentRepo;
        this.topRepo = topRepo;
        this.userRepo = userRepo;

    }

}
