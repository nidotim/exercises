package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExtraLongFactorialsTest {

  ExtraLongFactorials extraLongFactorials;

  @Before
  public void before() {
    extraLongFactorials = new ExtraLongFactorials();
  }

  @Test
  public void testExtraLongFactorials() {
    int n = 3;
    String expectedResult = "6";
    String results = extraLongFactorials.extraLongFactorials(n);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testExtraLongFactorials2() {
    int n = 25;
    String expectedResult = "15511210043330985984000000";
    String results = extraLongFactorials.extraLongFactorials(n);

    Assert.assertEquals(expectedResult, results);
  }
}
