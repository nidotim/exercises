package edu.nidotim.exercise.hackerrank.datastructure.util.datastructure;


import edu.nidotim.exercise.util.datastructure.Trie;
import org.junit.Assert;
import org.junit.Test;

public class TrieTest {

  @Test
  public void givenATrie_WhenAddingElements_ThenTrieContainsThoseElements() {
    Trie trie = createExampleTrie();
    
    Assert.assertFalse(trie.containsNode("3"));
    Assert.assertFalse(trie.containsNode("vida"));
    Assert.assertTrue(trie.containsNode("life"));
    Assert.assertTrue(trie.containsNode("is"));
    Assert.assertEquals(2, trie.getNumberOfResult("Program"));
  }

  private Trie createExampleTrie() {
    Trie trie = new Trie();

    trie.insert("Program");
    trie.insert("Programming");
    trie.insert("is");
    trie.insert("a");
    trie.insert("way");
    trie.insert("of");
    trie.insert("life");

    return trie;
  }

}
