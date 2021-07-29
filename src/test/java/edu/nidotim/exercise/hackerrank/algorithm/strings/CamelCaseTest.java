package edu.nidotim.exercise.hackerrank.algorithm.strings;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CamelCaseTest {

  CamelCase camelCase;

  @Before
  public void before() {
    camelCase = new CamelCase();
  }

  @Test
  public void testSuperReducedString() {
    String word = "saveChangesInTheEditor";

    int expectedResult = 5;
    int results = camelCase.camelcase(word);

    Assert.assertEquals(expectedResult, results);
  }

}
