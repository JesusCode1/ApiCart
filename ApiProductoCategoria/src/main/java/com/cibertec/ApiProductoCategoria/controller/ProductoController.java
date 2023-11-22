
package com.cibertec.ApiProductoCategoria.controller;

import com.cibertec.ApiProductoCategoria.entity.Producto;
import com.cibertec.ApiProductoCategoria.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/producto")

public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Producto>> findAll(){
        return new ResponseEntity<>(productoService.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findPage/page/{page}/size/{size}")
    public ResponseEntity<Page<Producto>> findPage(int page, int size){
        return new ResponseEntity<>(productoService.findPage( page, size),HttpStatus.OK);
    }
    
    @GetMapping("/findByName/{nombreProducto}")
    public ResponseEntity<Producto> findByName(@PathVariable String nombreProducto){
        return new ResponseEntity<>(productoService.findBynombreProducto(nombreProducto),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Producto> add(@RequestBody Producto producto){
        return new ResponseEntity<>(productoService.add(producto),HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Producto> update(@RequestBody Producto producto){
        return new ResponseEntity<>(productoService.update(producto),HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        productoService.delete(id);
    }
    
}
