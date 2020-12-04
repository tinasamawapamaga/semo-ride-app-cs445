package com.example.project;
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import java.time.*;

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
    /*This function now returns type Instant
    The return value will be used as a parameter
    for the end function to calculate time*/
    public Instant startDrive() {
        Instant start=Instant.now();
        return start;
    }

    public double stopDrive(Instant beginning){
        Instant end=Instant.now();
        Duration ride_time=Duration.between(beginning, end);
        double duration_in_minutes=ride_time.getSeconds()/60;
        return duration_in_minutes;
    }
/*
    public String updateLocation(){
        //distance calculator may help
    }

    public double makePayment(){
        //must read subtract from bank account not really sure what to do here
        //yeah this bank account requires some integration which is
        //next level
    }

    public void riderAssign(){

    }

    public double chargeRider(){
        //this function is similar to makePayment
        //this deals with payment technology (fintec)
    }*/
}
