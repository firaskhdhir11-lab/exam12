package com.exam.avis.service;
import com.exam.avis.client.ProduitClient;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class AvisService {
    private final ProduitClient produitClient;
    public AvisService(ProduitClient produitClient) { this.produitClient = produitClient; }

    public void verifierEtSauvegarder(Long produitId) {
        try {
            produitClient.getProduitById(produitId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produit inconnu");
        }
    }
}
