package com.example.demo.datosValidacion;

import jakarta.validation.constraints.NotBlank;

public record ComentarioValidacion(

        @NotBlank
        String nombreDePerfil,

        @NotBlank
        String tema,

        @NotBlank
        String mensaje
) {
}
