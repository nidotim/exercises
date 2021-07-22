package edu.nidotim.exercise.hackerrank.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;

//    STDIN   Function
//    -----   --------
//    10      q = 10 (number of queries)
//    1 42    1st query, enqueue 42
//    2       dequeue front element
//    1 14    enqueue 42
//    3       print the front element
//    1 28    enqueue 28
//    3       print the front element
//    1 60    enqueue 60
//    1 78    enqueue 78
//    2       dequeue front element
//    2       dequeue front element

// 14
// 14
public class QueueUsingTwoStacks {

  public static void main(String[] args) throws IOException {
    QueueUsingTwoStacks queueUsingTwoStacks = new QueueUsingTwoStacks();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
    List<String> commands = new ArrayList<>();
    IntStream.range(0, arrCount).forEach(i -> {
      try {
        commands.add(bufferedReader.readLine());
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });
    List<Integer> results = queueUsingTwoStacks.queueUsingTwoStacks(commands);

    for (Integer result : results) {
      System.out.println(result);
    }
    bufferedReader.close();
  }

  public List<Integer> queueUsingTwoStacks(List<String> commands) {
    List<Integer> results = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> queue = new Stack<>();
    for (String command : commands) {
      if (command.startsWith("1")) {
        Integer value = Integer.parseInt(command.substring(2, command.length()));
        stack.push(value);
      } else if (command.equals("2")) {
        if (queue.isEmpty()) {
          pushToQueueStack(stack, queue);
        }
        if (!queue.isEmpty()) {
          queue.pop();
        }
      } else if (command.equals("3")) {
        if (queue.isEmpty()) {
          pushToQueueStack(stack, queue);
        }
        if (!queue.isEmpty()) {
          results.add(queue.peek());
        }

      } else {
        throw new IllegalArgumentException();
      }
    }
    return results;
  }

  public void pushToQueueStack(Stack<Integer> stack, Stack<Integer> queue) {
    while (!stack.isEmpty()) {
      queue.push(stack.pop());
    }
  }

  public List<Integer> queueUsingQueue(List<String> commands) {
    List<Integer> results = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();
    for (String command : commands) {
      if (command.startsWith("1")) {
        Integer value = Integer.parseInt(command.substring(2, command.length()));
        queue.add(value);
      } else if (command.equals("2")) {
        queue.poll();
      } else if (command.equals("3")) {
        results.add(queue.peek());
      } else {
        throw new IllegalArgumentException();
      }
    }
    return results;
  }

}
