/*
 * DQL
 * 
 */
SELECT * 
FROM users
ORDER BY user_id DESC



/*
 * DML
 */
INSERT INTO "users" (first_name, last_name, username, password) VALUES ('Kyle', 'Plummer', 'kplummer', 'password1');
INSERT INTO "users" (first_name, last_name, username, password) VALUES ('Nileema', 'Shah', 'nshah', 'password1');
INSERT INTO "users" (first_name, last_name, username, password) VALUES ('Sarina', 'W', 'sw', 'password1');
INSERT INTO "users" (user_id, first_name, last_name, username, password) VALUES (99, 'Brittany', 'Moliver', 'bmoliver', 'password1');
INSERT INTO "users" (first_name, last_name, username, password) VALUES ('Zachary', 'Kocienda', 'zkocienda', 'password1');
INSERT INTO "users" (user_id, first_name, last_name, username, password) VALUES (6, 'Aakaash', 'Hemdev', 'ahemdev', 'password1');
INSERT INTO "users" (first_name, last_name, username, password) VALUES ('Alden', 'Dus', 'adus', 'password1');


UPDATE users SET password = 'password123' WHERE first_name = 'Wiyat';
UPDATE users SET user_id = 2 WHERE user_id = 99;

DELETE FROM users WHERE user_id = 1;


/*
 * DCL
*/
CREATE USER ahemdev WITH PASSWORD 'password';

ALTER USER testuser WITH PASSWORD 'newpass';

