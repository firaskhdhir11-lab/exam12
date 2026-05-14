package com.exam.avis.controller;

import com.exam.avis.service.AvisService;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api/avis")
public class AvisController {
    private final AvisService service;
    
    public AvisController(AvisService service) {
        this.service = service;
    }

    @GetMapping
    public List<Map<String, String>> getAll() {
        return List.of(Map.of("message", "Avis service is running"));
    }

    @PostMapping
    public Map<String, String> verifier(@RequestBody Map<String, Long> request) {
        Long produitId = request.get("produitId");
        service.verifierEtSauvegarder(produitId);
        return Map.of("status", "success", "produitId", produitId.toString());
    }
}
