package com.revature.springdatademo.services;

import com.revature.springdatademo.models.User;
import com.revature.springdatademo.repos.TaskRepository;
import com.revature.springdatademo.repos.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
public class MyService {
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public MyService(UserRepository userRepository, TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public User getUserByUsernameWithAllTasks(String username) {
        User user = userRepository.findByUsername(username);
        user.getTasks().get(0).toString();
        //System.out.println(user);
        return user;
    }
}
