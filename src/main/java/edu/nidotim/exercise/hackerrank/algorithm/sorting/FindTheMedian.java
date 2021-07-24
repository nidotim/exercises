package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.Collections;
import java.util.List;

public class FindTheMedian {

  //  https://www.hackerrank.com/challenges/find-the-median/problem
  //  7
  //  0 1 2 4 6 5 3

  //  3

  public int findMedian(List<Integer> arr) {
    // Write your code here
    if (arr.size() == 1) {
      return arr.get(1);
    }
    Collections.sort(arr);
    return arr.get((arr.size() / 2));

  }


}
