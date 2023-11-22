
package com.proyecto.marketing.ApiProyecto.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.proyecto.marketing.ApiProyecto.entity.Actividad;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "actividad-service",url = "http://localhost:8050/")
public interface ApiRestActividad{
    
    @GetMapping("api/v1/actvidad/findByTipo/{tipo}")
    Actividad findBytipo(@PathVariable String tipo);
}
