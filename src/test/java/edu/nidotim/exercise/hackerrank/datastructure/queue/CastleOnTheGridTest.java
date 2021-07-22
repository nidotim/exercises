package edu.nidotim.exercise.hackerrank.datastructure.queue;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CastleOnTheGridTest {

  CastleOnTheGrid castleOnTheGrid;

  @Before
  public void before() {
    castleOnTheGrid = new CastleOnTheGrid();
  }

  @Test
  public void CastleOnTheGridTest() {
    List<String> grid = Arrays.asList(
        ".X.",
        ".X.",
        "..."
    );
    int startX = 0;
    int startY = 0;
    int goalX = 0;
    int goalY = 2;

    int result = castleOnTheGrid.minimumMoves(grid, startX, startY, goalX, goalY);
    int expectedResult = 3;
    Assert.assertEquals(expectedResult, result);
  }

}
