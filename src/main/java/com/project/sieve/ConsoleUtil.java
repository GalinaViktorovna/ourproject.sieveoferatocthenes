package com.project.sieve;

public class ConsoleUtil {

    public static void greetingUser() {
        System.out.print("Hello,friend! You want that I find prime number! " +
                "\nEnter \"YES\" to continue or enter \"EXIT\" to stop the program: ");
    }

    public static void readOrWrite() {
        System.out.println("How do you want to get the result?\nEnter please \"YES\" and I save you result in file" +
                " before output to the console!\nEnter \"NO\" and I will bring results only in the console." +
                "\nEnter \"EXIT\" for stop program.");
    }

    public static void bye() {
        System.out.println("Thank you!!!\nI hope that I help you!:)");
    }

}
