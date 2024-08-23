package com.cp2.brinquedo.controller;

import com.cp2.brinquedo.entity.Brinquedo;
import com.cp2.brinquedo.service.BrinquedoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private BrinquedoService brinquedoService;
    public BrinquedoController(BrinquedoService brinquedoService) {
        this.brinquedoService = brinquedoService;
    }

@PostMapping
    List<Brinquedo> create(@RequestBody Brinquedo brinquedo){return brinquedoService.create(brinquedo); }
    @GetMapping()
    List<Brinquedo> list (){

        return brinquedoService.list();
    }

}
