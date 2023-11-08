
package com.cibertec.ecommerce.ApiAuth.dao;

import com.cibertec.ecommerce.ApiAuth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByEmail(String email);
    
}
