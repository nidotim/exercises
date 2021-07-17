package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeLowestCommonAncestorTest {

  BinarySearchTreeLowestCommonAncestor binarySearchTreeLowestCommonAncestor;

  @Before
  public void before() {
    binarySearchTreeLowestCommonAncestor = new BinarySearchTreeLowestCommonAncestor();
  }

  @Test
  public void binarySearchTreeLCATest1() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(4, 2, 3, 1, 7, 6));
    int expectedResult = 4;
    Node result = binarySearchTreeLowestCommonAncestor.lca(root, 1, 7);
    Assert.assertEquals(expectedResult, result.data);
    result = binarySearchTreeLowestCommonAncestor.lcaUsingDFS(root, 1, 7);
    Assert.assertEquals(expectedResult, result.data);
  }

  @Test
  public void binarySearchTreeLCATest2() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(1, 2));
    int expectedResult = 1;
    Node result = binarySearchTreeLowestCommonAncestor.lca(root, 1, 2);
    Assert.assertEquals(expectedResult, result.data);
    result = binarySearchTreeLowestCommonAncestor.lcaUsingDFS(root, 1, 2);
    Assert.assertEquals(expectedResult, result.data);
  }

  @Test
  public void binarySearchTreeLCATest3() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(5, 3, 8, 2, 4, 6, 7));
    int expectedResult = 5;
    Node result = binarySearchTreeLowestCommonAncestor.lca(root, 7, 3);
    Assert.assertEquals(expectedResult, result.data);
    result = binarySearchTreeLowestCommonAncestor.lcaUsingDFS(root, 7, 3);
    Assert.assertEquals(expectedResult, result.data);
  }

  @Test
  public void binarySearchTreeLCATest4() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(4, 2, 3, 1, 7, 6));
    int expectedResult = 2;
    Node result = binarySearchTreeLowestCommonAncestor.lca(root, 1, 3);
    Assert.assertEquals(expectedResult, result.data);
    result = binarySearchTreeLowestCommonAncestor.lcaUsingDFS(root, 1, 3);
    Assert.assertEquals(expectedResult, result.data);
  }

  @Test
  public void binarySearchTreeLCATest5() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(4, 2, 3, 1, 7, 6));
    int expectedResult = 4;
    Node result = binarySearchTreeLowestCommonAncestor.lca(root, 1, 6);
    Assert.assertEquals(expectedResult, result.data);
    result = binarySearchTreeLowestCommonAncestor.lcaUsingDFS(root, 1, 6);
    Assert.assertEquals(expectedResult, result.data);
  }

  @Test
  public void binarySearchTreeLCATest6() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(2));
    int expectedResult = 2;
    Node result = binarySearchTreeLowestCommonAncestor.lca(root, 7, 10);
    Assert.assertEquals(expectedResult, result.data);
//    result = binarySearchTreeLowestCommonAncestor.lcaUsingDFS(root, 7, 10);
//    Assert.assertEquals(expectedResult, result.data);
  }

  @Test
  public void binarySearchTreeLCATest7() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(8, 4, 9, 1, 2, 3, 6, 5));
    int expectedResult = 1;
    Node result = binarySearchTreeLowestCommonAncestor.lca(root, 1, 2);
    Assert.assertEquals(expectedResult, result.data);
    result = binarySearchTreeLowestCommonAncestor.lcaUsingDFS(root, 1, 2);
    Assert.assertEquals(expectedResult, result.data);
  }


}
