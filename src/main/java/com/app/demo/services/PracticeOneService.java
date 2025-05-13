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
        return a % 2 == 0 ? "Es par" : "No es par";
    }

    public String squareNumber (int a, int b) {
        if (a > b) {
            return b * b == a ? a + " es cuadrado de " + b : a + " no es cuadrado de " + b;
        } else {
            return a * a == b ? b + " es cuadrado de " + a : b + " no es cuadrado de " + a;
        }
    }

    public String isPalindrome(String a) {
        String clean = a.replaceAll("[\\W_]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return reversed.equals(clean) ? a + " es palíndroma" : a + " no es palíndroma";
    }
}