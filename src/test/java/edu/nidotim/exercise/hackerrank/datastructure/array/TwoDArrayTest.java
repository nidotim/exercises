package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/arrays-ds/problem

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TwoDArrayTest {

  TwoDArray twoDArray;

  @Before
  public void before() {
    twoDArray = new TwoDArray();
  }

  @Test
  public void twoDArray() {
    Integer[][] matrix = {
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}
    };
    int expectedResult = 19;
    List<List<Integer>> input = Arrays.stream(matrix)
        .map(Arrays::asList)
        .collect(Collectors.toList());
    int result = twoDArray.hourglassSum(input);
    Assert.assertEquals(expectedResult, result);
  }

}