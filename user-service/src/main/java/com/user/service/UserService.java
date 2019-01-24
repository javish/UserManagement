package com.user.service;

import com.user.model.User;
import org.bson.types.ObjectId;

import java.util.List;

public interface UserService {

    /**
     * Method to get user by email
     * @param email
     * @return
     */
    public User getUserByEmail(String email);

    public List<User> getAllUsersList();

    /**
     * Method to add user
     * @return
     */
    public User addUser(User user);

    public User addDefaultUser(User user);
}
