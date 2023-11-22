
package com.cibertec.ApiProductoCategoria.dao;

import com.cibertec.ApiProductoCategoria.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
    Categoria findBynombreCategoria (String nombreCategoria);
}
