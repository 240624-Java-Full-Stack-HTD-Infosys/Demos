package com.revature.config;

import com.revature.models.Berry;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//a config class uses the factory design pattern
public class BerryConfig {


    @Bean("myBerry")//this is the factory method design pattern
    public Berry berry() {
        //we write the code which creates berries
        return new Berry("Strawberry", "Sweet and sour taste");
    }
}
