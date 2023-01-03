package com.example.obspringsecurity;

import com.example.obspringsecurity.entities.Laptop;
import com.example.obspringsecurity.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringSecurityApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(com.example.obspringsecurity.ObSpringSecurityApplication.class, args);
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
