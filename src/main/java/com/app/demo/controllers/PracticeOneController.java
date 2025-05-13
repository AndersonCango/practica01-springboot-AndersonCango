package com.app.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.app.demo.services.PracticeOneService;

import jakarta.validation.Valid;

import com.app.demo.models.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PracticeOneController {

    private final PracticeOneService practiceOneService;

    public PracticeOneController(PracticeOneService service){
        this.practiceOneService = service;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
    

    @GetMapping("/practice-01")
    public String practiceOne(Model model) {
        model.addAttribute("calculatorForm", new Calculator());
        return "practiceone";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute("calculatorForm") @Valid Calculator form,
                            BindingResult result,
                            Model model) {
        model.addAttribute("calculatorForm", form);

        if (result.hasErrors()) {
            model.addAttribute("result", "Syntax Error");
            return "practiceone";
        }

        double value = practiceOneService.calculate(form.getA(), form.getB(), form.getOp());
        model.addAttribute("result", value);
        return "practiceone";
    }

    @PostMapping("/pair")
    public String isPair(@ModelAttribute("a") @Valid int a, Model model) {
        model.addAttribute("calculatorForm", new Calculator());
        model.addAttribute("a", a);
        String value = practiceOneService.isPair(a);
        model.addAttribute("pairResult", value);
        return "practiceone";
    }

    @PostMapping("/square")
    public String isSquare(@ModelAttribute("firstNumber")@Valid int a, @ModelAttribute("secondNumber") @Valid int b, Model model) {
        model.addAttribute("calculatorForm", new Calculator());
        model.addAttribute("firstNumber", a);
        model.addAttribute("secondNumber", b);
        String result = practiceOneService.squareNumber(a, b);
        model.addAttribute("squareResult", result);
        return "practiceone";
    }

    @PostMapping("/palindrome")
    public String isPalindrome(@ModelAttribute("word")@Valid String word, Model model) {
        model.addAttribute("calculatorForm", new Calculator());
        model.addAttribute("word", word);
        String result = practiceOneService.isPalindrome(word);
        model.addAttribute("palindromeResult", result);
        return "practiceone";
    }
    
    
}
