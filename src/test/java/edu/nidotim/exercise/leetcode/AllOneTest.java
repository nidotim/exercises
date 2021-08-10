package edu.nidotim.exercise.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AllOneTest {


  @Test
  public void test() {
    AllOne allOne = new AllOne();
    allOne.inc("hello");
    allOne.inc("hello");
    Assert.assertEquals("hello", allOne.getMaxKey()); // return "hello"
    Assert.assertEquals("hello", allOne.getMinKey()); // return "hello"
    allOne.inc("leet");
    Assert.assertEquals("hello", allOne.getMaxKey()); // return "hello"
    Assert.assertEquals("leet", allOne.getMinKey()); // return "leet"
  }

  @Test
  public void test2() {
    AllOne allOne = new AllOne();
    allOne.inc("a");
    allOne.inc("b");
    allOne.inc("b");
    allOne.inc("c");
    allOne.inc("c");
    allOne.inc("c");
    allOne.dec("b");
    allOne.dec("b");
    Assert.assertEquals("a", allOne.getMinKey());
    allOne.dec("a");
    Assert.assertEquals("c", allOne.getMaxKey());
    Assert.assertEquals("c", allOne.getMinKey());
  }
}
