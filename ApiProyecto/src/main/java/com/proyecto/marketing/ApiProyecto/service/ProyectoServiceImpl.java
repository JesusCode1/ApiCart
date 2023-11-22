/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.marketing.ApiProyecto.service;

import com.proyecto.marketing.ApiProyecto.dao.ProyectoRepository;
import com.proyecto.marketing.ApiProyecto.dto.ProyectoDto;
import com.proyecto.marketing.ApiProyecto.entity.Actividad;
import com.proyecto.marketing.ApiProyecto.entity.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl implements ProyectoService{
    
     @Autowired
    private ProyectoRepository proyectoRepository;
    @Autowired
    private ApiRestActividad apiRestActividad;

    @Override
    public Proyecto add(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public ProyectoDto findById(Long id) {
        Proyecto proyecto = proyectoRepository.findById(id).get();
        
        Actividad actividad =  apiRestActividad.findBytipo(proyecto.getTipo());
        
        ProyectoDto proyectoDto = new ProyectoDto();
        
        proyectoDto.setId(proyecto.getId());
        proyectoDto.setNombre(proyecto.getNombre());
        proyectoDto.setDescripcion(proyecto.getDescripcion());
        proyectoDto.setActividad(actividad);
        
        return proyectoDto;
    }
    
    
    
    
    
}
