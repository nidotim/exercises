package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClosestNumberTest {

  ClosestNumber closestNumber;

  @Before
  public void before() {
    closestNumber = new ClosestNumber();
  }

  @Test
  public void closestNumberTest() {
    List<Integer> unsorted = Arrays.asList(5, 4, 3, 2);
    List<Integer> expectedResult = Arrays.asList(2, 3, 3, 4, 4, 5);
    List<Integer> results = closestNumber.closestNumbers(unsorted);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void closestNumberTest2() {
    List<Integer> unsorted = Arrays
        .asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854);
    List<Integer> expectedResult = Arrays.asList(-20, 30);
    List<Integer> results = closestNumber.closestNumbers(unsorted);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void closestNumberTest3() {
    List<Integer> unsorted = Arrays
        .asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854,
            -520, -470);
    List<Integer> expectedResult = Arrays.asList(-520, -470, -20, 30);
    List<Integer> results = closestNumber.closestNumbers(unsorted);

    Assert.assertEquals(expectedResult, results);
  }
}
