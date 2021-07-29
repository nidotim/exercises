package edu.nidotim.exercise.hackerrank.algorithm.strings;

//  https://www.hackerrank.com/challenges/reduced-string/problem

// aaabccddd

import java.util.Stack;

// abd
public class SuperReducedString {

  public String superReducedString(String s) {
    // Write your code here
    Stack<Character> stack = new Stack<>();
    for (char character : s.toCharArray()) {
      if (!stack.isEmpty() && stack.peek() == character) {
        stack.pop();
      } else {
        stack.add(character);
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.insert(0, stack.pop());
    }
    if (sb.length() == 0) {
      sb.append("Empty String");
    }
    return sb.toString();
  }

}
