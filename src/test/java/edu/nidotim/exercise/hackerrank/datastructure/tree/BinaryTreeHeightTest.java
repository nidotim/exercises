package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeHeightTest {

  BinaryTreeHeight binaryTreeHeight;

  @Before
  public void before() {
    binaryTreeHeight = new BinaryTreeHeight();
  }

  @Test
  public void binaryTreeHeight() {
    Node root = NodeUtil.createNode(Arrays.asList(3, 5, 2, 1, 4, 6, 7));
    int result = binaryTreeHeight.height(root);
    int expectedResult = 3;
    Assert.assertEquals(expectedResult, result);
  }

}
