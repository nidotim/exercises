package edu.nidotim.exercise.util.datastructure;

public class Trie {

  private TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  public void insert(String word) {
    TrieNode current = root;
    for (char c : word.toCharArray()) {
      current = current.getChildren().computeIfAbsent(c, t -> new TrieNode());
      current.incrementNumberOfWords();

    }
    current.setEndOfWord(true);
  }

  public boolean insertNoPrefixSet(String word) {
    TrieNode current = root;
    for (char c : word.toCharArray()) {
      current = current.getChildren().computeIfAbsent(c, t -> new TrieNode());
      if (current.isEndOfWord()) {
        return false;
      }
      current.incrementNumberOfWords();
    }
    current.setEndOfWord(true);
    if (!current.getChildren().isEmpty()) {
      return false;
    }
    return true;
  }

  public boolean delete(String word) {
    return delete(root, word, 0);
  }

  public boolean containsNode(String word) {
    TrieNode current = root;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      TrieNode node = current.getChildren().get(ch);
      if (node == null) {
        return false;
      }
      current = node;
    }
    return current.isEndOfWord();
  }

  public int getNumberOfResultDirectly(String word) {
    TrieNode current = root;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      TrieNode node = current.getChildren().get(ch);
      if (node == null) {
        return 0;
      }
      current = node;
    }
    return current.getNumberOfWords();
  }

  public int getNumberOfResult(String word) {
    TrieNode current = root;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      TrieNode node = current.getChildren().get(ch);
      if (node == null) {
        return 0;
      }
      current = node;
    }
    return getNumberOfWords(current);
  }

  //
  private int getNumberOfWords(TrieNode node) {
    if (node == null) {
      return 0;
    }
    if (node.getChildren().isEmpty()) {
      return 1;
    }
    int numberOfLeaves = 0;
    if (node.isEndOfWord()) {
      numberOfLeaves++;
    }
    for (TrieNode childrenNode : node.getChildren().values()) {
      numberOfLeaves += getNumberOfWords(childrenNode);
    }
    return numberOfLeaves;
  }

  public boolean isEmpty() {
    return root == null;
  }

  private boolean delete(TrieNode current, String word, int index) {
    if (index == word.length()) {
      if (!current.isEndOfWord()) {
        return false;
      }
      current.setEndOfWord(false);
      return current.getChildren().isEmpty();
    }
    char ch = word.charAt(index);
    TrieNode node = current.getChildren().get(ch);
    if (node == null) {
      return false;
    }
    boolean shouldDeleteCurrentNode = delete(node, word, index + 1) && !node.isEndOfWord();

    if (shouldDeleteCurrentNode) {
      current.getChildren().remove(ch);
      return current.getChildren().isEmpty();
    }
    return false;
  }

}

