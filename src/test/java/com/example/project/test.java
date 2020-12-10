package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class test {

  @Test
  void chargeRider_Test() {
    Ride test = new Ride();
    assertEquals(19, test.chargeRider(12, 32));
  }

  @Test
  void duration_Test() throws InterruptedException {
    Ride test = new Ride();
    Instant begin = test.startDrive();
    TimeUnit.SECONDS.sleep(60);
    double duration = test.stopDrive(begin);
    assertEquals(1, duration);
  }

  @Test
  void createAccount_test() {
    Account stable =
        new Account("Tin", "Le", 12345786, 1978050, 140499, 'p', "Lamborghini", 'M', 2244333);
    assertEquals(true, stable instanceof Account);
  }

}
