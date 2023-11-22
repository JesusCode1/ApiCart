
package com.proyecto.marketing.ApiActividad.controller;

import com.proyecto.marketing.ApiActividad.entity.Actividad;
import com.proyecto.marketing.ApiActividad.service.ActividadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/v1/actvidad")
public class ActividadController {
    
    @Autowired
    private ActividadService actividadService;
    
    @GetMapping("/findAll")
    public List<Actividad> findAll(){
        return actividadService.findAll();
        
    }
    @GetMapping("/findById/{id}")
    public Actividad findById(@PathVariable Long id){
        return actividadService.findById(id);
    }
    @PostMapping("/add")
    public Actividad add(@RequestBody Actividad actividad){
        return actividadService.add(actividad);
    }
    @PutMapping("/update")
    public Actividad update(@RequestBody Actividad actividad){
        return actividadService.update(actividad);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        actividadService.delete(id);
    }   
    
    @GetMapping("/findByTipo/{tipo}")
    public ResponseEntity<Actividad> findByTipo(@PathVariable String tipo){
       return new ResponseEntity<>(actividadService.findByTipo(tipo),
                HttpStatus.OK);
    }
}
    
