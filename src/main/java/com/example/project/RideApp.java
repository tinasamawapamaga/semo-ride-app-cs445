package com.example.project;

public class RideApp {
    public static void main(String[] args) {
        try {
            screen display = new screen();
            display.init();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
