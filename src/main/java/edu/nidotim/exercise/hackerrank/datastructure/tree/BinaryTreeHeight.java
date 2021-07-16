package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;

// https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
public class BinaryTreeHeight {

  public int height(Node root) {
    Node left = root.left;
    Node right = root.right;
    int leftHeight = 0;
    int rightHeight = 0;
    if (left == null && right == null) {
      return 0;
    }
    if (left != null) {
      leftHeight += height(left) + 1;
    }
    if (right != null) {
      rightHeight += height(right) + 1;
    }
    if (leftHeight > rightHeight) {
      return leftHeight;
    }
    return rightHeight;
  }

}
