package com.example.demo.datos;

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
}
