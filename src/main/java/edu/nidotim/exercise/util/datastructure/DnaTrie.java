package edu.nidotim.exercise.util.datastructure;

public class DnaTrie {

  private DnaTrieNode root;

  public DnaTrie() {
    root = new DnaTrieNode();
  }

  public void insert(int index, String word, int health) {
    DnaTrieNode current = root;
    for (char c : word.toCharArray()) {
      current = current.getChildren().computeIfAbsent(c, t -> new DnaTrieNode());
    }
    current.setEndOfWord(true);
    current.addIndex(index);
    current.addHealth(health);
  }

  public DnaTrieNode getHealth(String word, int startIndex, int endIndex) {
    DnaTrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      DnaTrieNode node = current.getChildren().get(ch);
      if (node == null) {
        return null;
      }
      current = node;
    }
    return current;
  }


}

