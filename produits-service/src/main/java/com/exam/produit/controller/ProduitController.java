package com.exam.produit.controller;
import com.exam.produit.entity.Produit;
import com.exam.produit.service.ProduitService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {
    private final ProduitService service;
    public ProduitController(ProduitService service) { this.service = service; }

    @GetMapping
    public List<Produit> getAll() { return service.getAll(); }

    @PostMapping
    public Produit save(@RequestBody Produit p) { return service.save(p); }
}
