package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/sparse-arrays/problem

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//  4
//  aba
//  baba
//  aba
//  xzxb
//  3
//  aba
//  xzxb
//  ab

//  2
//  1
//  0
public class SparseArrays {

  public List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    Map<String, Integer> wordsCount = new HashMap<>();
    for (String string : strings) {
      Integer count = wordsCount.get(string);
      if (count == null) {
        count = 0;
      }
      count++;
      wordsCount.put(string, count);
    }
    List<Integer> result = new ArrayList<>();
    for (String query : queries) {
      Integer count = wordsCount.get(query);
      if (count == null) {
        count = 0;
      }
      result.add(count);
    }

    return result;

  }


}
