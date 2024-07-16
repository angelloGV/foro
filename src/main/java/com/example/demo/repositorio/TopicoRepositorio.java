package com.example.demo.repositorio;

import com.example.demo.datos.CTopico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepositorio extends JpaRepository<CTopico, Long> {
}
