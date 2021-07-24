package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindTheMedianTest {

  FindTheMedian findTheMedian;

  @Before
  public void before() {
    findTheMedian = new FindTheMedian();
  }

  @Test
  public void closestNumberTest() {
    List<Integer> unsorted = Arrays.asList(0, 1, 2, 4, 6, 5, 3);
    int expectedResult = 3;
    int results = findTheMedian.findMedian(unsorted);

    Assert.assertEquals(expectedResult, results);
  }

}
