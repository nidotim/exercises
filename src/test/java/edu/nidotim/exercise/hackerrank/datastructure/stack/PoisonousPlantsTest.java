package edu.nidotim.exercise.hackerrank.datastructure.stack;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PoisonousPlantsTest {

  private static PoisonousPlants poisonousPlants;

  @BeforeClass
  public static void initClass() {
    poisonousPlants = new PoisonousPlants();
  }

  @Test
  public void test1() {
    int[] p = new int[]{4, 3, 7, 5, 6, 4, 2};
    int expected = 3;
    int result = poisonousPlants.poisonousPlants(p);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] p = new int[]{6, 5, 8, 4, 7, 10, 9};
    int expected = 2;
    int result = poisonousPlants.poisonousPlants(p);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test3() {
    int[] p = new int[]{3, 2, 5, 4};
    int expected = 2;
    int result = poisonousPlants.poisonousPlants(p);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    int[] p = new int[]{20, 5, 6, 15, 2, 2, 17, 2, 11, 5, 14, 5, 10, 9, 19, 12, 5};
    int expected = 4;
    int result = poisonousPlants.poisonousPlants(p);
    Assert.assertEquals(expected, result);
  }
}

