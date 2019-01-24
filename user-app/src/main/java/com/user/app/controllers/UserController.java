package com.user.app.controllers;


import com.user.model.User;
import com.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@Api(value="User Rest API", description = "Operation with Users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Creates new user")
    public void signUp(@ApiParam(value = "Json body with a user", required = true)
            @RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value="Returns all users")
    public List<User> getAllUsers(){
        return userService.getAllUsersList();
    }

    @RequestMapping(value = "/{email}", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value="Returns user by Email ID")
    public User getUserById(@ApiParam(value="User Email", required=true) @PathVariable("email") String email){
        return userService.getUserByEmail(email);
    }
}
