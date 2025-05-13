package com.app.demo.models;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SquareNumber {
    
    @NotNull(message = "Ingrese el primer número")
    private Integer firstNumber;

    @NotNull(message = "Ingrese el segundo número")
    private Integer secondNumber;
}
