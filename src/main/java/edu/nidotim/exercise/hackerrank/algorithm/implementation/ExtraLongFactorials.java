package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import java.math.BigInteger;

//  https://www.hackerrank.com/challenges/extra-long-factorials/problem
//  25

//  15511210043330985984000000
public class ExtraLongFactorials {

  public String extraLongFactorials(int n) {
    // Write your code here
    BigInteger total = BigInteger.valueOf(1);
    while (n > 1) {
      total = total.multiply(BigInteger.valueOf(n));
      n--;
    }
    System.out.println("--->" + total);
    return String.valueOf(total.toString());
  }

}
