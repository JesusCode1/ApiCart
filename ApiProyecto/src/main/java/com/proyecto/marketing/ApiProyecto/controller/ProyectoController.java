
package com.proyecto.marketing.ApiProyecto.controller;

import com.proyecto.marketing.ApiProyecto.dto.ProyectoDto;
import com.proyecto.marketing.ApiProyecto.entity.Proyecto;
import com.proyecto.marketing.ApiProyecto.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/proyecto")
public class ProyectoController {
    
    @Autowired
    private ProyectoService proyectoService;
    
    @PostMapping("add")
    public ResponseEntity<Proyecto>add(@RequestBody Proyecto proyecto){
        return new ResponseEntity<>( proyectoService.add(proyecto),
                    HttpStatus.CREATED);
    }
    @GetMapping("findById/{id}")
    public ResponseEntity<ProyectoDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(proyectoService.findById(id),
                HttpStatus.OK);
    }
    
}
