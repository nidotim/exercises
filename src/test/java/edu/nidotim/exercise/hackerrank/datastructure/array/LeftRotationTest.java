package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/arrays-ds/problem

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LeftRotationTest {

  LeftRotation leftRotation;

  @Before
  public void before() {
    leftRotation = new LeftRotation();
  }

  private void testAllMethods(int n, List<Integer> array, List<Integer> expectedResult) {
    List<Integer> result = leftRotation.rotateLeftWithNExponential(n, array);
    Assert.assertEquals(expectedResult, result);

    result = leftRotation.rotateLeftWithAnotherList(n, array);
    Assert.assertEquals(expectedResult, result);

    result = leftRotation.rotateLeftWithoutAnotherList(n, array);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void dynamicArrayTest1() {
    int n = 0;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest1_1() {
    int n = 1;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(2, 3, 4, 5, 1);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest1_2() {
    int n = 2;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(3, 4, 5, 1, 2);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest1_3() {
    int n = 3;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(4, 5, 1, 2, 3);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest1_4() {
    int n = 4;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(5, 1, 2, 3, 4);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest1_5() {
    int n = 5;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

    testAllMethods(n, array, expectedResult);
  }


  @Test
  public void dynamicArrayTest2() {
    int n = 4;
    List<Integer> array = Arrays.asList(1, 2);
    List<Integer> expectedResult = Arrays.asList(1, 2);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest3() {
    int n = 5;
    List<Integer> array = Arrays.asList(1, 2);
    List<Integer> expectedResult = Arrays.asList(2, 1);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest4() {
    int n = 5;
    List<Integer> array = Arrays.asList(1);
    List<Integer> expectedResult = Arrays.asList(1);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest5() {
    int n = 5;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest6() {
    int n = 11;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(2, 3, 4, 5, 1);

    testAllMethods(n, array, expectedResult);
  }


  @Test
  public void dynamicArrayTest7() {
    int n = 0;
    List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

    testAllMethods(n, array, expectedResult);
  }

  @Test
  public void dynamicArrayTest8() {
    int n = 2;
    List<Integer> array = Arrays.asList(1, 2, 3, 4);
    List<Integer> expectedResult = Arrays.asList(3, 4, 1, 2);

    testAllMethods(n, array, expectedResult);
  }


  @Test
  public void dynamicArrayTest9() {
    int n = 10;
    List<Integer> array = Arrays.asList();
    List<Integer> expectedResult = Arrays.asList();

    testAllMethods(n, array, expectedResult);
  }


  @Test
  public void dynamicArrayHackerRankTest1() {
    int n = 10;
    List<Integer> array = Arrays
        .asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);
    List<Integer> expectedResult = Arrays
        .asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77);

    testAllMethods(n, array, expectedResult);
  }
}