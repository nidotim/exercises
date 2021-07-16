package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;

// https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
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
// 4 3 6 5 2 1
public class PostOrderTraversal {

  public String postOrder(Node root) {
//    System.out.println(traverse(root.left, root.right) + root.data);
    return traverse(root.left, root.right) + root.data;
  }

  private String traverse(Node left, Node right) {
    String result = "";
    if (left == null && right == null) {
      return "";
    }

    if (left != null) {
      result += traverse(left.left, left.right);
      result += String.valueOf(left.data) + " ";

    }
    if (right != null) {
      result += traverse(right.left, right.right);
      result += String.valueOf(right.data) + " ";
    }

    return result;

  }
}
