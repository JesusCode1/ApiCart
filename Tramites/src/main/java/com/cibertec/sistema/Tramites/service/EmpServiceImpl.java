
package com.cibertec.sistema.Tramites.service;

import com.cibertec.sistema.Tramites.dao.EmpRepository;
import com.cibertec.sistema.Tramites.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{
    
    
    @Autowired
    private EmpRepository emprepository;
    
    @Override
    public Empleado addEmp(Empleado empleado) {
        return emprepository.save(empleado);
    }
    
}
