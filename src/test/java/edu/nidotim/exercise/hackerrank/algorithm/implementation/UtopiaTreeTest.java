package edu.nidotim.exercise.hackerrank.algorithm.implementation;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtopiaTreeTest {


  UtopianTree utopianTree;

  @Before
  public void before() {
    utopianTree = new UtopianTree();
  }

  @Test
  public void testUtopianTree() {
    int k = 4;
    List<Integer> cycles = Arrays.asList(0, 1, 4);
    List<Integer> expectedResults = Arrays.asList(1, 2, 7);

    for (int i = 0; i < cycles.size(); i++) {
      int expectedResult = expectedResults.get(i);
      int result = utopianTree.utopianTree(cycles.get(i));
      Assert.assertEquals(expectedResult, result);
    }


  }

}
