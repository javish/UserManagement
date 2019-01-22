package com.user.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
public class User {

    @Id
    private ObjectId _id;

    private String name;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String salt;

    public User(){}

    public User (String name, String email, String password, String salt){
        this.name = name;
        this.email = email;
        this.password = password;
        this.salt = salt;
    }
}
