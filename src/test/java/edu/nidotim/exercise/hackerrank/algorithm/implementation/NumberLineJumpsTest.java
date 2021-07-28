package edu.nidotim.exercise.hackerrank.algorithm.implementation;

//  https://www.hackerrank.com/challenges/kangaroo/problem
//  0 3 4 2

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//  YES
public class NumberLineJumpsTest {


  NumberLineJumps numberLineJumps;

  @Before
  public void before() {
    numberLineJumps = new NumberLineJumps();
  }

  @Test
  public void testNumberLineJumpsTest() {
    int x1 = 0;
    int v1 = 3;
    int x2 = 4;
    int v2 = 2;
    String expectedResult = "YES";
    String results = numberLineJumps.kangaroo(x1, v1, x2, v2);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testNumberLineJumpsTest2() {
    int x1 = 0;
    int v1 = 2;
    int x2 = 5;
    int v2 = 3;

    String expectedResult = "NO";
    String results = numberLineJumps.kangaroo(x1, v1, x2, v2);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testNumberLineJumpsTest3() {
    int x1 = 43;
    int v1 = 2;
    int x2 = 70;
    int v2 = 2;

    String expectedResult = "NO";
    String results = numberLineJumps.kangaroo(x1, v1, x2, v2);

    Assert.assertEquals(expectedResult, results);

  }
}
