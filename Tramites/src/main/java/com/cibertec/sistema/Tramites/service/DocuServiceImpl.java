
package com.cibertec.sistema.Tramites.service;

import com.cibertec.sistema.Tramites.dao.DocuRepository;
import com.cibertec.sistema.Tramites.entity.Documento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocuServiceImpl implements DocuService {

    @Autowired
    private DocuRepository docurepository;
    
    @Override
    public Documento addDocu(Documento documento) {
        return docurepository.save(documento);
    }
    
}
