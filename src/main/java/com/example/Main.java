package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from container!");
        for(int i=0; i<10; i++) {
            try {
                Thread.sleep(5000);
                System.out.println("Still running..." + i);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}
