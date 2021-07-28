package edu.nidotim.exercise.hackerrank.algorithm.implementation;


import java.util.List;

//  https://www.hackerrank.com/challenges/the-hurdle-race/problem
//  5 4
//  1 6 3 5 2

//  2
public class HurdleRace {

  public int hurdleRace(int k, List<Integer> height) {
    // Write your code here
    int potion = 0;
    for (Integer h : height) {
      if (h > k) {
        potion += h - k;
        k = h;
      }
    }
    return potion;
  }


}
