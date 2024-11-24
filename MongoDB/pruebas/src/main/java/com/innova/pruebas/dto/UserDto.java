package com.innova.pruebas.dto;

import javax.xml.crypto.Data;
import java.util.Date;

public class UserDto {

    private String id;
    private String nombre;


    public UserDto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public UserDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
