
package com.proyecto.marketing.ApiProyecto.dao;

import com.proyecto.marketing.ApiProyecto.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
    
}
