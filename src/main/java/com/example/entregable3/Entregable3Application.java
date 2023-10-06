package com.example.entregable3;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import util.CargaDeDatos;

@SpringBootApplication
@ComponentScan({"util", "controller", "entity", "repository", "service", "DTO"})
@EnableJpaRepositories("repository")
@EntityScan("entity")
public class Entregable3Application {

	@Autowired
	private CargaDeDatos cargaDeDatos;

	public static void main(String[] args) {
		System.out.println("Initializing...");
		SpringApplication.run(Entregable3Application.class, args);
		System.out.println("Finished Initializing");
	}

	@PostConstruct
	public void init() {
		//La logica de la aplicacion ocurre aca:
		cargaDeDatos.cargarDatosDesdeCSV();
	}

}
