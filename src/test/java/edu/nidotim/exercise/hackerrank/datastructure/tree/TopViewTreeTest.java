package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TopViewTreeTest {

  TopViewTree topViewTree;

  @Before
  public void before() {
    topViewTree = new TopViewTree();
  }

  @Test
  public void topViewTreeTest() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(1, 2, 5, 3, 4, 6));
    String result = topViewTree.topView(root);
    String expectedResult = "1 2 5 6";
    Assert.assertEquals(expectedResult, result);
  }

}
