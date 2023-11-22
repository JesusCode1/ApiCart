
package com.cibertec.ApiProductoCategoria.service;

import com.cibertec.ApiProductoCategoria.entity.Categoria;
import java.util.List;
import org.springframework.data.domain.Page;


public interface CategoriaService {
     public List <Categoria> findAll();
    public Page <Categoria> findPage(int page, int size);
    public Categoria findById(Long id);
    public Categoria findBynombreCategoria(String nombreCategoria);
    public Categoria add(Categoria categoria);
    public Categoria update(Categoria categoria);
    public void delete(Long id);
}
