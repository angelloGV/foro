package com.example.demo.obtenerDatos;

import com.example.demo.datos.Contraseña;
import com.fasterxml.jackson.annotation.JsonAlias;

public record DataUsuario(

        @JsonAlias("nombreUsuario") String nombreUsuario,
        @JsonAlias("nombreDePerfil") String nombreDePerfil,
        @JsonAlias("contraseña") DataContraseña dataContraseña
) {
}
