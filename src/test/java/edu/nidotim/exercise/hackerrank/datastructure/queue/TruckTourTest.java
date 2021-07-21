package edu.nidotim.exercise.hackerrank.datastructure.queue;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TruckTourTest {

  TruckTour truckTour;

  @Before
  public void before() {
    truckTour = new TruckTour();
  }

  @Test
  public void truckTourTest() {
    List<List<Integer>> petrolPumps = Arrays.asList(
        Arrays.asList(1, 5),
        Arrays.asList(10, 3),
        Arrays.asList(3, 4)
    );

    int result = truckTour.truckTour(petrolPumps);
    int expectedResult = 1;
    Assert.assertEquals(expectedResult, result);
  }

}
