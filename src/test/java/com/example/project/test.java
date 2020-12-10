package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.time.Instant;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

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
  void empty_test() {}

}
