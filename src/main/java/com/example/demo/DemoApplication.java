package com.example.demo;

import com.example.demo.principal.Principal;
import com.example.demo.repositorio.ComentarioRepositorio;
import com.example.demo.repositorio.TopicoRepositorio;
import com.example.demo.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	ComentarioRepositorio comentRepo;

	@Autowired
	TopicoRepositorio topRepo;

	@Autowired
	UsuarioRepositorio userRepo;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal( comentRepo,
				topRepo, userRepo);
	}
}
