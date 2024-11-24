package com.innova.pruebas.dto;

public class HolaDto {

    private String nombre;
    private String fecha;

    public HolaDto(String nombre) {
        this.nombre = "Hola "+ nombre;
        this.fecha = "22/11";
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
