package com.example.project;

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
//need to set menu and options choices
//array cannot be empty
//Perhaps we need another function or something

    /*public void verifyLogin(){
        if (StudentID == true){ //must read from studentID data
            return "access granted";
        }
        else{
            return "login failed";
        }

    }*/

    public void processDrive(){

    }

    public void updateInfo(){

    }

    public void exitApp(){
        System.exit(0);
    }
}


