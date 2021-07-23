package edu.nidotim.exercise.hackerrank.algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {

  //  https://www.hackerrank.com/challenges/countingsort1/problem
  //  100
  //  63 25 73 1 98 73 56 84 86 57 16 83 8 25 81 56 9 53 98 67 99 12 83 89 80 91 39 86 76 85 74 39 25 90 59 10 94 32 44 3 89 30 27 79 46 96 27 32 18 21 92 69 81 40 40 34 68 78 24 87 42 69 23 41 78 22 6 90 99 89 50 30 20 1 43 3 70 95 33 46 44 9 69 48 33 60 65 16 82 67 61 32 21 79 75 75 13 87 70 33

  //  1 1 3 3 6 8 9 9 10 12 13 16 16 18 20 21 21 22 23 24 25 25 25 27 27 30 30 32 32 32 33 33 33 34 39 39 40 40 41 42 43 44 44 46 46 48 50 53 56 56 57 59 60 61 63 65 67 67 68 69 69 69 70 70 73 73 74 75 75 76 78 78 79 79 80 81 81 82 83 83 84 85 86 86 87 87 89 89 89 90 90 91 92 94 95 96 98 98 99 99
  public List<Integer> countingSort(List<Integer> arr) {
    // 0 <= arr[i] < 100
    int[] result = new int[100];
    for (Integer number : arr) {
      result[number] = result[number] + 1;
    }
    return Arrays.stream(result)
        .boxed()
        .collect(Collectors.toList());
  }

  public List<Integer> countingSort2(List<Integer> arr) {
    // 0 <= arr[i] < 100
    int[] result = new int[100];
    for (Integer number : arr) {
      result[number] = result[number] + 1;
    }
    List<Integer> results = new ArrayList<>(arr.size());
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i]; j++) {
        results.add(i);
      }
    }
    return results;
  }

  public String fullCountingSort(List<List<String>> arr) {
    // Write your code here
    List<List<String>> results = new ArrayList<>();
//    for (int i = 0; i < 100; i++) {
//      results.add(new ArrayList<>());
//    }
    int replaceStringIndex = 0;
    for (List<String> value : arr) {
      Integer index = Integer.parseInt(value.get(0));
      String word = value.get(1);
      expandListIfNecessary(index, results);
      if (replaceStringIndex < (arr.size() / 2)) {
        word = "-";
        replaceStringIndex++;
      }
      results.get(index).add(word);
    }
    StringBuilder sb = new StringBuilder();
    for (List<String> array : results) {
      for (String string : array) {
        sb.append(string).append(" ");
      }
    }
    if (sb.length() > 0) {
      sb.deleteCharAt(sb.length() - 1);
    }
    System.out.print(sb.toString());

    return sb.toString();
  }

  public void expandListIfNecessary(Integer index, List<List<String>> results) {
    while (results.size() < index + 1) {
      results.add(new ArrayList<>());
    }
  }


}
