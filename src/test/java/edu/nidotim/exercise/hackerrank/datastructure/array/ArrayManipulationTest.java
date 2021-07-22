package edu.nidotim.exercise.hackerrank.datastructure.array;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ArrayManipulationTest {

  ArrayManipulation arrayManipulation;

  @Before
  public void before() {
    arrayManipulation = new ArrayManipulation();
  }


  @Test
  public void testArrayManipulation() {
    int n = 5;
    List<List<Integer>> commands = Arrays.asList(
        Arrays.asList(1, 2, 100),
        Arrays.asList(3, 5, 100),
        Arrays.asList(3, 4, 100)
    );
    long expectedResult = 200;

    long results = arrayManipulation.arrayManipulation(n, commands);
    Assert.assertEquals(expectedResult, results);

    results = arrayManipulation.arrayManipulationWithAccumulatedSlope(n, commands);
    Assert.assertEquals(expectedResult, results);

  }

  @Test
  public void testArrayManipulation2() {
    int n = 10;
    List<List<Integer>> commands = Arrays.asList(
        Arrays.asList(1, 5, 3),
        Arrays.asList(4, 8, 7),
        Arrays.asList(6, 9, 1)
    );
    long expectedResult = 10;
    long results = arrayManipulation.arrayManipulation(n, commands);
    Assert.assertEquals(expectedResult, results);

    results = arrayManipulation.arrayManipulationWithAccumulatedSlope(n, commands);
    Assert.assertEquals(expectedResult, results);

  }

  @Test
  public void testArrayManipulation3() {
    int n = 10;
    List<List<Integer>> commands = Arrays.asList(
        Arrays.asList(2, 6, 8),
        Arrays.asList(3, 5, 7),
        Arrays.asList(1, 8, 1),
        Arrays.asList(5, 8, 15)
    );
    long expectedResult = 31;
    long results = arrayManipulation.arrayManipulation(n, commands);
    Assert.assertEquals(expectedResult, results);

    results = arrayManipulation.arrayManipulationWithAccumulatedSlope(n, commands);
    Assert.assertEquals(expectedResult, results);

  }


  @Test
  public void testArrayManipulation4() {
    int n = 10;
    List<List<Integer>> commands = Arrays.asList(
        Arrays.asList(2, 6, 8),
        Arrays.asList(3, 5, 7),
        Arrays.asList(1, 8, 1),
        Arrays.asList(5, 10, 15),
        Arrays.asList(5, 5, 15)
    );
    long expectedResult = 46;
    long results = arrayManipulation.arrayManipulation(n, commands);
    Assert.assertEquals(expectedResult, results);

    results = arrayManipulation.arrayManipulationWithAccumulatedSlope(n, commands);
    Assert.assertEquals(expectedResult, results);

  }


  @Test
  public void testArrayManipulationWithLargeNumber() {
    int n = 10;
    List<List<Integer>> commands = Arrays.asList(
        Arrays.asList(2, 6, 8),
        Arrays.asList(3, 5, 7),
        Arrays.asList(1, 8, 1),
        Arrays.asList(5, 10, 15),
        Arrays.asList(5, 5, Integer.MAX_VALUE)
    );
    long expectedResult = 31L + Integer.MAX_VALUE;
    long results = arrayManipulation.arrayManipulation(n, commands);
    Assert.assertEquals(expectedResult, results);

    results = arrayManipulation.arrayManipulationWithAccumulatedSlope(n, commands);
    Assert.assertEquals(expectedResult, results);

  }

}