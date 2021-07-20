package edu.nidotim.exercise.util.datastructure;

import java.util.List;
import java.util.PriorityQueue;

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


  public static AbstractHuffmanNode buildTree(int[] charFreqs) {
    PriorityQueue<AbstractHuffmanNode> trees = new PriorityQueue<>();
    // initially, we have a forest of leaves
    // one for each non-empty character
    for (int i = 0; i < charFreqs.length; i++) {
      if (charFreqs[i] > 0) {
        trees.offer(new HuffmanLeaf(charFreqs[i], (char) i));
      }
    }

    assert trees.size() > 0;

    // loop until there is only one tree left
    while (trees.size() > 1) {
      // two trees with least frequency
      AbstractHuffmanNode a = trees.poll();
      AbstractHuffmanNode b = trees.poll();

      // put into new node and re-insert into queue
      trees.offer(new HuffmanNode(a, b));
    }

    return trees.poll();
  }

}
