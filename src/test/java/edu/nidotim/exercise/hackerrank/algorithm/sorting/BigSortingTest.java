package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BigSortingTest {

  BigSorting bigSorting;

  @Before
  public void before() {
    bigSorting = new BigSorting();
  }

  @Test
  public void testBigSorting() {
    List<String> unsorted = Arrays
        .asList("31415926535897932384626433832795", "1", "3", "10", "3", "5");
    List<String> expectedResult = Arrays
        .asList("1", "3", "3", "5", "10", "31415926535897932384626433832795");
    List<String> results = bigSorting.bigSorting(unsorted);

    Assert.assertEquals(expectedResult, results);
  }
}
