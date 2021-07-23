package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

  InsertionSort insertionSort;

  @Before
  public void before() {
    insertionSort = new InsertionSort();
  }

  @Test
  public void testInsertionSort1() {
    int n = 5;
    List<Integer> unsorted = Arrays.asList(2, 4, 6, 8, 3);
    List<List<Integer>> expectedResult = Arrays.asList(
        Arrays.asList(2, 4, 6, 8, 8),
        Arrays.asList(2, 4, 6, 6, 8),
        Arrays.asList(2, 4, 4, 6, 8),
        Arrays.asList(2, 3, 4, 6, 8)
    );
    List<List<Integer>> results = insertionSort.insertionSort1(n, unsorted);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testInsertionSort1_2() {
    int n = 10;
    List<Integer> unsorted = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1);
    List<List<Integer>> expectedResult = Arrays.asList(
        Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 10),
        Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 9, 10),
        Arrays.asList(2, 3, 4, 5, 6, 7, 8, 8, 9, 10),
        Arrays.asList(2, 3, 4, 5, 6, 7, 7, 8, 9, 10),
        Arrays.asList(2, 3, 4, 5, 6, 6, 7, 8, 9, 10),
        Arrays.asList(2, 3, 4, 5, 5, 6, 7, 8, 9, 10),
        Arrays.asList(2, 3, 4, 4, 5, 6, 7, 8, 9, 10),
        Arrays.asList(2, 3, 3, 4, 5, 6, 7, 8, 9, 10),
        Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9, 10),
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    List<List<Integer>> results = insertionSort.insertionSort1(n, unsorted);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testInsertionSort2() {
    int n = 7;
    List<Integer> unsorted = Arrays.asList(3, 4, 7, 5, 6, 2, 1);
    List<List<Integer>> expectedResult = Arrays.asList(
        Arrays.asList(3, 4, 7, 5, 6, 2, 1),
        Arrays.asList(3, 4, 7, 5, 6, 2, 1),
        Arrays.asList(3, 4, 5, 7, 6, 2, 1),
        Arrays.asList(3, 4, 5, 6, 7, 2, 1),
        Arrays.asList(2, 3, 4, 5, 6, 7, 1),
        Arrays.asList(1, 2, 3, 4, 5, 6, 7)
    );
    List<List<Integer>> results = insertionSort.insertionSort2(n, unsorted);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testInsertionSort3() {
    int n = 7;
    int[] ary = new int[]{4, 1, 3, 5, 6, 2};
    int[] expectedResult = new int[]{1, 2, 3, 4, 5, 6};
    int[] results = insertionSort.insertionSort3(ary);

    Assert.assertEquals(expectedResult, results);
  }
}
