/*
SQL databases have many built in functions, each is one of two types:
Aggregate Functions - functions which take in many rows but return only one value
Scalar Functions - for every input there is an output, 1-to-1. This transforms the input in some way
*/

--Scalar functions
SELECT(UPPER(first_name))
FROM users;

SELECT(LOWER(first_name))
FROM users;

SELECT(SUBSTRING(last_name, 2, 4))
FROM users;


--aggregate functions
SELECT COUNT(*)
FROM tasks;

SELECT(SUM(user_id)) 
FROM tasks;

SELECT(MIN(task_id))
FROM tasks;

SELECT(MAX(task_id))
FROM tasks;

SELECT(AVG(task_id))
FROM tasks;



--Aggregating in queries
SELECT U.first_name, COUNT(T.user_id) AS number_of_tasks
FROM tasks T
JOIN users U ON T.user_id = U.user_id 
GROUP BY U.first_name
ORDER BY number_of_tasks ASC
WHERE last_name LIKE 'H%'



SELECT last_name
FROM users 
GROUP BY last_name


SELECT DISTINCT last_name 
FROM users
