package edu.nidotim.exercise.hackerrank.algorithm.search;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumLossTest {

  MinimumLoss minimumLoss;

  @Before
  public void before() {
    minimumLoss = new MinimumLoss();
  }

  @Test
  public void testMinimumLossTest() {
    List<Long> price = Arrays.asList(5L, 10L, 3L);

    int expectedResult = 2;
    int results = minimumLoss.minimumLoss(price);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testMinimumLossTest2() {
    List<Long> price = Arrays.asList(20L, 7L, 8L, 2L, 5L);

    int expectedResult = 2;
    int results = minimumLoss.minimumLoss(price);

    Assert.assertEquals(expectedResult, results);
  }

}
