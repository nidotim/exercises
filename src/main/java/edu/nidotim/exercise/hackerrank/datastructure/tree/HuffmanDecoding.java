package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.AbstractHuffmanNode;

// https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
public class HuffmanDecoding {

  public String decode(String s, AbstractHuffmanNode root) {
    String result = "";
    AbstractHuffmanNode pointer = root;
    for (char direction : s.toCharArray()) {
      if (direction == '0') {
        pointer = pointer.left;
      } else if (direction == '1') {
        pointer = pointer.right;
      }
      if (pointer.data != 0) {
        result += pointer.data;
        pointer = root;
      }
    }

    return result;
  }


}
