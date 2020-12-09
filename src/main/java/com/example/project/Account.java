package com.example.project;

import java.util.Arrays;
import java.util.Scanner;

public class Account {
  private String first_Name;
  private String last_Name;
  private int driverID;
  private int studentID;
  private int birthday;
  private char accountType;
  private String car_make;
  private char gender;
  private int backAcc;

  // Default class constructor
  public Account() {}

  public Account(
      String first,
      String last,
      int driverID,
      int studentID,
      int bd,
      char accountType,
      String car_make,
      char sex,
      int bankaccount) {
    this.first_Name = first;
    this.last_Name = last;
    this.driverID = driverID;
    this.studentID = studentID;
    this.birthday = bd;
    this.accountType = accountType;
    this.car_make = car_make;
    this.gender = sex;
    this.backAcc = bankaccount;
  }

  // delete processRegister because of ambiguity

  public void login() {
    Scanner userName = new Scanner(System.in);
    Scanner passWord = new Scanner(System.in);
    System.out.println("Please enter username");
    String username = userName.nextLine();
    System.out.println("Please enter your studentID");
    int studentID = passWord.nextInt();
  }

  // there's something weird about this function...
  // I'm unsure whether this is the right way to implement this
  public char choose_Acc_Type() {
    Scanner scanner = new Scanner(System.in);
    char Acc_type = scanner.next().charAt(0);
    if (Arrays.asList("P", "p", "D", "d").contains(Acc_type)) {
      return Acc_type;
    } else {
      System.out.println("Please enter a valid type: P,p for passenger and\n+" + "D,d for driver");
      return 'x'; // return x for wrong char selection
    }
  }
}
