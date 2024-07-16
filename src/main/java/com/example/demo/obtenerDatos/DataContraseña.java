package com.example.demo.obtenerDatos;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DataContraseña(
        @JsonAlias("correo") String correo,
        @JsonAlias("password") String password
) {
}
