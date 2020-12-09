package com.example.project;

public class RideApp {
  public static void main(String[] args) {
    try {
      Screen display = new Screen();
      display.init();
    } catch (Exception e) {
      System.out.println(e.toString());
    }

  }
}
