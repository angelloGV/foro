package com.example.demo.repositorio;

import com.example.demo.datosValidacion.ComentarioValidacion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "Comentarios")
@Entity(name = "Comentario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CComentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreDePerfil;
    private String tema;
    private String mensaje;

    public CComentario(ComentarioValidacion comValidacion)
    {
        this.nombreDePerfil=comValidacion.nombreDePerfil();
        this.tema=comValidacion.tema();
        this.mensaje=comValidacion.mensaje();
    }

}
