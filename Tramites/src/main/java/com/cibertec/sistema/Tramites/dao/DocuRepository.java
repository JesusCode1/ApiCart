
package com.cibertec.sistema.Tramites.dao;

import com.cibertec.sistema.Tramites.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocuRepository extends JpaRepository<Documento, Long>{
    
}
