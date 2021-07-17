package edu.nidotim.exercise.util.datastructure;

import java.util.List;

public class NodeUtil {

  public static Node insertBinarySearchTree(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node cur;
      if (data <= root.data) {
        cur = insertBinarySearchTree(root.left, data);
        root.left = cur;
      } else {
        cur = insertBinarySearchTree(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static Node createBinarySearchTreeNode(List<Integer> integerList) {
    Node root = null;
    for (Integer data : integerList) {
      root = insertBinarySearchTree(root, data);
    }
    return root;
  }

}
