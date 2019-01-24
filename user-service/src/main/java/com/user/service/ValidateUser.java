package com.user.service;

import com.user.model.User;

public interface ValidateUser{

    public boolean isValidUser(User user);

    default void show(){
        System.out.println("You are running default method");
    }

    static void display(){
        System.out.println("You are runnin static method");
    }
}
