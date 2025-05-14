package com.app.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.app.demo.services.PracticeOneService;
import com.app.demo.models.Calculator;
import com.app.demo.models.Pair;
import com.app.demo.models.Palindrome;
import com.app.demo.models.SquareNumber;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PracticeOneController {

    private final PracticeOneService practiceOneService;

    public PracticeOneController(PracticeOneService service) {
        this.practiceOneService = service;
    }

    public void loadForms(Model model) {
        if (!model.containsAttribute("calculatorForm")) {
            model.addAttribute("calculatorForm", new Calculator());
        }
        if (!model.containsAttribute("pairForm")) {
            model.addAttribute("pairForm", new Pair());
        }
        if (!model.containsAttribute("squareForm")) {
            model.addAttribute("squareForm", new SquareNumber());
        }
        if (!model.containsAttribute("palindromeForm")) {
            model.addAttribute("palindromeForm", new Palindrome());
        }
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/practice-01")
    public String practiceOne(Model model) {
        loadForms(model);
        return "practiceone";
    }

    @PostMapping("/calculate")
    public String calculate(
            @ModelAttribute("calculatorForm") @Valid Calculator form,
            BindingResult result,
            Model model) {

        loadForms(model);
        if (result.hasErrors()) {
            model.addAttribute("result", "Error de validación");
        } else {
            double value = practiceOneService.calculate(form.getA(), form.getB(), form.getOp());
            model.addAttribute("result", value);
        }
        return "practiceone";
    }

    @PostMapping("/pair")
    public String isPair(
            @ModelAttribute("pairForm") @Valid Pair form,
            BindingResult result,
            Model model) {

        loadForms(model);
        if (result.hasErrors()) {
            model.addAttribute("pairResult", "Número inválido");
        } else {
            String value = practiceOneService.isPair(form.getNumber());
            model.addAttribute("pairResult", value);
        }
        return "practiceone";
    }

    @PostMapping("/square")
    public String isSquare(
            @ModelAttribute("squareForm") @Valid SquareNumber form,
            BindingResult result,
            Model model) {

        loadForms(model);
        if (result.hasErrors()) {
            model.addAttribute("squareResult", "Números inválidos");
        } else {
            String value = practiceOneService.squareNumber(form.getFirstNumber(), form.getSecondNumber());
            model.addAttribute("squareResult", value);
        }
        return "practiceone";
    }

    @PostMapping("/palindrome")
    public String isPalindrome(
            @ModelAttribute("palindromeForm") @Valid Palindrome form,
            BindingResult result,
            Model model) {

        loadForms(model);
        if (result.hasErrors()) {
            model.addAttribute("palindromeResult", "Texto inválido");
        } else {
            String value = practiceOneService.isPalindrome(form.getWord());
            model.addAttribute("palindromeResult", value);
        }
        return "practiceone";
    }
}
