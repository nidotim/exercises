package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;

// https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
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
// 1 2 3 4 5 6
public class InOrderTraversal {

  public String traverse(Node root) {
    String result = "";
    if (root == null) {
      return result;
    }
    result = String.valueOf(root.data);
    Node left = root.left;
    Node right = root.right;

    if (left == null && right == null) {
//      System.out.print(root.data + " ");
      return result;
    } else if (left != null && right == null) {
      result = traverse(left) + " " + root.data;
//      System.out.print(root.data + " ");
    } else if (left == null && right != null) {
//      System.out.print(root.data + " ");
//      traverse(right);
      result = root.data + " " + traverse(right);
    } else if (left != null && right != null) {
      result = traverse(left) + " " + root.data + " " + traverse(right);
//      traverse(left);
//      System.out.print(root.data + " ");
//      traverse(right);
    }
    return result;
  }

//  public String traverse(Node root) {
//    String result = "";
//    if (root == null) {
//      return result;
//    }
//    result = String.valueOf(root.data);
//    Node left = root.left;
//    Node right = root.right;
//
//    if (left == null && right == null) {
//      System.out.print(root.data + " ");
//    } else if (left != null && right == null) {
//      traverse(left);
//      System.out.print(root.data + " ");
//    } else if (left == null && right != null) {
//      System.out.print(root.data + " ");
//      traverse(right);
//    } else if (left != null && right != null) {
//      traverse(left);
//      System.out.print(root.data + " ");
//      traverse(right);
//    }
//
//    return result;
//  }

}
