package edu.nidotim.exercise.util.datastructure;

import java.util.List;

public class NodeUtil {

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node cur;
      if (data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      } else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static Node createNode(List<Integer> integerList) {
    Node root = null;
    for (Integer data : integerList) {
      root = insert(root, data);
    }
    return root;
  }

}
