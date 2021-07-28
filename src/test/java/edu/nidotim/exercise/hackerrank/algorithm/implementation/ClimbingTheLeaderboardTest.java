package edu.nidotim.exercise.hackerrank.algorithm.implementation;

//  https://www.hackerrank.com/challenges/kangaroo/problem
//  0 3 4 2

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//  YES
public class ClimbingTheLeaderboardTest {


  ClimbingTheLeaderboard climbingTheLeaderboard;

  @Before
  public void before() {
    climbingTheLeaderboard = new ClimbingTheLeaderboard();
  }

  @Test
  public void testClimbingTheLeaderboard() {
    List<Integer> ranked = Arrays.asList(100, 90, 90, 80, 75, 60);
    List<Integer> player = Arrays.asList(50, 65, 77, 90, 102);

    List<Integer> expectedResult = Arrays.asList(6, 5, 4, 2, 1);
    List<Integer> results = climbingTheLeaderboard.climbingLeaderboard(ranked, player);

    Assert.assertEquals(expectedResult, results);
  }


}
