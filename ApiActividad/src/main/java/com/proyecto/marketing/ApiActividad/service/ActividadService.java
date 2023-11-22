
package com.proyecto.marketing.ApiActividad.service;

import com.proyecto.marketing.ApiActividad.entity.Actividad;
import java.util.List;


public interface ActividadService {
    
    
    public List<Actividad> findAll ();
    public Actividad findById(Long id_actividad);
    public Actividad add(Actividad actividad);
    public Actividad update(Actividad actividad);
    public void delete (Long id_actividad);
}
