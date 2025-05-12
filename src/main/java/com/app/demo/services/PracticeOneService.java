package com.app.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PracticeOneService {
 
    public double calculate(double a, double b, String op){
        return switch (op){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> b != 0 ? a / b: Double.NaN;
            default -> throw new IllegalArgumentException("Operación no válida");
        };
    }

    public String isPair(int a) {
        return a % 2 == 0 ? "Es par" : "No es pár";
    }
}
