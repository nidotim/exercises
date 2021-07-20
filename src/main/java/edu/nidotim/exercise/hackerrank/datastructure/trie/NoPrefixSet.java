package edu.nidotim.exercise.hackerrank.datastructure.trie;

// https://www.hackerrank.com/challenges/no-prefix-set/problem


import edu.nidotim.exercise.util.datastructure.Trie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//    STDIN       Function
//    -----       --------
//    7            words[] size n = 7
//    aab          words = ['aab', 'defgab', 'abcde', 'aabcde', 'bbbbbbbbbb', 'jabjjjad']
//    defgab
//    abcde
//    aabcde
//    cedaaa
//    bbbbbbbbbb
//    jabjjjad
//
//  BAD SET
//  aabcde
public class NoPrefixSet {

  public List<String> contacts(List<String> words) {
    // Write your code here

    Trie trie = new Trie();
    List<Integer> result = new ArrayList<>();
    for (String word : words) {
      boolean noPrefixSet = trie.insertNoPrefixSet(word);
      if (!noPrefixSet) {
        return Arrays.asList("BAD SET", word);
      }
    }
    return Arrays.asList("GOOD SET");
  }

}
