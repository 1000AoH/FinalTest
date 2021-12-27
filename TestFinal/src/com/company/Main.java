package com.company;

public class Main {

    public static void main(String[] args) {
        setUser();
        Application.runApp();

    }

    public static void setUser() {
        Application.test.addUser(new User("a", "hoang@gmail.com", "@Password123"));
        Application.test.addUser(new User("b", "hoang1@gmail.com", "@Password123"));
        Application.test.addUser(new User("c", "hoang2@gmail.com", "@Password123"));
        Application.test.addUser(new User("d", "hoang3@gmail.com", "@Password123"));
    }
}


