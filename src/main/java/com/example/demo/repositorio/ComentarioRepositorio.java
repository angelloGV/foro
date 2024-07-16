package com.example.demo.repositorio;

import com.example.demo.datos.CComentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepositorio extends JpaRepository<CComentario, Long> {
}
