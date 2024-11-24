package com.innova.pruebas.controller;

import com.innova.pruebas.dto.UserDto;
import com.innova.pruebas.service.UserService;
import org.apache.catalina.User;
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
    public UserDto findById(@RequestBody String id){
    return userService.findById(id);
    }

    @PostMapping
    public  UserDto save(@RequestBody  UserDto user){
        return this.userService.save(user);
    }

    @PutMapping("/{id}")
    public UserDto update(@PathVariable String id, @RequestBody UserDto userDto){

        return this.userService.update(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
         this.userService.delete(id);
    }
}
