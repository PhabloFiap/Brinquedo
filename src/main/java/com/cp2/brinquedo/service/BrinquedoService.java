package com.cp2.brinquedo.service;

import com.cp2.brinquedo.entity.Brinquedo;
import com.cp2.brinquedo.repository.BrinquedoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrinquedoService {
private BrinquedoRepository brinquedoRepository;

    public BrinquedoService(BrinquedoRepository brinquedoRepository){
        this.brinquedoRepository = brinquedoRepository;

    }
    public List<Brinquedo> create(Brinquedo brinquedo) {
    brinquedoRepository.save(brinquedo);

        return list();
    }
    public List<Brinquedo> list() {
       Sort sort = Sort.by("nome").descending();
        brinquedoRepository.findAll();
        return brinquedoRepository.findAll(sort);


    }

}
