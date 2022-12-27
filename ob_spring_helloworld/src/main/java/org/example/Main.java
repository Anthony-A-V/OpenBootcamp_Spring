package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CalculatorService calculadora = (CalculatorService) context.getBean("calculatorService");

        String texto = calculadora.holaMundo();
        System.out.println(texto);

        CalculatorService calculadora2 = (CalculatorService) context.getBean("calculatorService");
        texto = calculadora2.holaMundo();
        System.out.println(texto);
    }
}