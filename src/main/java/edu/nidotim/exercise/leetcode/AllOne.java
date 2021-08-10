package edu.nidotim.exercise.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Your AllOne object will be instantiated and called as such: AllOne obj = new AllOne();
 * obj.inc(key); obj.dec(key); String param_3 = obj.getMaxKey(); String param_4 = obj.getMinKey();
 */
public class AllOne {

  private Map<String, Integer> wordCountMap;
  private TreeMap<Integer, Set<String>> sortedCount;

  /**
   * Initialize your data structure here.
   */
  public AllOne() {
    wordCountMap = new HashMap();
    sortedCount = new TreeMap<>();
  }

  /**
   * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
   */
  public void inc(String key) {
    Integer count = wordCountMap.get(key);
    if (count == null) {
      count = 0;
    }
    Set<String> stringSet = sortedCount.get(count);
    if (stringSet == null) {
      stringSet = new HashSet<>();
    } else {
      stringSet.remove(key);
      if (stringSet.isEmpty()) {
        sortedCount.remove(count);
      }
    }

    count++;
    wordCountMap.put(key, count);
    stringSet = sortedCount.get(count);
    if (stringSet == null) {
      stringSet = new HashSet<>();
    }
    stringSet.add(key);
    sortedCount.put(count, stringSet);
  }

  /**
   * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
   */
  public void dec(String key) {
    Integer count = wordCountMap.get(key);
    if (count == null) {
      return;
    }
    Set<String> stringSet = sortedCount.get(count);
    stringSet.remove(key);
    if (stringSet.isEmpty()) {
      sortedCount.remove(count);
    }
    if (count == 1) {
      wordCountMap.remove(key);
    } else {
      count--;
      wordCountMap.put(key, count);
      stringSet = sortedCount.get(count);
      if (stringSet == null) {
        stringSet = new HashSet<>();
      }
      stringSet.add(key);
      sortedCount.put(count, stringSet);
    }
  }

  /**
   * Returns one of the keys with maximal value.
   */
  public String getMaxKey() {
    if (sortedCount.isEmpty()) {
      return "";
    }
    return sortedCount.get(sortedCount.lastKey()).iterator().next();
  }

  /**
   * Returns one of the keys with Minimal value.
   */
  public String getMinKey() {
    if (sortedCount.isEmpty()) {
      return "";
    }
    return sortedCount.get(sortedCount.firstKey()).iterator().next();
  }
}
