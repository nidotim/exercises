package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/array-left-rotation/problem

import java.util.ArrayList;
import java.util.List;

//  5 4
//  1 2 3 4 5

//  5 1 2 3 4

// d = 2
// arr = [1,2,3,4,5]
// arr' = [3,4,5,1,2]
public class LeftRotation {

  public List<Integer> rotateLeftWithNExponential(int d, List<Integer> arr) {
    if (arr == null || arr.isEmpty()) {
      return new ArrayList<>();
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < arr.size(); i++) {
      result.add(arr.get(i));
    }
    for (int i = 0; i < d; i++) {
      for (int j = 0; j < result.size() - 1; j++) {
        Integer temp = result.get(j);
        int swapIndex = j - 1;
        if (swapIndex < 0) {
          swapIndex = result.size() - 1;
        }
        result.set(j, result.get(swapIndex));
        result.set(swapIndex, temp);
      }
    }
    return result;
  }

  public List<Integer> rotateLeftWithAnotherList(int d, List<Integer> arr) {
    if (arr == null || arr.isEmpty()) {
      return new ArrayList<>();
    }
    List<Integer> result = new ArrayList<>(arr.size());
    for (int i = 0; i < arr.size(); i++) {
      result.add(0);
    }
    for (int i = 0; i < arr.size(); i++) {
      int swapIndex = i - (d % arr.size());
      if (swapIndex < 0) {
        swapIndex = arr.size() + swapIndex;
      }
      result.set(swapIndex, arr.get(i));
    }
    return result;
  }

  public List<Integer> rotateLeftWithoutAnotherList(int d, List<Integer> arr) {
    if (arr == null || arr.isEmpty()) {
      return new ArrayList<>();
    }
    int leftMove = d % arr.size();
    if (leftMove == 0) {
      return arr;
    }
    int index = 0;
    Integer swapElement = arr.get(index);
    boolean moveHalfSize = (arr.size() - leftMove == leftMove);
    for (int i = 0; i < arr.size(); i++) {
      int swapIndex = (arr.size() + index - leftMove) % arr.size();
      int swappedElement = arr.get(swapIndex);
      arr.set(swapIndex, swapElement);
      if (moveHalfSize) {
        arr.set(index, swappedElement);
        i++;
        index = (swapIndex + 1) % arr.size();
        swapElement = arr.get(index);
      } else {
        swapElement = swappedElement;
        index = swapIndex;
      }
    }
    return arr;
  }


}
