
package com.cibertec.ecommerce.ApiAuth.controller;

import com.cibertec.ecommerce.ApiAuth.dto.SingUpDto;
import com.cibertec.ecommerce.ApiAuth.entity.User;
import com.cibertec.ecommerce.ApiAuth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @PostMapping("/signup")
    public ResponseEntity<?> 
        registerUser(@RequestBody SingUpDto userDto){
            User user = new User ();
            user.setName(userDto.getName());
            user.setUserName(userDto.getUserName());
            user.setEmail(userDto.getEmail());
            user.setPassword(passwordEncoder.encode(userDto.getPassword()));
            user.setRoles(userDto.getRoles());
            var result = userService.add(user);
            
            return new ResponseEntity<>(result,HttpStatus.CREATED);
            
    }
}
