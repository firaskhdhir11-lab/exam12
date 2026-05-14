 Projet Microservices - Gestion de Boutique

Ce projet est une architecture microservices développée avec **Spring Boot**, **Docker** et **Flutter**.

## 🚀 Architecture
- **Eureka Server** (8761) : Découverte.
- **API Gateway** (8090) : Point d'entrée.
- **Produits Service** (8091) : CRUD Produits + PostgreSQL.
- **Avis Service** (8092) : Gestion des avis + OpenFeign.

## 📁 Structure Standard
```text
D:\Exam
│   docker-compose.yml
├───eureka-server
├───api-gateway
├───produits-service (Contient application.yml et data.sql)
└───avis-service (Contient application.yml)
```

## 🛠️ Lancement Rapide (PowerShell)
1. Ouvrez PowerShell en tant qu'administrateur dans D:\Exam.
2. Exécutez : `.\setup.ps1`