
package com.cibertec.ApiProductoCategoria.dao;

import com.cibertec.ApiProductoCategoria.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
    Producto findBynombreProducto(String nombreProducto);
}

