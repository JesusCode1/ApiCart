
package com.cibertec.sistema.Tramites.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Date;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Documento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String sumilla;
    private String pedido;
    private Date fechaIngreso;
    
    @ManyToMany
    @JoinTable(name = "empleado_documento",
               joinColumns = @JoinColumn(name = "empleado_id",referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "documento_id",referencedColumnName = "id"))
    private Set<Empleado> empleado;
}
