package edu.nidotim.exercise.hackerrank.datastructure.stack;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LargestRectangleTest {

  private static LargestRectangle largestRectangle;

  @BeforeClass
  public static void initClass() {
    largestRectangle = new LargestRectangle();
  }

  @Test
  public void test1() {

    int[] h = new int[]{1, 2, 3, 4, 5};
    int expected = 9;
    int result = largestRectangle.solution(h);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] h = new int[]{1, 3, 5, 9, 11};
    int expected = 18;
    int result = largestRectangle.solution(h);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int[] h = new int[]{11, 11, 10, 10, 10};
    int expected = 50;
    int result = largestRectangle.solution(h);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    int[] h = new int[]{1, 3, 5, 7, 6, 2, 4, 1};
    int expected = 15;
    int result = largestRectangle.solution(h);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test5() {
    int[] h = new int[]{1, 1, 1, 1, 1};
    int expected = 5;
    int result = largestRectangle.solution(h);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test6() {
    int[] h = new int[]{1, 2, 3, 2, 1};
    int expected = 6;
    int result = largestRectangle.solution(h);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test7() {
    int[] h = new int[]{3, 2, 1, 2, 3};
    int expected = 5;
    int result = largestRectangle.solution(h);
    Assert.assertEquals(expected, result);
  }

}
