package com.example.project;

import java.util.Scanner;

public class account  extends control{
    private String first_name;
    private String last_name;
    private int driverID;
    private int studentID;
    private int birthday;
    private char accountType;
    private String car_make;
    private char gender;
    private int backAcc;

    //Two default class constructors
    public account(){
        this.first_name= "";
        this.last_name= "";
        this.driverID= 0;
        this.studentID= 0;
        this.birthday= 0;
        this.accountType= 'c';
        this.car_make= "";
        this.gender= 'N';
        this.backAcc= 0;
    }

    public account(String first, String last, int driverID, int studentID, int bd, char accountType, String car_make, char sex, int bankaccount){
        this.first_name= first;
        this.last_name= last;
        this.driverID= driverID;
        this.studentID= studentID;
        this.birthday= bd;
        this.accountType= accountType;
        this.car_make= car_make;
        this.gender= sex;
        this.backAcc= bankaccount;
    }

    public void processRegister(){} //not sure what to do here

    public void createAccount(){ //putting in rough code so we have something to work with
        Scanner userName = new Scanner(System.in);;
        Scanner passWord = new Scanner(System.in);;
        System.out.println("Please enter username");
        double username = userName.nextDouble(); //look at this
        System.out.println("Please enter your studentID");
        double studentID = passWord.nextDouble();
    }

    public boolean requestRide(){
        //return True for success and
        //false for fail (because of
        //no driver nearby or all drivers busy

        return true;
    }

    public void login(){
        Scanner userName = new Scanner(System.in);;
        Scanner passWord = new Scanner(System.in);;
        System.out.println("Please enter username");
        double username = userName.nextDouble(); //look at this
        System.out.println("Please enter your studentID");
        double studentID = passWord.nextDouble();
    }

    public char choose_Acc_Type(){
        //return driver or
        //passenger so 'd' or 'p'
        return 'T';
    }
}
