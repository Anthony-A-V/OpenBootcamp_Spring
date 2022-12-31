package com.example;

import com.example.entities.Laptop;
import com.example.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio8Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio8Application.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		//CRUD
		//Crear Laptop

		Laptop laptop1 = new Laptop(null, "Lenovo", "Gris", "Ryzen 5");
		Laptop laptop2 = new Laptop(null, "Toshiba", "Negro", "Intel Core i5");

		System.out.println("N° de Laptops: " + laptopRepository.count());

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);

		System.out.println("N° de Laptops: " + laptopRepository.count());
	}
}