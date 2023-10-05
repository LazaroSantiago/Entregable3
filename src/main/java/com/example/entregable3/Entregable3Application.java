package com.example.entregable3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Entregable3Application {

	public static void main(String[] args) {
		//todo: literalmente no hay capa de persistencia. Hay que ver como hacerla. Seguramente docker.
		System.out.println("Initializing...");
		SpringApplication.run(Entregable3Application.class, args);
		System.out.println("Finished Initializing");
	}

}
