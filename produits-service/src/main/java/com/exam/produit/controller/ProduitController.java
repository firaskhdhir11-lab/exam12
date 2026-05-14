package com.exam.produit.controller;

import com.exam.produit.entity.Produit;
import com.exam.produit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produits")
@CrossOrigin(origins = "*")
public class ProduitController {

    @Autowired
    private ProduitService service;

    @GetMapping
    public List<Produit> list() {
        return service.getAll();
    }

    @PostMapping
    public Produit create(@RequestBody Produit p) {
        return service.save(p);
    }
    
    @GetMapping("/{id}")
    public Produit detail(@PathVariable Long id) {
        return service.getProduitById(id);
    }
}