package com.example.demo.repositorio;

import com.example.demo.datosValidacion.UsuarioValidacion;
import com.example.demo.obtenerDatos.DataComentario;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "Usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CUsuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreUsuario;
    private String nombreDePerfil;
    private String correo;
    private String password;

    public CUsuario(UsuarioValidacion validacionUsuario) {
        this.correo = validacionUsuario.correo();
        this.nombreUsuario = validacionUsuario.nombreUsuario();
        this.nombreDePerfil = validacionUsuario.nombreDePerfil();
        this.password = validacionUsuario.password();

    }
}

