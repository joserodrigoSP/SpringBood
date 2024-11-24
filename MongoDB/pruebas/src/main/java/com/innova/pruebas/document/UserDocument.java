package com.innova.pruebas.document;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "users")
public class UserDocument {
    @Id
    private String id;
    private String nombre;
    private Date fecha;

    public UserDocument() {
    }

    public UserDocument(String id, String nombre, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
