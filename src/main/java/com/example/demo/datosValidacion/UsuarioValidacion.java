package com.example.demo.datosValidacion;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioValidacion(
        @NotBlank
        String nombreUsuario,

        @NotBlank
        String nombreDePerfil,

        @NotBlank
        @Email
        String correo,

        @NotBlank
        String password

) {
}
