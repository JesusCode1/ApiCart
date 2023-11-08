
package com.cibertec.ecommerce.ApiAuth.dao;

import com.cibertec.ecommerce.ApiAuth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long>{
    
    Role findByName (String name);
}
