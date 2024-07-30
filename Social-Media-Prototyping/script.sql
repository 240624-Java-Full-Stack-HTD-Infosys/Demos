-- we want to see everyone that a particular user is following
SELECT U.username AS "user", U2.username AS "following"
FROM users U
JOIN follower_junction J ON U.user_id = J.user_who_is_doing_the_following_of_someone_else
JOIN users U2 ON J.this_user_is_following_the_listed_id = U2.user_id
WHERE U.username = 'waiyat'


-- we want to see everyone that follows a particular user
SELECT U2.username AS "user", U.username AS "following"
FROM users U
JOIN follower_junction J ON U.user_id = J.this_user_is_following_the_listed_id
JOIN users U2 ON J.user_who_is_doing_the_following_of_someone_else = U2.user_id
WHERE U.username = 'waiyat'
