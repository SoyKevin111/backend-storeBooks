--TODOS LOS DATOS


INSERT INTO author (name, lastname, email, number_identification, state_name)
VALUES
('Ana', 'Torres', 'ana.torres01@example.com', '1000000001', 'ACTIVE'),
('Luis', 'Ramírez', 'luis.ramirez02@example.com', '1000000002', 'INACTIVE'),
('María', 'López', 'maria.lopez03@example.com', '1000000003', 'ACTIVE'),
('Carlos', 'García', 'carlos.garcia04@example.com', '1000000004', 'INACTIVE'),
('Elena', 'Martínez', 'elena.martinez05@example.com', '1000000005', 'ACTIVE'),
('Jorge', 'Hernández', 'jorge.hernandez06@example.com', '1000000006', 'ACTIVE'),
('Lucía', 'Sánchez', 'lucia.sanchez07@example.com', '1000000007', 'INACTIVE'),
('Raúl', 'Jiménez', 'raul.jimenez08@example.com', '1000000008', 'ACTIVE'),
('Paula', 'Díaz', 'paula.diaz09@example.com', '1000000009', 'ACTIVE'),
('Andrés', 'Moreno', 'andres.moreno10@example.com', '1000000010', 'INACTIVE'),
('Marta', 'Vargas', 'marta.vargas11@example.com', '1000000011', 'ACTIVE'),
('Felipe', 'Cruz', 'felipe.cruz12@example.com', '1000000012', 'INACTIVE'),
('Rosa', 'Peña', 'rosa.pena13@example.com', '1000000013', 'ACTIVE'),
('Tomás', 'Navarro', 'tomas.navarro14@example.com', '1000000014', 'INACTIVE'),
('Laura', 'Suárez', 'laura.suarez15@example.com', '1000000015', 'ACTIVE'),
('Miguel', 'Rojas', 'miguel.rojas16@example.com', '1000000016', 'ACTIVE'),
('Julia', 'Castro', 'julia.castro17@example.com', '1000000017', 'INACTIVE'),
('Héctor', 'Silva', 'hector.silva18@example.com', '1000000018', 'ACTIVE'),
('Valeria', 'Mendoza', 'valeria.mendoza19@example.com', '1000000019', 'INACTIVE'),
('Ricardo', 'Ortega', 'ricardo.ortega20@example.com', '1000000020', 'ACTIVE');



INSERT INTO editorial (name, phone, sitio_web, email, state_name)
VALUES
('Penguin Random House', '2125551234', 'https://www.penguinrandomhouse.com', 'contact@penguin01.com', 'ACTIVE'),
('HarperCollins', '4155552233', 'https://www.harpercollins.com', 'info@harper02.com', 'INACTIVE'),
('Simon & Schuster', '6465553344', 'https://www.simonandschuster.com', 'support@simon03.com', 'ACTIVE'),
('Hachette Book Group', '2125554455', 'https://www.hachettebookgroup.com', 'hello@hachette04.com', 'ACTIVE'),
('Macmillan Publishers', '6465555566', 'https://us.macmillan.com', 'team@macmillan05.com', 'INACTIVE'),
('Scholastic', '8005556677', 'https://www.scholastic.com', 'scholastic06@contact.com', 'ACTIVE'),
('Pearson', '2035557788', 'https://www.pearson.com', 'services@pearson07.com', 'INACTIVE'),
('McGraw-Hill Education', '2125558899', 'https://www.mheducation.com', 'mhe@mcgraw08.com', 'ACTIVE'),
('Oxford University Press', '441865556677', 'https://global.oup.com', 'oupress09@oxford.com', 'ACTIVE'),
('Cambridge University Press', '441223334455', 'https://www.cambridge.org', 'cupress10@cambridge.com', 'INACTIVE'),
('Editorial Planeta', '34934567890', 'https://www.planetadelibros.com', 'planeta11@editorial.com', 'ACTIVE'),
('Grupo Santillana', '34911222333', 'https://santillana.com', 'santillana12@grupo.com', 'ACTIVE'),
('Editorial Norma', '5713456789', 'https://www.editorialnorma.com', 'norma13@editorial.com', 'INACTIVE'),
('Alianza Editorial', '34911222444', 'https://www.alianzaeditorial.es', 'alianza14@books.com', 'ACTIVE'),
('Siglo XXI Editores', '54911222555', 'https://www.sigloxxieditores.com', 'siglo15@editorial.com', 'INACTIVE'),
('Ediciones SM', '34911222666', 'https://www.grupo-sm.com', 'sm16@ediciones.com', 'ACTIVE'),
('Anagrama', '34911222777', 'https://www.anagrama-ed.es', 'contacto@anagrama17.com', 'ACTIVE'),
('Tusquets Editores', '34911222888', 'https://www.tusquetseditores.com', 'tusquets18@libros.com', 'INACTIVE'),
('Editorial Edebé', '34911222999', 'https://www.edebe.com', 'edebe19@editorial.com', 'ACTIVE'),
('Editorial Océano', '525555331122', 'https://www.oceano.mx', 'oceano20@editorial.com', 'INACTIVE');




INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Carlos', 'Gómez', '7852341', 'Calle 123', '1990-08-25', '1029384756', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Lucía', 'Pérez', '987654321', 'Av. Central 456', '1985-11-14', '1234567890', 'INACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Andrés', 'Rodríguez', '0991234567', 'Mz. B Lt. 9', '1978-06-30', '2345678910', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('María', 'Martínez', '0223456789', 'Callejón 8', '1992-03-12', '3456789102', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Juan', 'López', '0987654321', 'Av. Libertad 100', '1980-12-01', '4567891023', 'INACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Elena', 'Ramírez', '083456789', 'Sector 5 Casa 21', '1975-05-08', '5678910234', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Sofía', 'Sánchez', '072345678', 'Urbanización Norte', '1996-07-19', '6789102345', 'INACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Pedro', 'Fernández', '0961234567', 'Calle San José', '1993-10-03', '7891023456', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Ana', 'Torres', '084567123', 'Villa Bonita', '1982-04-15', '8901234567', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Luis', 'Vargas', '095432178', 'Av. Los Pinos', '2000-09-23', '9012345678', 'INACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Valeria', 'Suárez', '0934567821', 'Calle Real', '1991-02-11', '9123456789', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Jorge', 'Mendoza', '082345671', 'Zona 7', '1972-06-18', '9234567890', 'INACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Camila', 'Castro', '0945678123', 'Portal Sur', '1987-01-27', '9345678901', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Miguel', 'Ortega', '0912345678', 'Parque Industrial', '1968-03-05', '9456789012', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Daniela', 'Cruz', '0891234567', 'Centro Histórico', '2001-08-16', '9567890123', 'INACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Mateo', 'Silva', '0976543210', 'Barrio Nuevo', '1994-05-10', '9678901234', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Rosa', 'Moreno', '0932165478', 'Km 12 Vía a Daule', '1989-09-01', '9789012345', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Tomás', 'Peña', '0843126598', 'Frente al parque', '1970-11-30', '9890123456', 'INACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Julia', 'Rojas', '0967543219', 'Av. Malecón', '1983-07-07', '9901234567', 'ACTIVE');

INSERT INTO customer (name, lastname, phone, address, date_of_birth, identification_number, state_name)
VALUES ('Diego', 'Navarro', '081234567', 'Esquina Central', '1999-12-22', '9012345671', 'INACTIVE');




INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
-- FICTION
(NULL, 'The Great Novel', '2021-05-10', 'A compelling story of love and ambition.', true, 19.99, 50, 'https://example.com/cover1.jpg', 'FICTION', 1),
(NULL, 'City of Shadows', '2023-03-22', 'Urban drama unfolding through intertwined lives.', false, 15.50, 30, 'https://example.com/cover2.jpg', 'FICTION', 2),

-- HISTORY
(NULL, 'The History of Empires', '2020-10-01', 'A deep dive into the world''s greatest empires.', true, 25.00, 40, 'https://example.com/cover3.jpg', 'HISTORY', 3),
(NULL, 'War Chronicles', '2019-11-15', 'Eyewitness accounts from global conflicts.', false, 21.30, 20, 'https://example.com/cover4.jpg', 'HISTORY', 4),

-- FANTASY
(NULL, 'Realm of Fire', '2022-06-17', 'A kingdom ruled by dragons and magic.', true, 27.99, 60, 'https://example.com/cover5.jpg', 'FANTASY', 1),
(NULL, 'The Enchanted Forest', '2021-09-09', 'A mysterious journey through mythical lands.', false, 22.40, 35, 'https://example.com/cover6.jpg', 'FANTASY', 2),

-- BIOGRAPHY
(NULL, 'The Life of Ada Lovelace', '2018-03-12', 'Biography of the first computer programmer.', false, 18.00, 25, 'https://example.com/cover7.jpg', 'BIOGRAPHY', 3),
(NULL, 'My Journey', '2020-08-20', 'A memoir of overcoming adversity.', true, 20.50, 28, 'https://example.com/cover8.jpg', 'BIOGRAPHY', 4),

-- MYSTERY
(NULL, 'The Locked Room', '2022-01-04', 'A puzzling murder with no escape.', false, 17.80, 40, 'https://example.com/cover9.jpg', 'MYSTERY', 5),
(NULL, 'Secrets in the Fog', '2023-05-11', 'Detective unravels a case in a sleepy town.', true, 19.90, 32, 'https://example.com/cover10.jpg', 'MYSTERY', 1),

-- ROMANCE
(NULL, 'A Summer in Paris', '2019-06-06', 'Two hearts meet in the city of love.', true, 16.75, 45, 'https://example.com/cover11.jpg', 'ROMANCE', 2),
(NULL, 'Letters Unsent', '2020-12-18', 'Love letters that change everything.', false, 14.60, 27, 'https://example.com/cover12.jpg', 'ROMANCE', 3),

-- THRILLER
(NULL, 'Under Surveillance', '2021-10-25', 'A spy hunted by his own agency.', true, 24.50, 33, 'https://example.com/cover13.jpg', 'THRILLER', 4),
(NULL, 'The Final Password', '2023-02-28', 'Cyber thriller on the edge of global chaos.', false, 23.00, 38, 'https://example.com/cover14.jpg', 'THRILLER', 5),

-- HEALTH
(NULL, 'The Mind-Body Code', '2017-07-30', 'Healing through holistic methods.', true, 21.10, 30, 'https://example.com/cover15.jpg', 'HEALTH', 1),
(NULL, 'Fit for Life', '2022-11-14', 'Nutrition and routines for a better you.', false, 18.40, 36, 'https://example.com/cover16.jpg', 'HEALTH', 2),

-- ANIME
(NULL, 'The Manga Artist''s Handbook', '2016-04-12', 'Techniques for drawing characters and scenes.', false, 26.70, 20, 'https://example.com/cover17.jpg', 'ANIME', 3),
(NULL, 'Anime Worlds', '2021-01-01', 'A tour of influential anime series.', true, 29.99, 22, 'https://example.com/cover18.jpg', 'ANIME', 4);


-- UPDATE isbn for each inserted book
UPDATE book SET isbn = '978-84-376-1583-1' WHERE id = 1;
UPDATE book SET isbn = '978-84-376-2931-2' WHERE id = 2;
UPDATE book SET isbn = '978-84-376-0378-3' WHERE id = 3;
UPDATE book SET isbn = '978-84-376-8425-4' WHERE id = 4;
UPDATE book SET isbn = '978-84-376-6249-5' WHERE id = 5;
UPDATE book SET isbn = '978-84-376-9002-6' WHERE id = 6;
UPDATE book SET isbn = '978-84-376-4418-7' WHERE id = 7;
UPDATE book SET isbn = '978-84-376-3127-8' WHERE id = 8;
UPDATE book SET isbn = '978-84-376-7194-9' WHERE id = 9;
UPDATE book SET isbn = '978-84-376-1075-10' WHERE id = 10;
UPDATE book SET isbn = '978-84-376-2281-11' WHERE id = 11;
UPDATE book SET isbn = '978-84-376-5033-12' WHERE id = 12;
UPDATE book SET isbn = '978-84-376-6644-13' WHERE id = 13;
UPDATE book SET isbn = '978-84-376-7920-14' WHERE id = 14;
UPDATE book SET isbn = '978-84-376-0588-15' WHERE id = 15;
UPDATE book SET isbn = '978-84-376-3167-16' WHERE id = 16;
UPDATE book SET isbn = '978-84-376-1902-17' WHERE id = 17;
UPDATE book SET isbn = '978-84-376-4810-18' WHERE id = 18;


-- Asignación de autores por libro (2 o 3 por libro)

-- Book 1
INSERT INTO book_author (book_id, author_id) VALUES (1, 1), (1, 2);

-- Book 2
INSERT INTO book_author (book_id, author_id) VALUES (2, 3), (2, 4), (2, 5);

-- Book 3
INSERT INTO book_author (book_id, author_id) VALUES (3, 6), (3, 7);

-- Book 4
INSERT INTO book_author (book_id, author_id) VALUES (4, 8), (4, 9), (4, 10);

-- Book 5
INSERT INTO book_author (book_id, author_id) VALUES (5, 11), (5, 12);

-- Book 6
INSERT INTO book_author (book_id, author_id) VALUES (6, 13), (6, 14), (6, 15);

-- Book 7
INSERT INTO book_author (book_id, author_id) VALUES (7, 16), (7, 17);

-- Book 8
INSERT INTO book_author (book_id, author_id) VALUES (8, 18), (8, 19), (8, 20);

-- Book 9
INSERT INTO book_author (book_id, author_id) VALUES (9, 1), (9, 3);

-- Book 10
INSERT INTO book_author (book_id, author_id) VALUES (10, 4), (10, 5), (10, 6);

-- Book 11
INSERT INTO book_author (book_id, author_id) VALUES (11, 7), (11, 8);

-- Book 12
INSERT INTO book_author (book_id, author_id) VALUES (12, 9), (12, 10), (12, 11);

-- Book 13
INSERT INTO book_author (book_id, author_id) VALUES (13, 12), (13, 13);

-- Book 14
INSERT INTO book_author (book_id, author_id) VALUES (14, 14), (14, 15), (14, 16);

-- Book 15
INSERT INTO book_author (book_id, author_id) VALUES (15, 17), (15, 18);

-- Book 16
INSERT INTO book_author (book_id, author_id) VALUES (16, 19), (16, 20), (16, 2);

-- Book 17
INSERT INTO book_author (book_id, author_id) VALUES (17, 3), (17, 6);

-- Book 18
INSERT INTO book_author (book_id, author_id) VALUES (18, 7), (18, 10), (18, 13);


+4

FICTION

-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'Echoes of the Past', '2023-07-21', 'A tale of memories that refuse to fade.', false, 17.95, 40, 'https://example.com/cover19.jpg', 'FICTION', 3),
(NULL, 'Crossroads', '2022-11-02', 'Two lives intersect in unexpected ways.', true, 20.30, 34, 'https://example.com/cover20.jpg', 'FICTION', 4),
(NULL, 'The Invisible Thread', '2021-04-14', 'A story of connection across space and time.', false, 18.80, 27, 'https://example.com/cover21.jpg', 'FICTION', 5),
(NULL, 'Between the Lines', '2020-01-25', 'Truth and fiction blur in this novel within a novel.', true, 21.40, 31, 'https://example.com/cover22.jpg', 'FICTION', 1);

-- ISBN
UPDATE book SET isbn = '978-84-376-1970-19' WHERE id = 19;
UPDATE book SET isbn = '978-84-376-2304-20' WHERE id = 20;
UPDATE book SET isbn = '978-84-376-3421-21' WHERE id = 21;
UPDATE book SET isbn = '978-84-376-4644-22' WHERE id = 22;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(19, 4), (19, 5),
(20, 6), (20, 8), (20, 9),
(21, 10), (21, 11),
(22, 12), (22, 13), (22, 14);


HISTORY
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'Rise and Fall of Nations', '2021-08-30', 'Examines pivotal moments in world history.', true, 24.99, 38, 'https://example.com/cover23.jpg', 'HISTORY', 2),
(NULL, 'Revolutionary Minds', '2020-12-10', 'Biographies of history''s great thinkers.', false, 22.60, 29, 'https://example.com/cover24.jpg', 'HISTORY', 3),
(NULL, 'Chronicles of War', '2019-05-04', 'Strategies and impacts of major wars.', false, 26.40, 22, 'https://example.com/cover25.jpg', 'HISTORY', 4),
(NULL, 'Echoes from the Past', '2023-01-19', 'Historical narratives of forgotten civilizations.', true, 28.50, 26, 'https://example.com/cover26.jpg', 'HISTORY', 5);

-- ISBN
UPDATE book SET isbn = '978-84-376-5723-23' WHERE id = 23;
UPDATE book SET isbn = '978-84-376-6850-24' WHERE id = 24;
UPDATE book SET isbn = '978-84-376-7211-25' WHERE id = 25;
UPDATE book SET isbn = '978-84-376-8392-26' WHERE id = 26;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(23, 15), (23, 16),
(24, 17), (24, 18), (24, 1),
(25, 2), (25, 3),
(26, 4), (26, 5), (26, 6);



--FANTASY
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'The Crystal Gate', '2023-06-12', 'A portal opens to a world of mythical beasts.', true, 26.90, 44, 'https://example.com/cover27.jpg', 'FANTASY', 1),
(NULL, 'Shadowspell', '2022-09-07', 'Dark magic threatens the fate of kingdoms.', false, 23.75, 39, 'https://example.com/cover28.jpg', 'FANTASY', 2),
(NULL, 'The Last Oracle', '2020-03-18', 'A prophecy awakens a forgotten hero.', true, 25.10, 41, 'https://example.com/cover29.jpg', 'FANTASY', 3),
(NULL, 'Moonborn', '2021-12-01', 'A werewolf legacy hidden in plain sight.', false, 24.60, 35, 'https://example.com/cover30.jpg', 'FANTASY', 4);

-- ISBN
UPDATE book SET isbn = '978-84-376-9517-27' WHERE id = 27;
UPDATE book SET isbn = '978-84-376-0683-28' WHERE id = 28;
UPDATE book SET isbn = '978-84-376-1802-29' WHERE id = 29;
UPDATE book SET isbn = '978-84-376-2976-30' WHERE id = 30;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(27, 7), (27, 9), (27, 10),
(28, 11), (28, 13),
(29, 14), (29, 15), (29, 16),
(30, 17), (30, 18);


--BIOGRAPHY
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'In Her Words', '2019-04-03', 'The life of a feminist icon told through letters.', false, 20.90, 28, 'https://example.com/cover31.jpg', 'BIOGRAPHY', 2),
(NULL, 'Against All Odds', '2021-10-22', 'The rise of a world leader from poverty.', true, 22.99, 30, 'https://example.com/cover32.jpg', 'BIOGRAPHY', 3),
(NULL, 'The Inventor''s Mind', '2020-07-05', 'Behind the genius of a misunderstood creator.', false, 19.80, 25, 'https://example.com/cover33.jpg', 'BIOGRAPHY', 4),
(NULL, 'Living Free', '2023-02-17', 'A story of rebellion, identity, and acceptance.', true, 21.70, 33, 'https://example.com/cover34.jpg', 'BIOGRAPHY', 5);

-- ISBN
UPDATE book SET isbn = '978-84-376-3194-31' WHERE id = 31;
UPDATE book SET isbn = '978-84-376-4345-32' WHERE id = 32;
UPDATE book SET isbn = '978-84-376-5526-33' WHERE id = 33;
UPDATE book SET isbn = '978-84-376-6897-34' WHERE id = 34;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(31, 19), (31, 1),
(32, 2), (32, 3), (32, 4),
(33, 5), (33, 6),
(34, 7), (34, 8), (34, 9);



--MISTERY
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'The Silent Witness', '2023-05-18', 'An object holds the key to solving a murder.', false, 18.90, 37, 'https://example.com/cover35.jpg', 'MYSTERY', 1),
(NULL, 'Midnight Caller', '2022-08-29', 'A detective receives anonymous tips from the killer.', true, 21.20, 29, 'https://example.com/cover36.jpg', 'MYSTERY', 2),
(NULL, 'The Forgotten File', '2021-03-10', 'A cold case reopened by chance.', false, 19.60, 34, 'https://example.com/cover37.jpg', 'MYSTERY', 3),
(NULL, 'Vanished', '2020-12-07', 'A girl disappears from a locked house.', true, 22.50, 30, 'https://example.com/cover38.jpg', 'MYSTERY', 4);

-- ISBN
UPDATE book SET isbn = '978-84-376-7101-35' WHERE id = 35;
UPDATE book SET isbn = '978-84-376-8202-36' WHERE id = 36;
UPDATE book SET isbn = '978-84-376-9313-37' WHERE id = 37;
UPDATE book SET isbn = '978-84-376-0424-38' WHERE id = 38;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(35, 10), (35, 11),
(36, 12), (36, 13), (36, 14),
(37, 15), (37, 16),
(38, 17), (38, 18), (38, 19);


--ROMANCE
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'When Hearts Collide', '2023-06-23', 'Love finds a way through chaos.', true, 17.99, 43, 'https://example.com/cover39.jpg', 'ROMANCE', 2),
(NULL, 'Second Chances', '2021-01-19', 'A couple reconnects after a decade apart.', false, 16.50, 31, 'https://example.com/cover40.jpg', 'ROMANCE', 3),
(NULL, 'The Wedding Pact', '2022-04-05', 'A fake engagement that turns real.', true, 18.25, 36, 'https://example.com/cover41.jpg', 'ROMANCE', 4),
(NULL, 'Hearts in Havana', '2020-11-28', 'Romance blooms under the Caribbean sun.', false, 15.80, 28, 'https://example.com/cover42.jpg', 'ROMANCE', 5);

-- ISBN
UPDATE book SET isbn = '978-84-376-1535-39' WHERE id = 39;
UPDATE book SET isbn = '978-84-376-2646-40' WHERE id = 40;
UPDATE book SET isbn = '978-84-376-3757-41' WHERE id = 41;
UPDATE book SET isbn = '978-84-376-4868-42' WHERE id = 42;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(39, 20), (39, 1),
(40, 2), (40, 3),
(41, 4), (41, 5), (41, 6),
(42, 7), (42, 8);


--THRILLER
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'Encrypted', '2023-09-01', 'A hacker uncovers a global conspiracy.', true, 24.75, 38, 'https://example.com/cover43.jpg', 'THRILLER', 1),
(NULL, 'Man in the Mirror', '2022-02-27', 'A killer assumes his victim’s identity.', false, 22.30, 27, 'https://example.com/cover44.jpg', 'THRILLER', 2),
(NULL, 'Dead Air', '2020-06-15', 'A live radio broadcast reveals a crime.', true, 23.40, 33, 'https://example.com/cover45.jpg', 'THRILLER', 3),
(NULL, 'The Black Box', '2021-08-11', 'An airplane disaster hides government secrets.', false, 25.10, 36, 'https://example.com/cover46.jpg', 'THRILLER', 4);

-- ISBN
UPDATE book SET isbn = '978-84-376-5979-43' WHERE id = 43;
UPDATE book SET isbn = '978-84-376-7080-44' WHERE id = 44;
UPDATE book SET isbn = '978-84-376-8191-45' WHERE id = 45;
UPDATE book SET isbn = '978-84-376-9302-46' WHERE id = 46;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(43, 9), (43, 10), (43, 11),
(44, 12), (44, 13),
(45, 14), (45, 15), (45, 16),
(46, 17), (46, 18);


--HEALTH
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'Strong at Any Age', '2023-03-20', 'Fitness strategies for all stages of life.', true, 20.10, 28, 'https://example.com/cover47.jpg', 'HEALTH', 5),
(NULL, 'Mindful Nutrition', '2022-07-09', 'Conscious eating for well-being.', false, 19.90, 32, 'https://example.com/cover48.jpg', 'HEALTH', 1),
(NULL, 'Sleep Science', '2021-05-14', 'Understanding the power of rest.', false, 21.60, 30, 'https://example.com/cover49.jpg', 'HEALTH', 2),
(NULL, 'Mental Clarity', '2020-10-06', 'Meditation and focus in a distracted world.', true, 22.40, 33, 'https://example.com/cover50.jpg', 'HEALTH', 3);

-- ISBN
UPDATE book SET isbn = '978-84-376-0413-47' WHERE id = 47;
UPDATE book SET isbn = '978-84-376-1524-48' WHERE id = 48;
UPDATE book SET isbn = '978-84-376-2635-49' WHERE id = 49;
UPDATE book SET isbn = '978-84-376-3746-50' WHERE id = 50;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(47, 19), (47, 20),
(48, 1), (48, 2), (48, 3),
(49, 4), (49, 5),
(50, 6), (50, 7), (50, 8);

--ANIME
-- INSERT
INSERT INTO book (isbn, title, date_publication, description, best_sellers, price, stock, coverURL, category_name, editorial_id)
VALUES
(NULL, 'Anime Aesthetics', '2021-06-18', 'Exploring visual style in Japanese animation.', true, 27.10, 21, 'https://example.com/cover51.jpg', 'ANIME', 4),
(NULL, 'Otaku Culture', '2020-08-27', 'A study of fandom and identity.', false, 23.30, 25, 'https://example.com/cover52.jpg', 'ANIME', 5),
(NULL, 'Beyond the Frame', '2022-12-13', 'How anime narratives shape culture.', true, 28.40, 29, 'https://example.com/cover53.jpg', 'ANIME', 1),
(NULL, 'Mecha Revolution', '2023-07-01', 'History of robots in anime.', false, 26.50, 24, 'https://example.com/cover54.jpg', 'ANIME', 2);

-- ISBN
UPDATE book SET isbn = '978-84-376-4857-51' WHERE id = 51;
UPDATE book SET isbn = '978-84-376-5968-52' WHERE id = 52;
UPDATE book SET isbn = '978-84-376-7079-53' WHERE id = 53;
UPDATE book SET isbn = '978-84-376-8190-54' WHERE id = 54;

-- book_author
INSERT INTO book_author (book_id, author_id) VALUES
(51, 9), (51, 10), (51, 11),
(52, 12), (52, 13),
(53, 14), (53, 15), (53, 16),
(54, 17), (54, 18);


--FACTURA E ITEMS

INSERT INTO invoice (iva, subtotal, total, created_at, customer_id, number_invoice)
VALUES (4.80, 32.00, 36.80, '2024-01-15 09:30:00.123456', 2, 'INV-1001');

INSERT INTO invoice_item_detail (quantity, subtotal, book_id, invoice_id)
VALUES
(2, 20.00, 1, CURRVAL('invoice_id_seq')),
(1, 12.00, 3, CURRVAL('invoice_id_seq'));


INSERT INTO invoice (iva, subtotal, total, created_at, customer_id, number_invoice)
VALUES (13.50, 90.00, 103.50, '2024-04-10 14:45:00.654321', 4, 'INV-1002');

INSERT INTO invoice_item_detail (quantity, subtotal, book_id, invoice_id)
VALUES
(3, 60.00, 5, CURRVAL('invoice_id_seq')),
(2, 30.00, 2, CURRVAL('invoice_id_seq'));


INSERT INTO invoice (iva, subtotal, total, created_at, customer_id, number_invoice)
VALUES (13.65, 91.00, 104.65, '2024-07-05 10:20:00.789012', 6, 'INV-1003');

INSERT INTO invoice_item_detail (quantity, subtotal, book_id, invoice_id)
VALUES
(2, 36.00, 4, CURRVAL('invoice_id_seq')),
(1, 30.00, 7, CURRVAL('invoice_id_seq')),
(1, 25.00, 6, CURRVAL('invoice_id_seq'));


INSERT INTO invoice (iva, subtotal, total, created_at, customer_id, number_invoice)
VALUES (8.63, 57.50, 66.13, '2024-10-28 13:00:00.456789', 8, 'INV-1004');

INSERT INTO invoice_item_detail (quantity, subtotal, book_id, invoice_id)
VALUES
(1, 22.50, 8, CURRVAL('invoice_id_seq')),
(2, 35.00, 9, CURRVAL('invoice_id_seq'));


INSERT INTO invoice (iva, subtotal, total, created_at, customer_id, number_invoice)
VALUES (6.00, 40.00, 46.00, '2024-12-20 17:40:00.987654', 3, 'INV-1005');

INSERT INTO invoice_item_detail (quantity, subtotal, book_id, invoice_id)
VALUES
(1, 15.00, 2, CURRVAL('invoice_id_seq')),
(1, 25.00, 6, CURRVAL('invoice_id_seq'));


INSERT INTO invoice (iva, subtotal, total, created_at, customer_id, number_invoice)
VALUES (8.25, 55.00, 63.25, '2025-01-08 11:00:00.112233', 7, 'INV-1006');

INSERT INTO invoice_item_detail (quantity, subtotal, book_id, invoice_id)
VALUES
(1, 20.00, 5, CURRVAL('invoice_id_seq')),
(1, 35.00, 10, CURRVAL('invoice_id_seq'));


INSERT INTO invoice (iva, subtotal, total, created_at, customer_id, number_invoice)
VALUES (8.40, 56.00, 64.40, '2025-02-19 08:30:00.334455', 9, 'INV-1007');

INSERT INTO invoice_item_detail (quantity, subtotal, book_id, invoice_id)
VALUES
(2, 20.00, 1, CURRVAL('invoice_id_seq')),
(3, 36.00, 3, CURRVAL('invoice_id_seq'));






