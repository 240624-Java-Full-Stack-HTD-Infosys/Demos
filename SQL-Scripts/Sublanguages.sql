/*
 * DQL - Data Query Language
 * This is the READ part of CRUD, starts with the SELECT keyword and queries one or more
 * tables for a result set
 * 
 */
SELECT * 
FROM users
ORDER BY user_id DESC



/*
 * DML - Data Manipulation Language
 * This is the C U and D parts of CRUD, create, update, delete.
 * This is how we insert, update, and delete data in the database. All the functionality that has to do
 * with writing data, that is, operations which result in the database state changing.
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
 * DCL - Data Control Language
 * This is how we manage users and permissions. We can create and alter users and groups.
*/
CREATE USER ahemdev WITH PASSWORD 'password';

ALTER USER testuser WITH PASSWORD 'newpass';




/*
 * DDL - Data Definition Language
 * This is the part of SQL that deals with designing the schema, the shape of the data. Tables, 
 * constraints, keys, stored procedures, etc. are all DDL. Basically everything other than modifying
 * the data. CRUD DML, and DQL are about data, DDL is about schema.
 */

DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS users;

--let's build a one-to-many multiplicity between users and tasks
CREATE TABLE IF NOT EXISTS users (
	user_id SERIAL PRIMARY KEY,
	first_name VARCHAR(40),
	last_name CHAR(40),
	username VARCHAR(40) UNIQUE,
	password VARCHAR(40) NOT NULL
);

CREATE UNIQUE INDEX users_username ON users (username);

CREATE TABLE tasks (
	task_id SERIAL PRIMARY KEY,
	title VARCHAR(240),
	description VARCHAR(8000),
	completed BOOLEAN,
	user_id INTEGER,
	CONSTRAINT fk_tasks_users FOREIGN KEY (user_id) REFERENCES users (user_id)
);


CREATE TABLE encrypted_passwords (
	id SERIAL PRIMARY KEY,
	username VARCHAR(40),
	encrypted_password VARCHAR(40),
	CONSTRAINT fk_encrypted_passwords_users FOREIGN KEY (username) REFERENCES users (username)
);



/*
 * TCL - Transaction Control Language
 * This sublanguage is all about transactions, units of work on the database. We know
 * db operations should be ACID, atomic, consistent, isolated, and durable. Transactions are part of
 * how we do this, especially atomicity and consistency.
*/
BEGIN TRANSACTION
	
	UPDATE users U
	SET U.last_name = 'Smith'
	WHERE U.last_name LIKE 'Pl%'
	
	SAVEPOINT A
	
	UPDATE Tasks T
	SET T.user_id = (
		SELECT DISTINCT user_id 
		FROM users 
		WHERE username = 'smith'
	)
	
COMMIT TRANSACTION















