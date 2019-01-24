package com.user.service;

import com.user.model.User;
import com.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByEmail(String email){

        User user = userRepository.findByEmail(email);
        return user;
    }

    @Override
    public List<User> getAllUsersList(){
        List<User> users = userRepository.findAll();
        return users;
    };

    @Override
    public User addUser(User user){
        ValidateUser v = usr -> !usr.getEmail().isEmpty();
        if(v.isValidUser(user)){
            user = userRepository.save(user);
        };
        return user;
    }

    @Override
    public User addDefaultUser(@DefaultUser(name= "alison", email="al@wh.com", password="123") User user){
        return userRepository.save(user);
    }
}
