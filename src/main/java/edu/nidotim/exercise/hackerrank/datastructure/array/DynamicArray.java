package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/dynamic-array/problem

import java.util.ArrayList;
import java.util.List;

//  2 5
//  1 0 5
//  1 1 7
//  1 0 3
//  2 1 0
//  2 1 1

//  7
//  3
public class DynamicArray {

  public List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
    List<Integer> results = new ArrayList<>();
    List<List<Integer>> dynamicArray = new ArrayList<>(n);
    int lastAnswer = 0;
    for (int i = 0; i < n; i++) {
      List<Integer> array = new ArrayList<>();
      dynamicArray.add(array);
    }
    for (List<Integer> query : queries) {
      Integer command = query.get(0);
      Integer x = query.get(1);
      Integer y = query.get(2);
      if (command == 1) {
        int idx = (x ^ lastAnswer) % n;
        List<Integer> array = dynamicArray.get(idx);
        array.add(y);
      } else if (command == 2) {
        int idx = (x ^ lastAnswer) % n;
        lastAnswer = dynamicArray.get(idx).get(y % dynamicArray.get(idx).size());
        results.add(lastAnswer);
      } else {
        throw new IllegalArgumentException();
      }
    }
    return results;
  }

}
