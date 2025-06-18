
package com.Clinica.SistemaClinicaBack.exception;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;



//en esta clase se van a capturar todas las exceptions
@ControllerAdvice
public class GlobalExceptionHandler {
    
    
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException ex,
                                                                        WebRequest webRequest){       
        ErrorDetails error = new ErrorDetails (
                LocalDateTime.now(),
                ex.getMessage(), 
                webRequest.getDescription(false),
                "Not found"
        );
        
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    
}
