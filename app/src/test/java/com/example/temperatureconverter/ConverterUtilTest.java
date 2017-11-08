package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dranderson on 11/6/17.
 */

public class ConverterUtilTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float boilingPointFActual = ConverterUtil.convertFahrenheitToCelsius(212);
        float boilingPointFExpected = 100;
        assertEquals(boilingPointFExpected, boilingPointFActual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float boilingPointFActual = ConverterUtil.convertCelsiusToFahrenheit(100);
        float boilingPointFExpected = 212;
        assertEquals("Conversion from celsius to fahrenheit failed", boilingPointFExpected, boilingPointFActual + 1, 0.001);
    }
}
