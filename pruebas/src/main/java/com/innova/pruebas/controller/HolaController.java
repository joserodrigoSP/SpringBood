package com.innova.pruebas.controller;

import com.innova.pruebas.dto.HolaDto;
import com.innova.pruebas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaController {


    @GetMapping
    public String holaMundo(){
        return "HOLA SOY YO";
    }

    @GetMapping("/{nombre}")
    public HolaDto hola2(@PathVariable("nombre") String nombre){
        return  new HolaDto(nombre);
    }
    }
