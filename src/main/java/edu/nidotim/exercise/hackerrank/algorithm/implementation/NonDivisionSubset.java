package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//  https://www.hackerrank.com/challenges/non-divisible-subset/problem
//  4 3      S[] size n = 4, k = 3
//  1 7 2 4  S = [1, 7, 2, 4]

//  3
public class NonDivisionSubset {

  public int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here
    int maxSubset = 0;
    List<List<Integer>> remainderList = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      remainderList.add(new ArrayList<>());
    }
    for (Integer number : s) {
      int remainder = number % k;
      remainderList.get(remainder).add(number);
    }

    int startIndex = 1;
    int endIndex = remainderList.size() - 1;
    while (startIndex < endIndex) {
      int sizeA = remainderList.get(startIndex).size();
      int sizeB = remainderList.get(endIndex).size();
      maxSubset += Math.max(sizeA, sizeB);
      startIndex++;
      endIndex--;
    }
    System.out.println("-=----." + maxSubset);
    if (remainderList.get(0).size() > 0) {
      maxSubset++;
    }
    System.out.println("-=----." + maxSubset);
    if (k % 2 == 0) {
      if (remainderList.get(remainderList.size() / 2).size() > 0) {
        maxSubset++;
      }
    }
    System.out.println("-=----." + maxSubset);
    for (
        int i = 0; i < remainderList.size(); i++) {
      System.out.println("remainder: " + i + ", size:" + remainderList.get(i).size());
    }
    return maxSubset;
  }


  public int nonDivisibleSubset2(int k, List<Integer> s) {
    // Write your code here
    int maxSubset = 0;
    for (int i = 0; i < s.size(); i++) {
      Set<Integer> remainders = new HashSet<>();
      Set<Integer> numbers = new HashSet<>();
      numbers.add(s.get(i));
      remainders.add(s.get(i) % k);
      for (int j = i + 1; j < s.size(); j++) {
        int number = s.get(j);
        if (remainders.contains((k - (number % k)) % k)) {
          System.out.println("===== number" + number);
          continue;
        }
        Integer remainder = number % k;
        System.out.println("-----> " + number + ", " + remainder);
        remainders.add(remainder);
        numbers.add(number);
      }
      for (Integer remainder : remainders) {
        System.out.println("remainder: " + remainder);
      }

      for (Integer number : numbers) {
        System.out.println("number list: " + number);
      }
      if (numbers.size() > maxSubset) {
        maxSubset = numbers.size();
      }
    }
    return maxSubset;
  }

}
