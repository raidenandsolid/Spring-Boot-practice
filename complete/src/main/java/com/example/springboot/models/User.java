package com.example.springboot.models;


import lombok.Data;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * A user entity. We'll use this later for defining a user.
 * This uses annotations(@Data, @Id, etc.). I've also added the lombok
 * library for useful annotations. You can review it here:
 * https://projectlombok.org/features
 */
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String title;


    @ToString()
    @Data(staticConstructor = "of")
    public static class UserConstructor<T> {
        private final String firstName;
        private final String lastName;
        private final String email;
        private final String title;

    }
}