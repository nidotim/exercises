package edu.nidotim.exercise.hackerrank.datastructure.array;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SparseArraysTest {

  SparseArrays sparseArrays;

  @Before
  public void before() {
    sparseArrays = new SparseArrays();
  }


  @Test
  public void testSparseArrays() {
    List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
    List<String> queries = Arrays.asList("aba", "xzxb", "ab");
    List<Integer> expectedResult = Arrays.asList(2, 1, 0);
    List<Integer> results = sparseArrays.matchingStrings(strings, queries);

    Assert.assertEquals(expectedResult, results);
  }

}