package com.knoldus;

public class User {
    int id;
    String name;
    String city;
    int age;

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id
                + ", name='" + name + '\''
                + ", city='" + city + '\''
                + ", age=" + age
                + '}';
    }
}
