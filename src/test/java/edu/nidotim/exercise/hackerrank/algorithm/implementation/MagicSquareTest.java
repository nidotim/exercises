package edu.nidotim.exercise.hackerrank.algorithm.implementation;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicSquareTest {


  MagicSquare magicSquare;

  @Before
  public void before() {
    magicSquare = new MagicSquare();
  }

  @Test
  public void testMagicSquare() {
    List<List<Integer>> square = Arrays.asList(
        Arrays.asList(5, 3, 4),
        Arrays.asList(1, 5, 8),
        Arrays.asList(6, 4, 2)
    );
    int expectedResult = 7;
    int results = magicSquare.formingMagicSquare(square);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testMagicSquare2() {
    List<List<Integer>> square = Arrays.asList(
        Arrays.asList(4, 9, 2),
        Arrays.asList(3, 5, 7),
        Arrays.asList(8, 1, 5)
    );
    int expectedResult = 1;
    int results = magicSquare.formingMagicSquare(square);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testMagicSquare3() {
    List<List<Integer>> square = Arrays.asList(
        Arrays.asList(6, 3, 4),
        Arrays.asList(1, 5, 8),
        Arrays.asList(6, 4, 2)
    );
    int expectedResult = 6;
    int results = magicSquare.formingMagicSquare(square);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testMagicSquare4() {
    List<List<Integer>> square = Arrays.asList(
        Arrays.asList(4, 1, 5),
        Arrays.asList(7, 6, 4),
        Arrays.asList(7, 2, 2)
    );
    int expectedResult = 21;
    int results = magicSquare.formingMagicSquare(square);

    Assert.assertEquals(expectedResult, results);
  }
}
