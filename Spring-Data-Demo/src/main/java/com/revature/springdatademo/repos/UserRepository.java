package com.revature.springdatademo.repos;

import com.revature.springdatademo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    //freebie methods
    /*
    save()
    saveAll()
    find()
    findAll()
    etc...
     */

    //Named queries
    User findByUsername(String username);

    //Native Query
    @Query(value = "SELECT * FROM users WHERE first_name = 'Kyle'", nativeQuery = true)
    Set<User> getAllKyles();

    @Query(value = "SELECT * FROM users WHERE first_name = ?1 AND last_name = ?2", nativeQuery = true)
    User getUserByNames(String firstName, String lastName);

    //TODO: HQL? How to tell? I see these syntaxes used interchangeably. Maybe published info is wrong.
    @Query(value = "SELECT u FROM users u WHERE u.username = :username")
    //This is expecting HQL if native = false, and JPQL is valid HQL, but not vice versa.
    User testJpql(String username);


    //HQL Query

    //Criteria


}
