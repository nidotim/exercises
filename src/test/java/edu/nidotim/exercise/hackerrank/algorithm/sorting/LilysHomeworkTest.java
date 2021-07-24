package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LilysHomeworkTest {

  LilysHomework lilysHomework;

  @Before
  public void before() {
    lilysHomework = new LilysHomework();
  }

  @Test
  public void lilysHomeworkTest() {
    List<Integer> arr = Arrays.asList(2, 5, 3, 1);
    int expectedResult = 2;
    int results = lilysHomework.lilysHomework(arr);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void lilysHomeworkTest2() {
    List<Integer> arr = Arrays.asList(3, 4, 2, 5, 1);
    int expectedResult = 2;
    int results = lilysHomework.lilysHomework(arr);

    Assert.assertEquals(expectedResult, results);
  }

}
