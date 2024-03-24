# DELETE FROM Journee;
# DELETE FROM Championnat_Equipe;
# DELETE FROM Championnat;
# DELETE FROM Equipe;
# DELETE FROM Stade;
# DELETE FROM Pays;
# ALTER TABLE Journee AUTO_INCREMENT = 1;
# ALTER TABLE Championnat AUTO_INCREMENT = 1;
# ALTER TABLE Equipe AUTO_INCREMENT = 1;
# ALTER TABLE Stade AUTO_INCREMENT = 1;
# ALTER TABLE Pays AUTO_INCREMENT = 1;
# ALTER TABLE Championnat_Equipe AUTO_INCREMENT = 1;
#
# INSERT INTO Pays (logo, nom)
# VALUES
#     ('fff_logo.png','France'),
#     ('england_logo.png','Angleterre');
#
# INSERT INTO Stade (adresse, capcaite, nom, telephone)
# VALUES
#     ('10 Avenue Simone Veil, 69150 Décines-Charpieu', '59 286', 'Groupama Stadium', '+33 4 81 07 55 00'),
#     ('111 Rue de Lorient, 35000 Rennes', '29 778', 'Roazhon Park', '+33 2 99 14 20 00'),
#     ('3 Boulevard Michelet, 13008 Marseille', '67 394', 'Orange Vélodrome', '+33 4 91 17 20 20'),
#     ('24 Rue du Commandant Guilbaud, 75016 Paris', '47 929', 'Parc des Princes', '+33 1 47 43 71 71');
#
# INSERT INTO Equipe (date_creation, logo, nom, nom_entraineur, president, siege, site_web, statut, telephone, stade_id)
# VALUES
#     ('1950-08-03', 'ol_logo.svg', 'Olympique Lyonnais', 'Pierre Mourinho Sage', 'John Textor', '10 Avenue Simone Veil, 69150 Décines-Charpieu', 'https://www.ol.fr', 'professionnelle', '+33 4 81 07 55 00', 1),
#     ('1901-03-10', 'rennes_logo.png', 'Stade Rennais FC', 'Julien Stéphan', 'Olivier Cloarec', '111 Rue de Lorient, 35000 Rennes', 'https://www.staderennais.com', 'professionnelle', '+33 2 99 14 20 00', 2),
#     ('1899-08-31', 'om_logo.svg', 'Olympique de Marseille', 'Jean-Louis Gasset', 'Pablo Longoria', '3 Boulevard Michelet, 13008 Marseille', 'https://www.om.fr', 'professionnelle', '+33 4 91 17 20 20', 3),
#     ('1970-08-12', 'psg_logo.png', 'Paris Saint Germain', 'Luis Enrique', 'Nasser Al-Khelaïfi', '24 Rue du Commandant Guilbaud, 75016 Paris', 'https://www.psg.fr', 'professionnelle', '+33 1 47 43 71 71', 4);
#
# INSERT INTO Championnat (nom, logo, date_debut, date_fin, point_gagne, point_perdu, point_nul, type_classement, pays_id)
# VALUES
#     ('Ligue 1', 'logo_ligue_1.png', '2023-08-01', '2024-05-31', 3, 0, 1, 2, 1),
#     ('Ligue 2', 'logo_ligue_2.png', '2023-08-01', '2024-05-31', 3, 0, 1, 2, 1);
#
# INSERT INTO Championnat_Equipe(points,championnat_id,equipe_id)
# VALUES
#     (10,1,1),
#     (12,1,2),
#     (13,1,3),
#     (16,1,4);
#
#
#
# INSERT INTO Journee (numero, championnat_id)
# VALUES
#     (1, 1), (2, 1), (3, 1), (4, 1), (5, 1), (6, 1), (7, 1), (8, 1), (9, 1), (10, 1),
#     (11, 1), (12, 1), (13, 1), (14, 1), (15, 1), (16, 1), (17, 1), (18, 1), (19, 1), (20, 1),
#     (21, 1), (22, 1), (23, 1), (24, 1), (25, 1), (26, 1), (27, 1), (28, 1), (29, 1), (30, 1),
#     (31, 1), (32, 1), (33, 1), (34, 1), (35, 1), (36, 1), (37, 1), (38, 1),
#
#     (1, 2), (2, 2), (3, 2), (4, 2), (5, 2), (6, 2), (7, 2), (8, 2), (9, 2), (10, 2),
#     (11, 2), (12, 2), (13, 2), (14, 2), (15, 2), (16, 2), (17, 2), (18, 2), (19, 2), (20, 2),
#     (21, 2), (22, 2), (23, 2), (24, 2), (25, 2), (26, 2), (27, 2), (28, 2), (29, 2), (30, 2),
#     (31, 2), (32, 2), (33, 2), (34, 2), (35, 2), (36, 2), (37, 2), (38, 2);
#
