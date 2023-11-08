
package com.cibertec.ecommerce.ApiAuth.service;

import com.cibertec.ecommerce.ApiAuth.entity.Role;
import java.util.List;


public interface RoleService {
    
    public List<Role> findAll();
    public Role addRole (Role role);
}
