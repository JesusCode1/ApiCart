
package com.proyecto.marketing.ApiProyecto.service;

import com.proyecto.marketing.ApiProyecto.dto.ProyectoDto;
import com.proyecto.marketing.ApiProyecto.entity.Proyecto;




public interface ProyectoService {
    
    public Proyecto add(Proyecto proyecto);
    public ProyectoDto findById(Long id);
    
}
