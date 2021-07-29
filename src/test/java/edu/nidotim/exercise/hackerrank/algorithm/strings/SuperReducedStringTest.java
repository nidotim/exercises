package edu.nidotim.exercise.hackerrank.algorithm.strings;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuperReducedStringTest {

  SuperReducedString superReducedString;

  @Before
  public void before() {
    superReducedString = new SuperReducedString();
  }

  @Test
  public void testSuperReducedString() {
    String word = "aaabccddd";

    String expectedResult = "abd";
    String results = superReducedString.superReducedString(word);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testSuperReducedString2() {
    String word = "aa";

    String expectedResult = "Empty String";
    String results = superReducedString.superReducedString(word);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testSuperReducedString3() {
    String word = "baab";

    String expectedResult = "Empty String";
    String results = superReducedString.superReducedString(word);

    Assert.assertEquals(expectedResult, results);
  }

}
