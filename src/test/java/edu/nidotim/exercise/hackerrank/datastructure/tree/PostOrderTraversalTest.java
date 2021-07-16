package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostOrderTraversalTest {

  PostOrderTraversal postOrderTraversal;

  @Before
  public void before() {
    postOrderTraversal = new PostOrderTraversal();
  }

  @Test
  public void postOrderTraversal() {
    Node root = NodeUtil.createNode(Arrays.asList(1, 2, 5, 3, 6, 4));
    String result = postOrderTraversal.postOrder(root);
    String expectedResult = "4 3 6 5 2 1";
    Assert.assertEquals(expectedResult, result);
  }

}
