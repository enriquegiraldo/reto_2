package com.UnicornioAzulSA.reto_2.controller;

import com.UnicornioAzulSA.reto_2.entity.Temperatura;
import com.UnicornioAzulSA.reto_2.service.TemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/temperaturas")
public class TemperaturaController {


    // Método para convertir grados Celsius a grados Fahrenheit
    @GetMapping("/grade/celsiusToFahrenheit/{celsius}")
    public double celsiusToFahrenheit(@PathVariable double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("La temperatura en Celsius no puede ser menor que -273.15°C");
        }
        return Math.round((celsius * 9.0 / 5.0 + 32) * 100.0) / 100.0;
    }

    // Método para convertir grados Fahrenheit a grados Celsius
    @GetMapping("/grade/fahrenheitToCelsius/{fahrenheit}")
    public double fahrenheitToCelsius(@PathVariable double fahrenheit) {
        return Math.round(((fahrenheit - 32) * (5.0 / 9.0)) * 100.0) / 100.0;
    }

    // Método para convertir grados Celsius a grados Kelvin
    @GetMapping("/grade/celsiusToKelvin/{celsius}")
    public double celsiusToKelvin(@PathVariable double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("La temperatura en Celsius no puede ser menor que -273.15°C");
        }
        return Math.round((celsius + 273.15) * 100.0) / 100.0;
    }

    // Método para convertir grados Fahrenheit a grados Kelvin
    @GetMapping("/grade/fahrenheitToKelvin/{fahrenheit}")
    public double fahrenheitToKelvin(@PathVariable double fahrenheit) {
        return Math.round(((fahrenheit - 32) * 5/9 + 273.15) * 100.0) / 100.0;
    }

    // Método para convertir grados Kelvin a grados Celsius
    @GetMapping("/grade/kelvinToCelsius/{kelvin}")
    public double kelvinToCelsius(@PathVariable double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("La temperatura en Kelvin no puede ser menor que 0K");
        }
        return Math.round((kelvin - 273.15) * 100.0) / 100.0;
    }

    // Método para convertir grados Kelvin a grados Fahrenheit
    @GetMapping("/grade/kelvinToFahrenheit/{kelvin}")
    public double kelvinToFahrenheit(@PathVariable double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("La temperatura en Kelvin no puede ser menor que 0K");
        }
        return Math.round(((kelvin -273.15) * 9/5 + 32) * 100.0) / 100.0;
    }


   //* @Autowired
   // private  TemperaturaService temperaturaService;

   // @GetMapping("/{temperatiraId}")
    //public Optional<Temperatura> getBId(@PathVariable("temperatiraId")Long temperatiraId){
    //    return temperaturaService.getTemperatura(temperatiraId);
   // }*//
}