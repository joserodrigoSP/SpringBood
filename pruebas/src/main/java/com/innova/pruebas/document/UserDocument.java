package com.innova.pruebas.document;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "users")
public class UserDocument {
    @Id
    private long id;
    private String nombre;
    private Date fecha;

}
