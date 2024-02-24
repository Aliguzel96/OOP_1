package org.example;

public interface StaffInterface {

    void work();
    void takeBreak();

    default void report() {
        System.out.println("Reporting.....");
    }

    static void welcomeMessage() {
        System.out.println("Welcome to the Staff System!");
    }

}
