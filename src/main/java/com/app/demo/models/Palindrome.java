package com.app.demo.models;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Palindrome {

    @NotNull(message = "Ingrese una palabra")
    private String word;
}
