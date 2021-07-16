package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/arrays-ds/problem

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ArrayDSTest {

  ArrayDS arrayDS;

  @Before
  public void before() {
    arrayDS = new ArrayDS();
  }

  @Test
  public void arrayDS() {
    List<Integer> integerList = Arrays.asList(1, 3, 4, 5);
    List<Integer> expectedResult = Arrays.asList(5, 4, 3, 1);

    List<Integer> result = arrayDS.reverseArray(integerList);
    Assert.assertEquals(expectedResult, result);
  }

}