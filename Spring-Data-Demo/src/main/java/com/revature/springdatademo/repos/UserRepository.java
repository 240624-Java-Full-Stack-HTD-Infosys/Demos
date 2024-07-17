package com.revature.springdatademo.repos;

import com.revature.springdatademo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    /*
    save()
    saveAll()
    find()
     */

    //User findByUsername(String username);

}
