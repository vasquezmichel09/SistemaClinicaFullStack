
package com.Clinica.SistemaClinicaBack.service;

import com.Clinica.SistemaClinicaBack.entity.Periodo;
import com.Clinica.SistemaClinicaBack.exception.ResourceNotFoundException;
import com.Clinica.SistemaClinicaBack.repository.PeriodoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PeriodoServiceImpl  implements PeriodoService{
    
    private final PeriodoRepository periodorepository;

    public PeriodoServiceImpl(PeriodoRepository periodorepository) {
        this.periodorepository = periodorepository;
    }
    
    

    @Override
    public Periodo save(Periodo periodo) {
        return periodorepository.save(periodo);
    }

    @Override
    public List<Periodo> findAll() {
        return periodorepository.findAll();
    }

    @Override
    public Periodo findById(Integer id) {
        Periodo periodo = periodorepository.findById(id).orElseThrow(
        () ->{
                throw new ResourceNotFoundException("El periodo con matricula "+id+" no se encuentra");
            }  
        );       
        return periodo;
    }

    @Override
    public void deleteById(Integer id) {
        periodorepository.deleteById(id);
    }

    @Override
    public Periodo update(Periodo periodo) {
        return periodorepository.save(periodo);
    }
    
}
