
package com.cibertec.sistema.Tramites.controller;

import com.cibertec.sistema.Tramites.entity.Empleado;
import com.cibertec.sistema.Tramites.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1/emp")
public class EmpController {
    @Autowired
    private EmpService empservice;
    
    @PostMapping
    public ResponseEntity<Empleado> add(@RequestBody Empleado empleado){
        
        return new ResponseEntity<>(empservice.addEmp(empleado),HttpStatus.CREATED);
    }
}
