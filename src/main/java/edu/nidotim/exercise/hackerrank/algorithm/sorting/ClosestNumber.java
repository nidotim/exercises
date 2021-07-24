package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumber {

  //  https://www.hackerrank.com/challenges/closest-numbers/problem
  //  4
  //  5 4 3 2

  //  2 3 3 4 4 5
  public List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    int closestDifference = Integer.MAX_VALUE;
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < arr.size() - 1; i++) {
      int leftOne = arr.get(i);
      int leftTwo = arr.get(i + 1);

      int leftDifference = Math.abs(leftOne - leftTwo);

      if (leftDifference < closestDifference) {
        closestDifference = leftDifference;
        result = new ArrayList<>();
        result.add(leftOne);
        result.add(leftTwo);
      } else if (leftDifference == closestDifference) {
        result.add(leftOne);
        result.add(leftTwo);
      }

//      if (rightDifference < minimunDifference) {
//        minimunDifference = rightDifference;
//        result = new ArrayList<>();
//        result.add(rightTwo);
//        result.add(rightOne);
//      } else if (rightDifference == minimunDifference) {
//        result.add(rightTwo);
//        result.add(rightOne);
//      }
//
//      if (leftRightDifference < minimunDifference) {
//        minimunDifference = leftRightDifference;
//        result = new ArrayList<>();
//        result.add(leftOne);
//        result.add(rightOne);
//      } else if (leftRightDifference == minimunDifference) {
//        result.add(leftOne);
//        result.add(rightOne);
//      }

//      rightPointer--;
    }
    return result;
  }


}
