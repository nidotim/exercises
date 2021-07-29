package edu.nidotim.exercise.hackerrank.algorithm.strings;

//  https://www.hackerrank.com/challenges/camelcase/problem

// saveChangesInTheEditor

// 5
public class CamelCase {

  public int camelcase(String s) {
    // Write your code here
    int count = 1;
    for (int asciiCode : s.toCharArray()) {
      if (asciiCode >= 65 && asciiCode <= 90) {
        count++;
      }
    }
    return count;
  }

}
