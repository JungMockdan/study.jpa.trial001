package com.example.basic_jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UserTest {
    @Test
    void test(){
        User user = new User();
        user.setEmail("email");

        System.out.println(user.toString());

    }
}