
package com.cibertec.ApiProductoCategoria.service;

import com.cibertec.ApiProductoCategoria.entity.Producto;
import java.util.List;
import org.springframework.data.domain.Page;

public interface ProductoService {
    public List<Producto> findAll();
    public Page<Producto> findPage(int page, int size);
    public Producto findById(Long id);
    public Producto findBynombreProducto(String nombreProducto);
    public Producto add (Producto producto);
    public Producto update(Producto producto);
    public void delete(Long id);
    
}
