package com.revature.bcryptdemo.beans;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.revature.bcryptdemo.dtos.AuthDto;
import com.revature.bcryptdemo.models.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MyService {
    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public User registerAuth(User user) {
        user.setPassword(BCrypt.withDefaults().hashToString(12, user.getPassword().toCharArray()));
        return this.myRepository.save(user);
    }

    public boolean login(AuthDto authDto) {
        String hashedPassword = this.myRepository.getUserByUsername(authDto.getUsername()).getPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(authDto.getPassword().toCharArray(), hashedPassword);
        return result.verified;
    }

}
