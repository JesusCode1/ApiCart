
package com.cibertec.ecommerce.ApiAuth.service;

import com.cibertec.ecommerce.ApiAuth.dao.UserRepository;
import com.cibertec.ecommerce.ApiAuth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByEmail(String email) {
       return userRepository.findByEmail(email);
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }
    
}
