package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/arrays-ds/problem

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DynamicArrayTest {

  DynamicArray dynamicArray;

  @Before
  public void before() {
    dynamicArray = new DynamicArray();
  }

  @Test
  public void dynamicArrayTest() {
    int n = 2;
    List<List<Integer>> queries = Arrays.asList(
        Arrays.asList(1, 0, 5),
        Arrays.asList(1, 1, 7),
        Arrays.asList(1, 0, 3),
        Arrays.asList(2, 1, 0),
        Arrays.asList(2, 1, 1)
    );
    List<Integer> result = dynamicArray.dynamicArray(n, queries);
    List<Integer> expectedResult = Arrays.asList(7, 3);
    Assert.assertEquals(expectedResult, result);
  }

}