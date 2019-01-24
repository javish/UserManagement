package com.user;

import com.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication{

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args){
        SpringApplication.run(UserApplication.class, args);
    }

}
