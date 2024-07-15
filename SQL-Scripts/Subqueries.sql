SELECT * 
FROM users 
WHERE user_id IN (
	SELECT user_id
	FROM tasks
)


SELECT * 
FROM users 
WHERE last_name LIKE CONCAT('Plu', '%')


INSERT INTO tasks (title, description, completed, user_id)
VALUES ('week 2 training survey', 'Fill out the survey and give kyle 5 stars!', false, 2);

select * from tasks