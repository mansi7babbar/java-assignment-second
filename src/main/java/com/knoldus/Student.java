package com.knoldus;

import java.util.Optional;

public class Student {
 int id;
 String name;
 int age;
 Address address;

 public Student(int id, String name, int age, Address address) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.address = address;
 }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

class Address {
    String primaryAddress;
    Optional<String> secondaryAddress;

    public Address(String primaryAddress, Optional<String> secondaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "primaryAddress='" + primaryAddress + '\'' +
                ", secondaryAddress=" + secondaryAddress +
                '}';
    }
}
