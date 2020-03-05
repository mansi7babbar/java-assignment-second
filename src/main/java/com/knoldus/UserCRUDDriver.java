package com.knoldus;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UserCRUDDriver {
    UserCRUD userCRUD = new UserCRUD();

    CompletableFuture<List<User>> createUser(List<User> users) {
        return userCRUD.createUser(CompletableFuture.supplyAsync(() -> users))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while adding new user : " + ex.getMessage());
                    return userCRUD.getAllUsers(users);
                });
    }

    CompletableFuture<List<User>> deleteUser(List<User> users) {
        return userCRUD.deleteUser(CompletableFuture.supplyAsync(() -> users))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while deleting user : " + ex.getMessage());
                    return userCRUD.getAllUsers(users);
                });
    }

    CompletableFuture<List<User>> retrieveUser(List<User> users) {
        return userCRUD.retrieveUser(CompletableFuture.supplyAsync(() -> users))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while retrieving user : " + ex.getMessage());
                    return userCRUD.getAllUsers(users);
                });
    }

    CompletableFuture<List<User>> updateUser(List<User> users) {
        return userCRUD.updateUser(CompletableFuture.supplyAsync(() -> users))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while updating user : " + ex.getMessage());
                    return userCRUD.getAllUsers(users);
                });
    }

}
