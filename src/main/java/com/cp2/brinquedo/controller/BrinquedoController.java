package com.cp2.brinquedo.controller;

import com.cp2.brinquedo.entity.Brinquedo;
import com.cp2.brinquedo.service.BrinquedoService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private BrinquedoService brinquedoService;
    public BrinquedoController(BrinquedoService brinquedoService) {
       this.brinquedoService = brinquedoService;
    }


    @GetMapping("/cadastrar")
    public String cadastrarBrinquedo(){
        return "brinquedos/cadastrar";
    }
   @GetMapping("/listar")
    public String listarBrinquedos(Model model) {
        List<Brinquedo> brinquedos = brinquedoService.list(); // Busca a lista de brinquedos
        model.addAttribute("brinquedos", brinquedos); // Adiciona a lista no modelo
        return "brinquedos/listar"; // Nome do template Thymeleaf para exibir a lista
    }
    @PostMapping("/cadastrar")
    public String cadastrarBrinquedo(String nome, String classificacao, float tamanho, BigDecimal preco, Model model){
        model.addAttribute("nome", nome);
        model.addAttribute("classificacao", classificacao);
        model.addAttribute("tamanho", tamanho);
        model.addAttribute("preco", preco);
        brinquedoService.create(new Brinquedo(nome, classificacao, tamanho, preco));
        return "brinquedos/cadastrar";
    }


@PostMapping
    List<Brinquedo> create(@RequestBody Brinquedo brinquedo){
        return brinquedoService.create(brinquedo);
    }
    @GetMapping()
    List<Brinquedo> list (){

        return brinquedoService.list();
    }

    @PutMapping
    List<Brinquedo> update (@RequestBody Brinquedo brinquedo){
        return brinquedoService.update(brinquedo);
    }

    @DeleteMapping("/{id}")
    List<Brinquedo> delete (@PathVariable Long id){
        return brinquedoService.delete(id);
    }

}
