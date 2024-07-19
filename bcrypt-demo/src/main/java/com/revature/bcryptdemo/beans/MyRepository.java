package com.revature.bcryptdemo.beans;

import com.revature.bcryptdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MyRepository extends JpaRepository<User, UUID> {
    User getUserByUsername(String username);
}
