package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

  //  https://www.hackerrank.com/challenges/quicksort1/problem
  //  STDIN       Function
  //  -----       --------
  //  5           arr[] size n =5
  //  4 5 3 7 2   arr =[4, 5, 3, 7, 2]

  //  3 2 4 5 7
  public List<Integer> quickSort1(List<Integer> arr) {
    // Write your code here
    Integer pivotIndex = 0;
    Integer pivot = arr.get(pivotIndex);
    List<Integer> leftPartition = new ArrayList<>();
    List<Integer> rightPartition = new ArrayList<>();
    List<Integer> equalPartition = new ArrayList<>();
    equalPartition.add(pivot);
    for (int i = 1; i < arr.size(); i++) {
      Integer number = arr.get(i);
      if (number < pivot) {
        leftPartition.add(number);
      } else if (number > pivot) {
        rightPartition.add(number);
      } else {
        equalPartition.add(number);
      }
    }
    leftPartition.addAll(equalPartition);
    leftPartition.addAll(rightPartition);
    return leftPartition;
  }


}
