
package com.cibertec.sistema.Tramites.controller;

import com.cibertec.sistema.Tramites.entity.Documento;
import com.cibertec.sistema.Tramites.service.DocuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/docu")
public class DocuController {
   
    
    @Autowired
    private DocuService docuservice;
    
    @PostMapping
    public ResponseEntity<Documento> addDocu(@RequestBody Documento documento){
        
        return new ResponseEntity<>(docuservice.addDocu(documento),HttpStatus.CREATED);
    
}
}
