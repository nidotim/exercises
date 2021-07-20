package edu.nidotim.exercise.util.datastructure;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

  private final Map<Character, TrieNode> children = new HashMap<>();
  private boolean endOfWord;
  private int numberOfWords = 0;

  public Map<Character, TrieNode> getChildren() {
    return children;
  }

  public boolean isEndOfWord() {
    return endOfWord;
  }

  public void setEndOfWord(boolean endOfWord) {
    this.endOfWord = endOfWord;
  }

  public int getNumberOfWords() {
    return numberOfWords;
  }

  public void incrementNumberOfWords() {
    numberOfWords++;
  }

  public void decrementNumberOfWords() {
    numberOfWords--;
  }

}

