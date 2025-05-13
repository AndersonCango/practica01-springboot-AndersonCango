package com.app.demo.models;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Pair {

    @NotNull(message = "Ingrese un número")
    private Integer a;
}
