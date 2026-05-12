package com.exam.produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProduitApplication {
    public static void main(String[] args) { SpringApplication.run(ProduitApplication.class, args); }
}
