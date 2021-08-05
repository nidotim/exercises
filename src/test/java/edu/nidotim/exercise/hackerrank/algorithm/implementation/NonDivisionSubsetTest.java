package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonDivisionSubsetTest {

  NonDivisionSubset nonDivisionSubset;

  @Before
  public void before() {
    nonDivisionSubset = new NonDivisionSubset();
  }

  @Test
  public void testNonDivisionSubset() {

    int k = 3;
    List<Integer> s = Arrays.asList(1, 7, 2, 4);
    int expectedResult = 3;
    int results = nonDivisionSubset.nonDivisibleSubset(k, s);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testNonDivisionSubset2() {

    int k = 4;
    List<Integer> s = Arrays.asList(19, 10, 12, 24, 25, 22);
    int expectedResult = 3;
    int results = nonDivisionSubset.nonDivisibleSubset(k, s);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testNonDivisionSubset3() {

    int k = 7;
    List<Integer> s = Arrays.asList(19, 10, 12, 24, 25, 22);
    int expectedResult = 5;
    int results = nonDivisionSubset.nonDivisibleSubset(k, s);

    Assert.assertEquals(expectedResult, results);
  }
}
