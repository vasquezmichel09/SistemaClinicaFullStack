package com.Clinica.SistemaClinicaBack.service;

import com.Clinica.SistemaClinicaBack.entity.Antecedentes;
import com.Clinica.SistemaClinicaBack.exception.ResourceNotFoundException;
import com.Clinica.SistemaClinicaBack.repository.AntecedentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AntecedentesServiceImp implements AntecedentesService {

    private final AntecedentesRepository antecedentesRepository;

    @Autowired
    public AntecedentesServiceImp(AntecedentesRepository antecedentesRepository) {
        this.antecedentesRepository = antecedentesRepository;
    }

    @Override
    public Antecedentes save(Antecedentes antecedentes) {
        return antecedentesRepository.save(antecedentes);
    }

    @Override
    public List<Antecedentes> findAll() {
        return antecedentesRepository.findAll();
    }

    @Override
    public Antecedentes findById(Integer id) {
        return antecedentesRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                "El antecedente con id " + id + " no se encuentra"));
    }

    @Override
    public void deleteById(Integer id) {
        antecedentesRepository.deleteById(id);
    }

    @Override
    public Antecedentes update(Antecedentes antecedentes) {
        return antecedentesRepository.save(antecedentes);
    }



    }


