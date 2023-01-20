package com.listado.paises.service;

import com.listado.paises.entity.Pais;
import com.listado.paises.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaisService {

    @Autowired
    PaisRepository paisRepository;

    public Page<Pais> paginas(Pageable pageable){
        return paisRepository.findAll( pageable);
    }
}
