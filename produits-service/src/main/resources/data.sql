INSERT INTO categorie (id, nom) VALUES (1, 'Electronique'), (2, 'Maison'), (3, 'Jouets') ON CONFLICT (id) DO NOTHING;
INSERT INTO produit (id, nom, prix, stock, categorie_id) VALUES 
(1, 'Smartphone', 800, 10, 1),
(2, 'PC Portable', 1500, 5, 1),
(3, 'Canapé', 499.99, 20, 2),
(4, 'Table', 199.99, 15, 2),
(5, 'Peluche', 29.99, 100, 3) ON CONFLICT (id) DO NOTHING;
