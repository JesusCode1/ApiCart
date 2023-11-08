
package com.cibertec.sistema.Tramites.dao;

import com.cibertec.sistema.Tramites.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmpRepository extends JpaRepository<Empleado, Long>{
    
}
