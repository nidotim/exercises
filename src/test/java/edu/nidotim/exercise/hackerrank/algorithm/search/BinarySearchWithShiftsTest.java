package edu.nidotim.exercise.hackerrank.algorithm.search;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchWithShiftsTest {

  BinarySearchWithShifts binarySearchWithShifts;

  @Before
  public void before() {
    binarySearchWithShifts = new BinarySearchWithShifts();
  }

  @Test
  public void binarySearchWithShiftsTest1() {
    System.out.println(7 / 2);
    List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 1, 2, 3, 4);
    int shift = 5;
    int search = 8;

    int expectedResult = 4;
    int results = binarySearchWithShifts.binarySearchWithShits(list, shift, search);
    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void binarySearchWithShiftsTest2() {
    List<Integer> list = Arrays.asList(6, 7, 8, 1, 2, 3, 4, 5);
    int shift = 3;
    int search = 5;

    int expectedResult = 7;
    int results = binarySearchWithShifts.binarySearchWithShits(list, shift, search);
    Assert.assertEquals(expectedResult, results);
  }

}
