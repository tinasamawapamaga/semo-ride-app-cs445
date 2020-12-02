package com.example.project;
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class ride extends control{

    private String origin;
    private int payment;
    private String destination;
    private String rideAssignment;
    private String rideHistory[];

    //this method appears twice
    public boolean requestRide(){
        //true or false depends on
        //whether request was successful
        return true;
    }

    public int startDrive() {
        //need to set a timer and some sort of distance reader
    }

    public int stopDrive(){
        //timer must end
    }

    public String updateLocation(){
        //distance calcualtor may help
    }

    public double makePayment(){
        //must read subtract from bank account not really sure what to do here
    }

    public void riderAssign(){

    }

    public double chargeRider(){

    }
}
