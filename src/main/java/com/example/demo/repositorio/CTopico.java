package com.example.demo.repositorio;

import com.example.demo.datosValidacion.TopicoValidacion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="Topicos")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CTopico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreDePerfil;
    private String curso;
    private String tema;
    private String titulo;
    private String mensaje;
    private String comentario;

    public CTopico(TopicoValidacion topValidacion)
    {
        this.nombreDePerfil=topValidacion.nombreDePerfil();
        this.curso=topValidacion.curso();
        this.tema=topValidacion.tema();
        this.titulo=topValidacion.titulo();
        this.mensaje=topValidacion.mensaje();
        this.comentario = topValidacion.comentario();
    }
}
