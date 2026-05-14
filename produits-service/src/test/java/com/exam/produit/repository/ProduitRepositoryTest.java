package com.exam.produit.repository;

import com.exam.produit.entity.Produit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
public class ProduitRepositoryTest {

    @Autowired
    private ProduitRepository repository;

    @Test
    void testSaveProduit() {
        Produit p = new Produit();
        p.setNom("H2 Test");
        p.setPrix(99.0);
        p.setStock(10);
        
        Produit saved = repository.save(p);
        assertNotNull(saved.getId());
        assertEquals("H2 Test", saved.getNom());
    }
}