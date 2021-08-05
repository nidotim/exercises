package edu.nidotim.exercise.hackerrank.algorithm.search;


import java.util.List;

//  https://www.hackerrank.com/challenges/minimum-loss/problem
//  4 5 6 7 8 1 2 3
//  5
//  8

//  4
public class BinarySearchWithShifts {

  public int binarySearchWithShits(List<Integer> list, int shift, int search) {
    // Write your code here
    int startIndex = 0;
    int endIndex = list.size() - 1;
    while (startIndex <= endIndex) {
      int originalSearchIndex = (endIndex + startIndex) / 2;
      int searchIndex = originalSearchIndex + shift;
      if (searchIndex >= list.size()) {
        searchIndex -= list.size();
      }
      if (list.get(searchIndex).equals(search)) {
        return searchIndex;
      } else if (list.get(searchIndex) > search) {
        endIndex = originalSearchIndex - 1;
      } else if (list.get(searchIndex) < search) {
        startIndex = originalSearchIndex + 1;
      }
    }
    return -1;
  }


}
