package com.example.demo.obtenerDatos;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DataUsuario(

        @JsonAlias("nombreUsuario") String nombreUsuario,
        @JsonAlias("nombreDePerfil") String nombreDePerfil,
        @JsonAlias("correo") String correo,
        @JsonAlias("password") String password
) {
}
