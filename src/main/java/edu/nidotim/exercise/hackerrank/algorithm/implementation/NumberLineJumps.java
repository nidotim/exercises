package edu.nidotim.exercise.hackerrank.algorithm.implementation;

//  https://www.hackerrank.com/challenges/kangaroo/problem
//  0 3 4 2

//  YES
public class NumberLineJumps {

  public String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    // int numberOfJumps;
    // x1 + (v1 * numberOfJumps) = x2 + (v2 * numberOfJumps);
    // 0 + 3numberOfJumps = 4 + 2numberOfJumps;
    // numberOfJumps = 4

    // v1 * numberOfJumps - v2 * numberOfJumps = x2 - x1
    // numberOfJumps (v1 - v2) = x2 - x1;
    // numberOfJumps = (x2 - x1 ) / (v1 - v2)

    if (v1 - v2 == 0 && x2 != x1) {
      return "NO";
    } else if (v1 - v2 == 0 && x2 == x1) {
      return "YES";
    } else if ((x2 - x1) / (v1 - v2) < 0) {
      return "NO";
    } else if (((x2 - x1) % (v1 - v2)) == 0) {
      return "YES";
    } else {
      return "NO";
    }
  }

}
