DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS users;

drop view name_view

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

insert into encrypted_passwords (username, encrypted_password)
VALUES('kplummer', 'lsdkafjgndlskfgjnsdldfglksdjfng');


select * from users;
select * from tasks; 


INSERT INTO tasks (title, description, completed, user_id) VALUES ('Register my vehicle', 'I need new NY state plates and I need to get an inspection.', false, 3);
INSERT INTO users (first_name, last_name, username, password) VALUES ('asdf', 'asdf', 'asdf', 'password');
INSERT INTO users (first_name, last_name, username, password) VALUES ('Nileema', 'Shah', 'nshah', 'password');


SELECT * 
FROM users U
FULL OUTER JOIN tasks T ON T.user_id = U.user_id



DELETE FROM users WHERE user_id = 3;









ALTER TABLE users ALTER COLUMN password SET NOT NULL;
ALTER TABLE users ALTER COLUMN user_id SET DATA TYPE SERIAL;


CREATE TABLE tasks (
	task_id SERIAL PRIMARY KEY,
	title VARCHAR(40),
	description VARCHAR(8000),
	completed BOOLEAN
);






