
package com.proyecto.marketing.ApiActividad.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Actividad {
    
    @Id
    private Long id_actividad;
    private String descripcion;
    private String estado;
    private String proyecto; 
   
}
