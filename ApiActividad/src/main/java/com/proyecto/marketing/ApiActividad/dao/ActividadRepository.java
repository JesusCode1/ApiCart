
package com.proyecto.marketing.ApiActividad.dao;

import com.proyecto.marketing.ApiActividad.entity.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ActividadRepository extends JpaRepository<Actividad, Long>{
     
        Actividad findByTipo(String tipo);
}
