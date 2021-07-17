package edu.nidotim.exercise.hackerrank.datastructure.tree;

import edu.nidotim.exercise.util.datastructure.Node;

public class BinarySearchTreeInsertion {

  public Node insert(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }
    if (root.data > data) {
      if (root.left == null) {
        root.left = new Node(data);
        return root;
      } else {
        insert(root.left, data);
      }
    } else if (root.data < data) {
      if (root.right == null) {
        root.right = new Node(data);
        return root;
      } else {
        insert(root.right, data);
      }
    }
    return root;
  }


}
