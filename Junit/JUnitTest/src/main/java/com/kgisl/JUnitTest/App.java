package com.kgisl.JUnitTest;

public class App {

    public  void run() {
        System.out.println("App is Running");
    }

    public void beforeMethod() {
        System.out.println("Before Method is running");
    }

    public void beforeClassMethod() {
        System.out.println("Before Class Method is Running");
    }

    public void afterMethod() {
        System.out.println("After Method is Running");
    }

    public void afterClassMethod() {
        System.out.println("After Class Class Method is Running");
    }

    public void ignoreMethod() {
        System.out.println("Ignore Method is Running");
    }

    public int add(int i, int j) {
        return i+j;
    }

}
