package com.innova.pruebas.controller;

import com.innova.pruebas.dto.UserDto;
import com.innova.pruebas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> findAll(){
        return this.userService.findAll();
    }

    @GetMapping("{id}")
    public UserDto findById(@RequestBody Long id){
    return userService.findById(id);
    }

    @PostMapping
    public  UserDto save(@RequestBody  UserDto user){
        return this.userService.save(user);
    }
}
