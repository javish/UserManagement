package com.user.service;

import com.user.model.User;
import com.user.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(ObjectId userId) {

        User user = userRepository.findBy_id(userId);
        return user;
    }

    @Override
    public List<User> getAllUsersList(){
        List<User> users = userRepository.findAll();
        return users;
    };

    @Override
    public User addUser(User user){
        return userRepository.save(user);
    }
}
