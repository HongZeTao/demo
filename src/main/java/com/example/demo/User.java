package com.example.demo;

import lombok.Data;

@Data
public class User {

    private String name;

    private String age;

    private String phone;

    private User user;

    public User() {
        user = this;
    }

    public User setName(String name) {
        user.name = name;
        return user;
    }

    public User setAge(String age) {
        user.age = age;
        return user;
    }

    public User setPhone(String phone) {
        user.phone = phone;
        return user;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
