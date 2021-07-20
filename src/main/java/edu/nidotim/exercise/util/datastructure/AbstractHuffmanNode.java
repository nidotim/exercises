package edu.nidotim.exercise.util.datastructure;

public abstract class AbstractHuffmanNode implements Comparable<AbstractHuffmanNode> {

  public int frequency; // the frequency of this tree
  public char data;
  public AbstractHuffmanNode left, right;

  public AbstractHuffmanNode(int freq) {
    frequency = freq;
  }

  // compares on the frequency
  public int compareTo(AbstractHuffmanNode tree) {
    return frequency - tree.frequency;
  }
}