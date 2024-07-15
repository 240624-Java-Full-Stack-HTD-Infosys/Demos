/*
 * Types of JOIN:
 * LEFT
 * RIGHT
 * INNER
 * FULL OUTER
 * 
 * Self - join a table to itself

 * Equi - equi join is what we have been doing, where a value is in a 
 *        row in both tables, linking those rows
 * Theta - the opposite of above, doing a join where the ON is not based on equality, !=, < > 
 * Natural
*/

--Inner join - only shows records in the result set where the join criteria is met. If there is no
--match for the ON condition, that result is absent from the results
SELECT * 
FROM users U
INNER JOIN tasks T ON U.user_id = T.user_id 


--FULL OUTER JOIN - This will show all results included from both tables, if there are results
--in one table which don't have a matching record in the other table, NULL values will be present
--in the result set.
-- In general OUTER doesn't do much any more, it is not commonly implemented in most databases. You
-- may still need to include the keyword, but there is little if any difference between "FULL OUTER JOIN"
-- and FULL JOIN
SELECT * 
FROM users U
FULL OUTER JOIN tasks T ON U.user_id = T.user_id 


--LEFT JOIN - This join will show all the results from the left table, and only include
-- the results from the right table if they match the ON condition.
-- Left and right here refer to the table which was already included in the result set, and the 
-- table being joined, it has nothing to do with what appears on which side of the equal sign
-- in both examples below, users is the left table and tasks is the right.
SELECT *
FROM users U
LEFT JOIN tasks T ON U.user_id = T.task_id 

SELECT *
FROM users U
LEFT JOIN tasks T ON T.task_id = U.user_id --the order in the ON line makes no difference


/*
 * RIGHT JOIN - Like left join, but in reverse. All data from the newly joined table will be shown, 
 * while only matching data from the left table (the one we were already including in our query)
 * In both examples below users is the left table, and tasks is the right.
 */
SELECT *
FROM users U
RIGHT JOIN tasks T ON U.user_id = T.task_id 

SELECT *
FROM users U
RIGHT JOIN tasks T ON T.task_id = U.user_id --the order in the ON line makes no difference


/*
 * These have all been examples of "Equi-joins" joins on equality. We can also do joins on non-equality,
 * known as "theta joins"
 */
SELECT *
FROM users U
JOIN tasks T ON U.user_id != T.task_id;


--self join
SELECT *
FROM users U
JOIN users U2 ON U.password = U2.password

--natural join
SELECT *
FROM tasks T
NATURAL JOIN users U
