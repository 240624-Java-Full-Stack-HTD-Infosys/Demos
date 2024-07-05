/*
 * 1NF - all data in any column should be atomic, that is it can't be split
 * and you must have a primary key
 * For instance if we had first and last name in single column
 * "Kyle Plummer" This should be two columns, first and last name.
 * 
 * 
 * 2NF - Already adhere to 1NF, and no data in any column should be dependent 
 * on part of the key, no key columns should depend on data in the rest of the table
 *   first name | last name PK | "salutation"
     Kyle | Plummer | mr plummer
     
     3NF - This one is about transitive dependencies, you shouldn't have columns which
     are depenedent on columns which are dependent
 */


/*
 * Constraints:
 * NOT NULL
 * UNIQUE
 * FOREIGN KEY
 * DEFAULT - This column has a default value, instead of NULL it will use the default
 * CHECK - validation
 * 
 */

CREATE TABLE myTable (
	birthday DATE,
	"name" VARCHAR(200) CHECK(LENGTH("name") > 2)
);

insert into myTable VALUES ('2024-07-05', 'abc');

select * from myTable








