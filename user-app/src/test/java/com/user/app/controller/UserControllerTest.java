package com.user.app.controller;

import com.user.app.controllers.UserController;
import com.user.model.User;
import com.user.service.UserService;
import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.verify;
import static org.easymock.EasyMock.replay;

import java.util.Collections;
import java.util.List;

@RunWith(EasyMockRunner.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @TestSubject
    private UserController userController = new UserController();

    @Test
    public void testGetAllUsers(){
        User user = new User("jenny","jen@jen.com","123",null);
        List<User> users = Collections.singletonList(user);

        expect(userService.getAllUsersList()).andReturn(users);
        replay(userService);

        List<User> result = userController.getAllUsers();
        verify(userService);
        Assert.assertNotNull(result);
        Assert.assertEquals(users, result);
    }
}
