package com.exam.produit.service;
import com.exam.produit.entity.Produit;
import com.exam.produit.repository.ProduitRepository;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository repository;
    public ProduitService(ProduitRepository repository) { this.repository = repository; }

    @Cacheable(value = "produits", key = "'all'")
    public List<Produit> getAll() { return repository.findAll(); }

    @CacheEvict(value = "produits", allEntries = true)
    public Produit save(Produit p) { return repository.save(p); }
}
