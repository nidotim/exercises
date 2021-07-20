package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.AbstractHuffmanNode;
import edu.nidotim.exercise.util.datastructure.NodeUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HuffmanDecodingTest {

  HuffmanDecoding huffmanDecoding;

  @Before
  public void before() {
    huffmanDecoding = new HuffmanDecoding();
  }

  @Test
  public void huffmanDecodingTest() {
    String test = "BCAAA";

    // we will assume that all our characters will have
    // code less than 256, for simplicity
    int[] charFreqs = new int[256];

    // read each character and record the frequencies
    for (char c : test.toCharArray()) {
      charFreqs[c]++;
    }

    AbstractHuffmanNode root = NodeUtil.buildTree(charFreqs);
    String s = "1001011";
    String result = huffmanDecoding.decode(s, root);
    String expectedResult = "ABACA";
    Assert.assertEquals(expectedResult, result);
  }

}
