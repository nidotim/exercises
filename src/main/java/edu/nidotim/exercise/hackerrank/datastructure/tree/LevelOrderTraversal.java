package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import java.util.ArrayList;
import java.util.List;

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
// 1 2 5 3 6 4
public class LevelOrderTraversal {

  public String traverse(Node root) {
    if (root == null) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    sb.append(root.data);
    String result = String.valueOf(root.data);
    List<Node> nextLevelNode = new ArrayList<Node>();
    if (root.left != null) {
      result += " " + root.left.data;
      nextLevelNode.add(root.left);
    }
    if (root.right != null) {
      result += " " + root.right.data;
      nextLevelNode.add(root.right);
    }
    result += traverse(nextLevelNode);
    return result;
  }

  private String traverse(List<Node> nodeList) {
    if (nodeList.isEmpty()) {
      return "";
    }
    List<Node> nextLevelNode = new ArrayList<Node>();
    String result = "";
    for (Node node : nodeList) {
      Node left = node.left;
      Node right = node.right;
      if (left != null) {
        result += " " + left.data;
        nextLevelNode.add(left);
      }
      if (right != null) {
        result += " " + right.data;
        nextLevelNode.add(right);
      }
    }
    result += traverse(nextLevelNode);
    return result;
  }
}
