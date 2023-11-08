
package com.cibertec.ecommerce.ApiAuth.dto;

import com.cibertec.ecommerce.ApiAuth.entity.Role;
import java.util.Set;
import lombok.Data;


@Data
public class SingUpDto {
    
    private String name;
    private String userName;
    private String email;
    private String password;
    private Set<Role>roles;
}
