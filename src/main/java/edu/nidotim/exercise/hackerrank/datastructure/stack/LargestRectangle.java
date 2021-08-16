package edu.nidotim.exercise.hackerrank.datastructure.stack;

import java.util.Stack;

// https://www.hackerrank.com/challenges/largest-rectangle/problem
public class LargestRectangle {

  public LargestRectangle() {

  }

  public int solution(int[] h) {
    System.out.println("======= starting");
    int maxArea = 0;
    Stack<int[]> stacks = new Stack();
    for (int i = 0; i < h.length; i++) {
      if (stacks.isEmpty()) {
        stacks.push(new int[]{i + 1, h[i]});
        maxArea = Math.max(maxArea, h[i] * i + 1);
      } else if (h[i] >= stacks.peek()[1]) {
        stacks.push(new int[]{i + 1, h[i]});
      } else if (h[i] < stacks.peek()[1]) {
        int[] base = stacks.pop();
        if (stacks.isEmpty()) {
          stacks.push(base);
        } else if (stacks.peek()[1] < h[i]) {
          maxArea = Math.max(maxArea, base[1]);
          System.out.println("-->" + base[0] + ", " + base[1]);
          stacks.push(base);
        } else {
          int lowest = base[1];
          int baseIndex = base[0];
          int baseHeight = base[1];
          int[] lastStack = null;
          while (!stacks.isEmpty() && stacks.peek()[1] >= h[i]) {
            lastStack = stacks.pop();
            int index = lastStack[0];
            int height = lastStack[1];
            lowest = Math.min(lowest, height);
            int area = lowest * (baseIndex - index + 1);
            System.out
                .println("-->" + index + ", " + height + ", " + baseIndex + ", " + baseHeight + ", "
                    + lowest + ", " + area);
            maxArea = Math.max(area, maxArea);
          }
          if (lastStack != null) {
            stacks.push(lastStack);
          }
        }
        stacks.push(new int[]{i + 1, h[i]});
      }
    }
    if (!stacks.isEmpty()) {
      int[] base = stacks.pop();
      int lowest = base[1];
      int baseIndex = base[0];
      int baseHeight = base[1];
      maxArea = Math.max(maxArea, base[1]);
      System.out.println("-----> " + base[0] + ", " + base[1]);
      while (!stacks.isEmpty()) {
        int[] stack = stacks.pop();
        int index = stack[0];
        int height = stack[1];
        lowest = Math.min(lowest, height);
        int area = lowest * (baseIndex - index + 1);
        System.out.println(
            "-->" + index + ", " + height + ", " + baseIndex + ", " + baseHeight + ", " + lowest
                + ", " + area);
        maxArea = Math.max(area, maxArea);
      }
    }
    return maxArea;
  }

}
