package edu.nidotim.exercise.hackerrank.datastructure.trie;

// https://www.hackerrank.com/challenges/contacts/problem

//  add ed
//  add eddie
//  add edward
//  find ed
//  add edwina
//  find edw
//  find a

import edu.nidotim.exercise.util.datastructure.Trie;
import java.util.ArrayList;
import java.util.List;

// Three  operations include the names 'ed', 'eddie', and 'edward'.
// Next,  matches all  names.
// Note that it matches and counts the entire name 'ed'. Next, add 'edwina' and then find 'edw'.  names match: 'edward' and 'edwina'.
// In the final operation, there are  names that start with 'a'. Return the array .
public class Contact {

  public List<Integer> contacts(List<List<String>> queries) {
    // Write your code here

    Trie trie = new Trie();
    List<Integer> result = new ArrayList<>();
    for (List<String> query : queries) {
      String command = query.get(0);
      String value = query.get(1);
      switch (command) {
        case "add":
          trie.insert(value);
          break;
        case "find":
          result.add(trie.getNumberOfResult(value));
          break;
      }
    }
    return result;
  }

  public List<Integer> contactsDirectly(List<List<String>> queries) {
    // Write your code here

    Trie trie = new Trie();
    List<Integer> result = new ArrayList<>();
    for (List<String> query : queries) {
      String command = query.get(0);
      String value = query.get(1);
      switch (command) {
        case "add":
          trie.insert(value);
          break;
        case "find":
          result.add(trie.getNumberOfResultDirectly(value));
          break;
      }
    }
    return result;
  }
}
