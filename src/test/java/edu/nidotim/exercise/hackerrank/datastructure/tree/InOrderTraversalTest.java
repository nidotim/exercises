package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InOrderTraversalTest {

  InOrderTraversal inOrderTraversal;

  @Before
  public void before() {
    inOrderTraversal = new InOrderTraversal();
  }

  @Test
  public void postOrderTraversal() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(1, 2, 5, 3, 6, 4));
    String result = inOrderTraversal.traverse(root);
    String expectedResult = "1 2 3 4 5 6";
    Assert.assertEquals(expectedResult, result);
  }

}
