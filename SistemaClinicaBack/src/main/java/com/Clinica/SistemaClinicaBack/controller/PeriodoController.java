
package com.Clinica.SistemaClinicaBack.controller;

import com.Clinica.SistemaClinicaBack.entity.Periodo;
import com.Clinica.SistemaClinicaBack.entity.Usuario;
import com.Clinica.SistemaClinicaBack.service.PeriodoService;
import com.Clinica.SistemaClinicaBack.service.UsuarioService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/periodo")
@CrossOrigin(origins = "http://localhost:4200")
public class PeriodoController {
    
    private final PeriodoService periodoservice;

    public PeriodoController(PeriodoService periodoservice) {
        this.periodoservice = periodoservice;
    }
    
    
    //localhost:8080/api/periodo
    @PostMapping
    public Periodo save(@RequestBody Periodo periodo){
        return periodoservice.save(periodo);
    }
    
    //localhost:8080/api/periodo
    @GetMapping
    public List<Periodo> findAll(){
        return periodoservice.findAll();
    }
    
    //localhost:8080/api/periodo/"id"
    @GetMapping("/{idPeriodo}")    
    public Periodo findById(@PathVariable("idPeriodo") Integer id){
    return periodoservice.findById(id);
    }
    
    //localhost:8080/api/periodo/"id"
    @DeleteMapping("/{idPeriodo}") 
    public void deleteById(@PathVariable("idPeriodo") Integer id){
        periodoservice.deleteById(id);
    }
    
    //localhost:8080/api/periodo
    @PutMapping
    public Periodo UpdatePeriodo(@RequestBody Periodo periodo){
        
        Periodo periododb = periodoservice.findById(periodo.getIdPeriodo());
        periododb.setPeriodo(periodo.getPeriodo());
        
        return periodoservice.update(periododb);
    }
    
    
    
    
    
    
    
    
}
