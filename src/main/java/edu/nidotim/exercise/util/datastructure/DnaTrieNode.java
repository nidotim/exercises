package edu.nidotim.exercise.util.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DnaTrieNode {

  private final Map<Character, DnaTrieNode> children = new HashMap<>();
  private boolean endOfWord;
  private List<Integer> indexList = new ArrayList<>();
  private List<Integer> healthList = new ArrayList<>();

  public Map<Character, DnaTrieNode> getChildren() {
    return children;
  }

  public boolean isEndOfWord() {
    return endOfWord;
  }

  public void setEndOfWord(boolean endOfWord) {
    this.endOfWord = endOfWord;
  }

  public void addIndex(int index) {
    indexList.add(index);
  }

  public void addHealth(int health) {
    healthList.add(health);
  }

  public List<Integer> getIndexList() {
    return indexList;
  }

  public List<Integer> getHealthList() {
    return healthList;
  }
}

