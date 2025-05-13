package com.app.demo.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Palindrome {

    @NotBlank(message = "Ingrese una palabra")
    private String word;
}
