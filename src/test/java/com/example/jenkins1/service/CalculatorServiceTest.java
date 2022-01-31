package com.example.jenkins1.service;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculatorServiceTest {
    @Test
    public void sumTest() {
        assertTrue(CalculatorService.Sum(2,2)==4);
    }

    @Test
    public void divTest() {
        assertTrue(CalculatorService.Div(4,2)==2);
    }

}