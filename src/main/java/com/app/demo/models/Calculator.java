package com.app.demo.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Calculator {
    @NotNull
    public Double a;

    @NotNull
    private Double b;

    @NotNull
    @Pattern(regexp = "[+\\-*/]", message = "Operación no válida")
    private String op;
}
