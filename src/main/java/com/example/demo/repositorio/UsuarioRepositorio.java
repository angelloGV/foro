package com.example.demo.repositorio;

import com.example.demo.datos.CUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<CUsuario,Long> {
}
