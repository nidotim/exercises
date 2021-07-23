package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

//  https://www.hackerrank.com/challenges/insertionsort1/problem
//  5
//  2 4 6 8 3

//  2 4 6 8 8
//  2 4 6 6 8
//  2 4 4 6 8
//  2 3 4 6 8
public class InsertionSort {

  public List<List<Integer>> insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    List<List<Integer>> results = new ArrayList<>();
    for (int i = 1; i < arr.size(); i++) {
      int key = arr.get(i);
      int j = i - 1;
      while (j >= 0 && arr.get(j) > key) {
        arr.set(j + 1, arr.get(j));
        j--;
        List<Integer> result = new ArrayList<>();
        for (Integer number : arr) {
          result.add(number);
        }
        results.add(result);
      }
      arr.set(j + 1, key);
      if (i != j + 1) {
        results.add(arr);
      }
    }

    for (List<Integer> result : results) {
      StringBuilder sb = new StringBuilder();
      for (Integer number : result) {
        sb.append(number).append(" ");
      }
      if (sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1);
      }
      System.out.println(sb.toString());
    }
    for (Integer number : arr) {
      System.out.println(number);
    }
    return results;
  }

}
