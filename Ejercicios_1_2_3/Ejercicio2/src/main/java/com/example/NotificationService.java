package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public void imprimirSaludo(String saludo) {
        System.out.println(saludo);
    }
}
