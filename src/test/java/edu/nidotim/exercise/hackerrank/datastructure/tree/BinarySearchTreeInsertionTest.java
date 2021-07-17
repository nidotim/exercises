package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeInsertionTest {

  BinarySearchTreeInsertion binarySearchTreeInsertion;
  PreOrderTraversal preOrderTraversal;

  @Before
  public void before() {
    binarySearchTreeInsertion = new BinarySearchTreeInsertion();
    preOrderTraversal = new PreOrderTraversal();
  }

  @Test
  public void binarySearchTreeInsertionTest() {
    Node root = NodeUtil.createBinarySearchTreeNode(Arrays.asList(4, 2, 3, 1, 7));
    System.out.println(preOrderTraversal.preOrder(root));
    Node node = binarySearchTreeInsertion.insert(root, 6);
    System.out.println(preOrderTraversal.preOrder(node));

  }


}
