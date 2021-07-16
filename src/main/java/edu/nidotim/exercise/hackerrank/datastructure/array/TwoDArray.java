package edu.nidotim.exercise.hackerrank.datastructure.array;

// https://www.hackerrank.com/challenges/2d-array/problem

import java.util.List;

public class TwoDArray {

  /*
   * Complete the 'hourglassSum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */
  public int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.size() - 2; i++) {
      for (int j = 0; j < arr.get(i).size() - 2; j++) {
        int value = getHourGlassSum(arr, i, j);
        if (max < value) {
          max = value;
        }
      }
    }
    return max;
  }

  public static int getHourGlassSum(List<List<Integer>> arr, int i, int j) {
    int value = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
        + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1)
        + arr.get(i + 2).get(j + 2);
    return value;
  }


}
