
package com.Clinica.SistemaClinicaBack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//esta clase sirve par que lance la exception de not found cuando no encuentra al alumno o alguna busqueda

public class ResourceNotFoundException extends RuntimeException{
    
    private String message;

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    
   
    
}
