package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//  https://www.hackerrank.com/challenges/big-sorting/problem
//  6
//  31415926535897932384626433832795
//  1
//  3
//  10
//  3
//  5

//  1
//  3
//  3
//  5
//  10
//  31415926535897932384626433832795
public class BigSorting {

  public List<String> bigSorting(List<String> unsorted) {
    // Write your code here
    Collections.sort(unsorted, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) {
          return o1.length() - o2.length();
        } else {
          return o1.compareTo(o2);
        }
      }
    });
    return unsorted;
  }

}
