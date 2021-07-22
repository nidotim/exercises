package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/crush/problem

import java.util.ArrayList;
import java.util.List;

//  5 3
//  1 2 100
//  2 5 100
//  3 4 100

//  200
public class ArrayManipulation {

  public long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    long max = 0;
    List<Long> numbers = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      numbers.add(0L);
    }
    for (List<Integer> query : queries) {
      Integer start = query.get(0);
      Integer end = query.get(1);
      Integer addNumber = query.get(2);
      for (int i = start - 1; i < end; i++) {
        Long number = numbers.get(i);
        number += addNumber;
        if (number > max) {
          max = number;
        }
        numbers.set(i, number);
      }
    }
    return max;
  }

  public long arrayManipulationWithAccumulatedSlope(int n, List<List<Integer>> queries) {
    // Write your code here
    long max = 0;
    List<Long> numbers = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      numbers.add(0L);
    }
    for (List<Integer> query : queries) {
      Integer start = query.get(0);
      Integer end = query.get(1);
      Integer addNumber = query.get(2);
      numbers.set(start - 1, numbers.get(start - 1) + addNumber);
      if (end < n) {
        numbers.set(end, numbers.get(end) - addNumber);
      }
    }
    long accumulatedNumber = 0;
    for (Long number : numbers) {
      accumulatedNumber += number;
      if (accumulatedNumber > max) {
        max = accumulatedNumber;
      }
    }
    return max;
  }
}
