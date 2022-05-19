package com.talerico.dndCreate.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document
@Data
public class User {

    @Id
    String id;

    @Indexed(unique = true)
    String username;
    String password;
    List<Character> characters;

    @Indexed(unique = true)
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}



