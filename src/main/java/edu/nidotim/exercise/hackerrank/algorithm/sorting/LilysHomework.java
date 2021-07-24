package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.List;

public class LilysHomework {

  //  https://www.hackerrank.com/challenges/lilys-homework/problem
  //  STDIN       Function
  //  -----       --------
  //  4           arr[]size n = 4
  //  2 5 3 1     arr = [2, 5, 3, 1]

  //  2

  public int lilysHomework(List<Integer> arr) {
    // Write your code here
    int swap = 0;
    for (int i = 0; i < arr.size(); i++) {
      int min = arr.get(i);
      int minIndex = i;
      for (int j = i; j < arr.size(); j++) {
        if (arr.get(j) < min) {
          min = arr.get(j);
          minIndex = j;
        }
      }
      if (minIndex != i) {
        swap++;
        int temp = arr.get(i);
        arr.set(i, min);
        arr.set(minIndex, temp);
      }
    }
    return swap;
  }


}
