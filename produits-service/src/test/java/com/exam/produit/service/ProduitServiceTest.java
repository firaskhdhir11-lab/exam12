package com.exam.produit.service;

import com.exam.produit.entity.Produit;
import com.exam.produit.repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ProduitServiceTest {

    @Mock
    private ProduitRepository repository;

    @InjectMocks
    private ProduitService service;

    @Test
    void testFindProduitById() {
        Produit mockProduit = new Produit();
        mockProduit.setId(1L);
        mockProduit.setNom("PC Test");
        
        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(mockProduit));

        Produit result = service.getProduitById(1L);
        
        assertNotNull(result);
        assertEquals("PC Test", result.getNom());
    }
}