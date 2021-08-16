package edu.nidotim.exercise.custom;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReorderLogTest {

  private static ReorderLog reorderLog;

  @BeforeClass
  public static void initClass() {
    reorderLog = new ReorderLog();
  }

  @Test
  public void testReorderLog() {
    List<String> logLines = Arrays
        .asList("a1 9 2 3 1", "g1 Act car", "zo4 4 7", "ab1 off KEY dog", "a8 act zoo",
            "C2 Act car", "C1 Act car car");

    List<String> expected = Arrays
        .asList("C2 Act car", "g1 Act car", "C1 Act car car", "a8 act zoo",
            "ab1 off KEY dog", "a1 9 2 3 1", "zo4 4 7");

    List<String> result = reorderLog.solution(logLines);

    Assert.assertEquals(expected, result);

  }
}
