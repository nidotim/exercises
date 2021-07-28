package edu.nidotim.exercise.hackerrank.algorithm.implementation;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HurdleRaceTest {


  HurdleRace hurdleRace;

  @Before
  public void before() {
    hurdleRace = new HurdleRace();
  }

  @Test
  public void testHurdleRace() {
    int k = 4;
    List<Integer> height = Arrays.asList(1, 6, 3, 5, 2);

    int expectedResult = 2;
    int results = hurdleRace.hurdleRace(k, height);

    Assert.assertEquals(expectedResult, results);
  }

}
