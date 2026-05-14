package com.exam.produit.service;

import com.exam.produit.entity.Produit;
import com.exam.produit.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository repository;

    // Cette méthode manquait au Controller
    public List<Produit> getAll() {
        return repository.findAll();
    }

    // Cette méthode est utilisée par le POST du Controller
    public Produit save(Produit p) {
        return repository.save(p);
    }

    // Gardée pour les tests unitaires
    public Produit getProduitById(Long id) {
        return repository.findById(id).orElse(null);
    }
}