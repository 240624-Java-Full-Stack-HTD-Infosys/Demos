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

--self join
SELECT *
FROM users U
JOIN users U2 ON U.password = U2.password

--natural join
SELECT *
FROM tasks T
NATURAL JOIN users U
