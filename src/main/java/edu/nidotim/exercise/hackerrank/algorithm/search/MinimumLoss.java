package edu.nidotim.exercise.hackerrank.algorithm.search;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//  https://www.hackerrank.com/challenges/minimum-loss/problem
//  3
//  5 10 3

//  2
public class MinimumLoss {

  public int minimumLoss(List<Long> price) {
    // Write your code here
    long minimumLoss = Integer.MAX_VALUE;
    Map<Long, Integer> index = new HashMap<>();
    for (int i = 0; i < price.size(); i++) {
      index.put(price.get(i), i);
    }

    Collections.sort(price, Collections.reverseOrder());
    for (int i = 0; i < price.size() - 1; i++) {
      if (index.get(price.get(i)) > index.get(price.get(i + 1))) {
        continue;
      }
      long diff = price.get(i) - price.get(i + 1);
      if (diff < minimumLoss) {
        minimumLoss = diff;
      }
    }
    return (int) minimumLoss;
  }


}
