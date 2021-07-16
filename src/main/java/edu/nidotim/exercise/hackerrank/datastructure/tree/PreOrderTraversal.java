package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;

// https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
// Sample Input
//    1
//     \
//      2
//       \
//        5
//      /  \
//     3    6
//      \
//       4
//
//
// Sample Output
// 1 2 5 3 4 6
public class PreOrderTraversal {

  public String preOrder(Node root) {
    // System.out.println(root.data + " " + preOrder(root.left, root.right));
    return root.data + " " + preOrder(root.left, root.right).trim();
  }

  private String preOrder(Node left, Node right) {
    if (left == null && right == null) {
      return "";
    }

    String value = "";
    if (left != null) {
      value = left.data + " " + value + preOrder(left.left, left.right);
    }
    if (right != null) {
      value = value + right.data + " " + preOrder(right.left, right.right);
    }
    return value;
  }
}
