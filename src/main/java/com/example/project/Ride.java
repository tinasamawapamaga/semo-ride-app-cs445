package com.example.project;

import java.time.*;

public class Ride {

  private String origin;
  private int payment;
  private String destination;
  private String rideAssignment;
  private String rideHistory[];

  // this method appears twice
  public boolean requestRide() {
    // true or false depends on
    // whether request was successful
    return true;
  }

  /*This function now returns type Instant
  The return value will be used as a parameter
  for the end function to calculate time*/
  public Instant startDrive() {
    Instant start = Instant.now();
    return start;
  }

  public double stopDrive(Instant beginning) {
    Instant end = Instant.now();
    Duration ride_time = Duration.between(beginning, end);
    double duration_in_minutes = ride_time.getSeconds() / 60;
    return duration_in_minutes;
  }

  public double chargeRider(double duration_In_Minutes, double length_Of_Ride) {
    double payment = duration_In_Minutes * 0.25 + 0.5 * length_Of_Ride;
    return payment;
  }

  public double priceEstimate(double length_Of_Ride) {
    double payment = 1.25 * length_Of_Ride;
    return payment;
  }

  /*
  public String updateLocation(){
      //distance calculator may help
  }

  public double makePayment(){
  }

  public void riderAssign(){
  }
   */
}
