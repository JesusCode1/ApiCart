
package com.proyecto.marketing.ApiActividad.service;

import com.proyecto.marketing.ApiActividad.dao.ActividadRepository;
import com.proyecto.marketing.ApiActividad.entity.Actividad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadServiceImpl implements ActividadService{
    
    @Autowired
    private ActividadRepository actividadrepository;
    
    @Override
    public List<Actividad> findAll() {
        return actividadrepository.findAll();
    }

    @Override
    public Actividad findById(Long id) {
       return actividadrepository.findById(id).get();
    }

    @Override
    public Actividad add(Actividad actividad) {
         return actividadrepository.save(actividad);
    }

    @Override
    public Actividad update(Actividad actividad) {
       var ActividadDB =  actividadrepository.findById(actividad.getId()).get();
      ActividadDB.setDescripcion(actividad.getDescripcion());
      ActividadDB.setTipo(actividad.getTipo());
      return actividadrepository.save(ActividadDB);

    }

    @Override
    public void delete(Long id) {
         var actividadDB = actividadrepository.findById(id).get();
         actividadrepository.delete(actividadDB);
    }

    @Override
    public Actividad findByTipo(String tipo) {
        
        return actividadrepository.findByTipo(tipo);
    }
    
}
