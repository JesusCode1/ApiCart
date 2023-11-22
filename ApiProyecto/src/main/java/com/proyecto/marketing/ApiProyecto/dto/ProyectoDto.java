
package com.proyecto.marketing.ApiProyecto.dto;

import com.proyecto.marketing.ApiProyecto.entity.Actividad;
import lombok.Data;

@Data
public class ProyectoDto {
     
    private Long id;
    private String nombre;
    private String descripcion;
    private Actividad actividad;
}
