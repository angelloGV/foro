package com.example.demo.obtenerDatos;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DataTopico(

        @JsonAlias("nombreDePerfil") String nombreDePerfil,
        @JsonAlias("curso") String curso,
        @JsonAlias("tema") String tema,
        @JsonAlias("titulo") String titulo,
        @JsonAlias("mensaje") String mensaje
        ) {
}
