package edu.nidotim.exercise.hackerrank.datastructure.tree;

import edu.nidotim.exercise.util.datastructure.Node;

public class BinarySearchTreeLowestCommonAncestor {

  public Node lca(Node root, int v1, int v2) {
    // Write your code here.
    if (v1 == root.data && v2 == root.data) {
      return root;
    } else if ((v1 > root.data && v2 < root.data) || (v1 < root.data && v2 > root.data)) {
      return root;
    } else if (v1 < root.data && v2 < root.data) {
      if (root.left == null) {
        return root;
      }
      root = root.left;
      return lca(root, v1, v2);
    } else if (v1 > root.data && v2 > root.data) {
      if (root.right == null) {
        return root;
      }
      root = root.right;
      return lca(root, v1, v2);
    }
    return root;
  }

  public Node lcaUsingDFS(Node root, int v1, int v2) {
    if (root.data == v1 || root.data == v2) {
      return root;
    }
    Node left = root.left;
    Node right = root.right;
    if (left == null && right == null) {
      return null;
    }
    if (left != null) {
      left = lcaUsingDFS(left, v1, v2);
    }
    if (right != null) {
      right = lcaUsingDFS(right, v1, v2);
    }
    if (left != null && right != null) {
      return root;
    } else if (left == null) {
      return right;
    } else {
      return left;
    }
  }
}
