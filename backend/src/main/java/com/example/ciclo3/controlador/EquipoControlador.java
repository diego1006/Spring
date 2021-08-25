package com.example.ciclo3.controlador;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ciclo3.modelos.EquipoModelo;
import com.example.ciclo3.servicios.EquipoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/equipo")
public class EquipoControlador {
    @Autowired
    EquipoServicio equipoServicio;

    @GetMapping
    public ArrayList<EquipoModelo> obtenerEquipos(){
        return equipoServicio.obtenerEquipos();
    }

    @GetMapping(path="/{id}")
    public Optional<EquipoModelo> obtenerEquipoById(@PathVariable("id") Long id){
        return this.equipoServicio.obtenerEquipoById(id);
    }

    @PostMapping
    public EquipoModelo guardarUsuario(@RequestBody EquipoModelo equipo){
        return equipoServicio.guardarEquipo(equipo);
    }
    
}
