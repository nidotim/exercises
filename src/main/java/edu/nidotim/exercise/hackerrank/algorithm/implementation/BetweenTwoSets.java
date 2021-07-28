package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import java.util.List;

//  https://www.hackerrank.com/challenges/between-two-sets/problem
//  2 3
//  2 4
//  16 32 96

//  3

//  2 and 4 divide evenly into 4, 8, 12 and 16.
//  4, 8 and 16 divide evenly into 16, 32, 96.
//
//  4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.
public class BetweenTwoSets {

  public int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int lcmA = lcm(a);
    int gcdB = gcd(b);

    int totalX = 0;
//    for (int i = lcmA; i <= gcdB; i += i) {
//      if (gcdB % i == 0) {
//        totalX++;
//      }
//    }
    for (int i = lcmA, j = 2; i <= gcdB; i = lcmA * j, j++) {
      if (gcdB % i == 0) {
        totalX++;
      }
    }
    return totalX;
  }

  private int gcd(List<Integer> list) {
    int result = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      result = gcd(result, list.get(i));
    }
    return result;
  }

  private int gcd(int a, int b) {
    while (b > 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  private int lcm(List<Integer> list) {
    int result = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      result = lcm(result, list.get(i));
    }
    return result;
  }

  private int lcm(int a, int b) {
    return a * (b / gcd(a, b));
  }

}
