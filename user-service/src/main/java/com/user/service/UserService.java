package com.user.service;

import com.user.model.User;
import org.bson.types.ObjectId;

import java.util.List;

public interface UserService {

    /**
     * Method to get user by id
     * @param userId
     * @return
     */
    public User getUserById(ObjectId userId);

    public List<User> getAllUsersList();

    /**
     * Method to add user
     * @return
     */
    public User addUser(User user);
}
