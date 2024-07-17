package com.example.demo.datosValidacion;

import jakarta.validation.constraints.NotBlank;

public record TopicoValidacion(

        @NotBlank
        String nombreDePerfil,

        @NotBlank
        String curso,

        @NotBlank
        String tema,

        @NotBlank
        String titulo,

        @NotBlank
        String mensaje,

        String comentario
) {
}
