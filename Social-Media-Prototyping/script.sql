-- we want to see everyone that a particular user is following
SELECT U.username AS "follower", U2.username AS "following"
FROM users U
JOIN follower_junction J ON U.user_id = J.user_who_is_doing_the_following_of_someone_else
JOIN users U2 ON J.this_user_is_following_the_listed_id = U2.user_id
WHERE U.username = 'kplummer'


-- we want to see everyone that follows a particular user
SELECT U.username AS "follower", U2.username AS "following"
FROM users U
JOIN follower_junction J ON U.user_id = J.this_user_is_following_the_listed_id
JOIN users U2 ON J.user_who_is_doing_the_following_of_someone_else = U2.user_id
WHERE U2.username = 'kplummer'
