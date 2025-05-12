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

@Controller
public class PracticeOneController {

    private final PracticeOneService calculatorService;

    public PracticeOneController(PracticeOneService service){
        this.calculatorService = service;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
    

    @GetMapping("/practice-01")
    public String practiceOne() {
        return "practiceone";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute("calculator") @Valid Calculator form,
                            BindingResult result,
                            Model model) {
        model.addAttribute("calculatorForm", form);

        if (result.hasErrors()) {
            model.addAttribute("result", "Syntax Error");
            return "practiceone";
        }

        double value = calculatorService.calculate(form.getA(), form.getB(), form.getOp());
        model.addAttribute("result", value);
        return "practiceone";
    }
}
