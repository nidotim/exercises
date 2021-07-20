package edu.nidotim.exercise.util.datastructure;

public class HuffmanLeaf extends AbstractHuffmanNode {

  public HuffmanLeaf(int freq, char val) {
    super(freq);
    data = val;
  }
}