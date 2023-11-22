/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.ApiProductoCategoria.controller;

import com.cibertec.ApiProductoCategoria.entity.Categoria;
import com.cibertec.ApiProductoCategoria.service.CategoriaService;
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
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Categoria>> findAll(){
        return new ResponseEntity<>(categoriaService.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findPage/page/{page}/size/{size}")
    public ResponseEntity< Page<Categoria>> findPage(int page, int size){
        return new ResponseEntity<>(categoriaService.findPage(page, size),HttpStatus.OK);
    }
    
    @GetMapping("/findByCategoria/{nombreCategoria}")
    public ResponseEntity <Categoria> findByCategoria(@PathVariable String nombreCategoria){
        return new ResponseEntity<>(categoriaService.findBynombreCategoria(nombreCategoria),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity <Categoria> add(@RequestBody Categoria categoria){
        return new ResponseEntity<>( categoriaService.add(categoria),HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity <Categoria> update(@RequestBody Categoria categoria){
        return new ResponseEntity<>(categoriaService.update(categoria),HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        categoriaService.delete(id);
    }
    
}
