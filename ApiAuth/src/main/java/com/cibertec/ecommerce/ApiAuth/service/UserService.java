
package com.cibertec.ecommerce.ApiAuth.service;

import com.cibertec.ecommerce.ApiAuth.entity.User;


public interface UserService {
    
        User findByEmail(String email);
        User add(User user);
    
    
}

