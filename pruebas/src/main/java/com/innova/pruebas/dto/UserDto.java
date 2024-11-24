package com.innova.pruebas.dto;

import javax.xml.crypto.Data;
import java.util.Date;

public class UserDto {

    private long id;
    private String nombre;


    public UserDto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public UserDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
