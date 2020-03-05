package com.knoldus;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class UserCRUD {

    CompletableFuture<List<User>> createUser(CompletableFuture<List<User>> users) {
        User joey = new User(1, "Joey", "Kerala", 15);
        users.thenApply(getUsers -> getUsers.add(joey));
        return users;
    }

    CompletableFuture<List<User>> deleteUser(CompletableFuture<List<User>> users) {
        users.thenApply(getUsers -> getUsers.removeAll(getUsers.stream().filter(user -> user.age < 18)
                .collect(Collectors.toList())));
        return users;
    }

    CompletableFuture<List<User>> retrieveUser(CompletableFuture<List<User>> users) {
        return users.thenApply(getUsers -> getUsers.stream().filter(user -> user.name.startsWith("M") && user.age >= 18)
                .collect(Collectors.toList()));
    }

    CompletableFuture<List<User>> updateUser(CompletableFuture<List<User>> users) {
        users.thenApply(getUsers -> getUsers.stream().map(user -> user.name = user.name.concat(" Knoldus")));
        return users;
    }

    List<User> getAllUsers(List<User> users) {
        return users;
    }
}
