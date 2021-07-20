package edu.nidotim.exercise.util.datastructure;

public class HuffmanNode extends AbstractHuffmanNode {

  public HuffmanNode(AbstractHuffmanNode l, AbstractHuffmanNode r) {
    super(l.frequency + r.frequency);
    left = l;
    right = r;
  }
}