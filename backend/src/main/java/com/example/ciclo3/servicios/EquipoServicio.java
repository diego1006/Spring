package com.example.ciclo3.servicios;

import java.util.ArrayList;
import java.util.Optional;


import com.example.ciclo3.modelos.EquipoModelo;
import com.example.ciclo3.repo.EquipoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoServicio {
    
    @Autowired
    EquipoRepo equipoRepo;

    public ArrayList<EquipoModelo> obtenerEquipos(){
        return (ArrayList<EquipoModelo>) equipoRepo.findAll();
    }

    public EquipoModelo guardarEquipo(EquipoModelo equipo){
        return equipoRepo.save(equipo);
    }

    public Optional<EquipoModelo> obtenerEquipoById(Long id){
        return equipoRepo.findById(id);
    }
}
