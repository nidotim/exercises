package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {

  QuickSort quickSort;

  @Before
  public void before() {
    quickSort = new QuickSort();
  }

  @Test
  public void testQuickSort1() {
    List<Integer> unsorted = Arrays.asList(4, 5, 3, 7, 2);
    List<Integer> expectedResult = Arrays.asList(3, 2, 4, 5, 7);
    List<Integer> results = quickSort.quickSort1(unsorted);

    Assert.assertEquals(expectedResult, results);
  }

}
