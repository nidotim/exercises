package edu.nidotim.exercise.hackerrank.datastructure.queue;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueUsingTwoStacksTest {

  QueueUsingTwoStacks queueUsingTwoStacks;

  @Before
  public void before() {
    queueUsingTwoStacks = new QueueUsingTwoStacks();
  }

  @Test
  public void QueueUsingTwoStacksTest() {
    List<String> commands = Arrays.asList(
        "1 42",
        "2",
        "1 14",
        "3",
        "1 28",
        "3",
        "1 60",
        "1 78",
        "2",
        "2"
    );

    List<Integer> result = queueUsingTwoStacks.queueUsingTwoStacks(commands);
    List<Integer> expectedResult = Arrays.asList(14, 14);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void QueueUsingQueueTest() {
    List<String> commands = Arrays.asList(
        "1 42",
        "2",
        "1 14",
        "3",
        "1 28",
        "3",
        "1 60",
        "1 78",
        "2",
        "2"
    );

    List<Integer> result = queueUsingTwoStacks.queueUsingQueue(commands);
    List<Integer> expectedResult = Arrays.asList(14, 14);
    Assert.assertEquals(expectedResult, result);
  }
}
