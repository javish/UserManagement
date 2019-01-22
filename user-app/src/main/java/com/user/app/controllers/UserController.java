package com.user.app.controllers;


import com.user.model.User;
import com.user.repositories.UserRepository;
import com.user.service.UserService;
import io.swagger.annotations.*;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@Api(value="User Rest API", description = "Operation with Users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public void signUp(@RequestBody User user){

    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value="Returns all users")
    public List<User> getAllUsers(){
        return userService.getAllUsersList();
    }

    @RequestMapping(value = "/{Id}", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value="Returns user by ID")
    public User getUserById(@ApiParam(value="User Id", required=true) @PathVariable("Id") ObjectId userId){
        return userService.getUserById(userId);
    }
}
