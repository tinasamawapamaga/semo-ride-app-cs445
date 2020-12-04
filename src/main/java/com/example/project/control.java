package com.example.project;

import java.util.Scanner;

public class control extends screen {
    private String name;
    private char menu[];
    private char options[];
    private String[] location;
    private double payment;
    private String studentID;
    //Default class constructors
//Only need one constructor for this class because
//the menu will always be the same.
    public control(){
        this.name="";
        this.menu=new char[5];
        this.options=new char[5];
        this.location=new String[5];
        this.payment=0;
    }

//createAccount moved from account class to
//control class
    public void createAccount(){ //putting in rough code so we have something to work with
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter username");
        String username = input.nextLine();

        System.out.println("Please enter your studentID");
        int studentID = input.nextInt();

        System.out.println("Please enter your first name");
        String first = input.nextLine();
        System.out.println("Please enter your last name");
        String last = input.nextLine();

        System.out.println("Please enter your birthday");
        int birthday = input.nextInt();



    }

    public void processDrive(){

    }

    public void updateInfo(){

    }

    public void exitApp(){
        System.exit(0);
    }
}


