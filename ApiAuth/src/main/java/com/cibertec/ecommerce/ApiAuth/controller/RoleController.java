

package com.cibertec.ecommerce.ApiAuth.controller;

import com.cibertec.ecommerce.ApiAuth.entity.Role;
import com.cibertec.ecommerce.ApiAuth.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/role")
public class RoleController {
    
    @Autowired
    private RoleService roleService;
    
    @GetMapping
    public ResponseEntity<List<Role>> findAll(){
        
        return new ResponseEntity <>(roleService.findAll(),HttpStatus.OK);
        
    }
    @PostMapping
    public ResponseEntity<Role> addRole(@RequestBody Role role){
        
        return new ResponseEntity<>(roleService.addRole(role),HttpStatus.CREATED);
    }
    
}
