package com.app.demo.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import com.app.demo.services.PracticeOneService;

@WebMvcTest(PracticeOneController.class)
@Import(PracticeOneControllerTest.MockConfig.class)
public class PracticeOneControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PracticeOneService practiceOneService;

    @TestConfiguration
    static class MockConfig {
        @Bean
        public PracticeOneService practiceOneService() {
            return Mockito.mock(PracticeOneService.class);
        }
    }

    @Test
    void testCalculator() throws Exception {
        when(practiceOneService.calculate(10, 0, "/")).thenReturn(Double.NaN);
        mockMvc.perform(post("/calculate")
                .param("a", "10")
                .param("b", "0")
                .param("op", "/"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("result", Double.NaN))
                .andExpect(view().name("practiceone"));
    }

    @Test
    void testPair() throws Exception {
        when(practiceOneService.isPair(76)).thenReturn("Es par");
        mockMvc.perform(post("/pair")
                .param("a", "76"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("pairResult", "Es par"))
                .andExpect(view().name("practiceone"));
    }
 }
