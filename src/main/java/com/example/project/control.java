package com.example.project;

import java.util.Scanner;

public class control {
  private String name;
  private char menu[];
  private char options[];
  private String[] location;
  private double payment;
  private String studentID;

  // Default class constructors
  public control() {
    this.name = "";
    this.menu = new char[5];
    this.options = new char[5];
    this.location = new String[5];
    this.payment = 0;
  }

  // createAccount moved from account class to
  // control class
  public account createAccount() {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter username");
    String username = input.nextLine();

    System.out.println("Please enter your studentID");
    int studentID = input.nextInt();

    System.out.println("Please enter your driverID");
    int driverID = input.nextInt();

    System.out.println("Please enter your first name");
    String first = input.nextLine();
    System.out.println("Please enter your last name");
    String last = input.nextLine();

    System.out.println("Please enter your birthday");
    int birthday = input.nextInt();

    System.out.println("Please enter your account type");
    char acc_type = input.next().charAt(0);

    System.out.println("Please enter your car model");
    String car = input.nextLine();

    System.out.println("Please choose your gender");
    char gender = input.next().charAt(0);

    System.out.println("Enter your bank account");
    int bank_acc = input.nextInt();

    account ret =
        new account(first, last, driverID, studentID, birthday, acc_type, car, gender, bank_acc);
    return ret;
  }

  public void processDrive() {

  }

  public void updateInfo() {

  }

  public void exitApp() {
    System.exit(0);
  }
}
