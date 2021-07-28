package edu.nidotim.exercise.hackerrank.algorithm.implementation;

//  https://www.hackerrank.com/challenges/kangaroo/problem
//  0 3 4 2

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//  YES
public class BetweenTwoSetsTest {


  BetweenTwoSets betweenTwoSets;

  @Before
  public void before() {
    betweenTwoSets = new BetweenTwoSets();
  }

  @Test
  public void testBetweenTwoSets() {
    List<Integer> a = Arrays.asList(2, 4);
    List<Integer> b = Arrays.asList(16, 32, 96);

    int expectedResult = 3;
    int results = betweenTwoSets.getTotalX(a, b);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testBetweenTwoSets2() {
    List<Integer> a = Arrays.asList(3, 4);
    List<Integer> b = Arrays.asList(24, 48);

    int expectedResult = 2;
    int results = betweenTwoSets.getTotalX(a, b);

    Assert.assertEquals(expectedResult, results);
  }

}
