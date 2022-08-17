package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.saveUser("Ivan", "Ivanov", (byte) 21);

        userService.getAllUsers();

        userService.removeUserById(1);

        userService.getAllUsers();
    }
}