package com.aaron.test;


public class App {
    public static void main(String[] args) {
        HelloCommand command = new HelloCommand();
        String result = command.execute();
        System.out.println(result);
    }
}