package com.example.demo.obtenerDatos;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DataComentario(

        @JsonAlias("nombreUsuario") String nombreUsuario,
        @JsonAlias("titulo") String titulo,
        @JsonAlias("mensaje") String mensaje
) {
}
