package com.Clinica.SistemaClinicaBack.service;

import com.Clinica.SistemaClinicaBack.entity.Periodo;
import java.util.List;


public interface PeriodoService {

    Periodo save(Periodo periodo);

    List<Periodo> findAll();

    Periodo findById(Integer id);

    void deleteById(Integer id);

    Periodo update(Periodo periodo);

}
