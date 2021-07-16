package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PreOrderTraversalTest {

  PreOrderTraversal preOrderTraversal;

  @Before
  public void before() {
    preOrderTraversal = new PreOrderTraversal();
  }

  @Test
  public void preOrderTraversal() {
    Node root = NodeUtil.createNode(Arrays.asList(1, 2, 5, 3, 4, 6));
    String result = preOrderTraversal.preOrder(root);
    String expectedResult = "1 2 5 3 4 6";
    Assert.assertEquals(expectedResult, result);
  }

}
