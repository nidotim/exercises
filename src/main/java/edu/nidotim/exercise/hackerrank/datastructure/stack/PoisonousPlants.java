package edu.nidotim.exercise.hackerrank.datastructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://www.hackerrank.com/challenges/poisonous-plants/problem
public class PoisonousPlants {

  public int poisonousPlants(int[] p) {
    if (p.length < 2) {
      return 0;
    }
    List<Stack<Integer>> stackList = new ArrayList<>();
    int prev = Integer.MIN_VALUE;

    for (int i = 0; i < p.length; i++) {
      int pesticide = p[i];
      Stack<Integer> stack;
      if (prev < pesticide) {
        stack = new Stack<>();
        stackList.add(stack);
      } else {
        stack = stackList.get(stackList.size() - 1);
      }
      stack.add(pesticide);
      prev = pesticide;
    }

    boolean plantDied = true;
    int days = 0;

    System.out.println(stackList);
    while (plantDied) {
      plantDied = false;
      for (int i = stackList.size() - 1; i > 0; i--) {
        Stack<Integer> popStack = stackList.get(i);
        Stack<Integer> compareStack = stackList.get(i - 1);
        System.out.println("Before: " + i + " --> " + stackList);
        if (compareStack.peek() >= popStack.firstElement()) {
          continue;
        }
        plantDied = true;
        popStack.remove(0);
        if (popStack.isEmpty()) {
          stackList.remove(i);
        }
        System.out.println("After: " + i + " --> " + stackList);
      }

      System.out.println("-----------> " + stackList);
      if (plantDied) {
        days++;
      }
    }

    return days;
  }

//
//  private int getMaxDays(Stack<Stack<Integer>> integerStacks) {
//    int maxDays = 0;
//    maxDays = Math.max(maxDays, integerStacks.size());
//    for (Stack<Integer> integerStack : integerStacks) {
//      maxDays = Math.max(maxDays, integerStack.size());
//    }
//    return maxDays;
//  }
//
//  public int poisonousPlants(int[] p) {
//    if (p.length < 1) {
//      return 0;
//    }
//
//    Stack<Stack<Integer>> levelOfPesticides = new Stack<>();
//    int maxDays = 0;
//    int startingPlant = p[0];
//    int prev = p[0];
//    int lastStackInteger = 0;
//    for (int i = 1; i < p.length; i++) {
//      int pesticide = p[i];
//      if (startingPlant >= pesticide) {
//        maxDays = Math.max(maxDays, getMaxDays(levelOfPesticides));
//        levelOfPesticides.clear();
//        startingPlant = pesticide;
//      } else if (startingPlant < pesticide) {
//        Stack<Integer> integerStack;
//        if (prev < pesticide || lastStackInteger > pesticide) {
//          integerStack = new Stack<>();
//          levelOfPesticides.push(integerStack);
//          lastStackInteger = prev;
//        } else {
//          integerStack = levelOfPesticides.get(levelOfPesticides.size() - 1);
//        }
//        integerStack.add(pesticide);
//        System.out.println(
//            levelOfPesticides + " ------------------- > " + prev + ", " + pesticide + ", "
//                + lastStackInteger);
//      }
//      prev = pesticide;
//    }
//    if (!levelOfPesticides.isEmpty()) {
//      maxDays = Math.max(maxDays, getMaxDays(levelOfPesticides));
//    }
//    System.out.println(maxDays);
//
//    return maxDays;
//  }
/*
  public int poisonousPlants(int[] p) {
    if (p.length < 1) {
      return 0;
    }
    int longestDays = 0;
    int days = 0;
    for (int i = 0; i < p.length - 1; i++) {
      int startNumber = p[i];
      System.out.println(p[i]);
      if (startNumber >= p[i + 1]) {
        longestDays = Math.max(days, longestDays);
        days = 0;
      } else {
        days++;
        boolean upFound = false;
        i++;
        while (i < p.length - 1 && startNumber < p[i + 1]) {
          if (p[i + 1] < p[i]) {
            days++;
          } else {
            upFound = true;
            longestDays = Math.max(longestDays, days);
            days = 0;
          }
          i++;
        }
        longestDays = Math.max(longestDays, days);
      }
    }
    return longestDays;
  }
  */

//  public int poisonousPlants(int[] p) {
//    if (p.length < 1) {
//      return 0;
//    }
//
//    int longestDays = 0;
//    LinkedList<LinkedList<Integer>> queueList = new LinkedList<>();
//    LinkedList<Integer> queue = new LinkedList<>();
//    int previous = p[0];
//    queue.add(p[0]);
//    for (int i = 1; i < p.length; i++) {
//      if (p[i] < previous) {
//        queue.add(p[i]);
//      } else {
//        queueList.add(queue);
//        queue = new LinkedList<>();
//        queue.add(p[i]);
//      }
//      previous = p[i];
//    }
//    if (!queueList.isEmpty()) {
//      queueList.add(queue);
//    }
//    int days = 0;
//    while (true) {
//      days++;
//      boolean noOneDies = true;
//      for (int i = queueList.size() - 1; i > 0; i--) {
//        LinkedList<Integer> queue1 = queueList.get(i - 1);
//        LinkedList<Integer> queue2 = queueList.get(i);
//        if (queue1.isEmpty() || queue2.isEmpty()) {
//          continue;
//        }
//        if (queue1.peekLast() < queue2.peekFirst()) {
//          queue2.pollFirst();
//          noOneDies = false;
//        } else {
//          queue1.addAll(queue2);
//          queue2.clear();
//        }
//      }
//      if (noOneDies) {
//        days--;
//        break;
//      }
//    }
//    System.out.println(queueList);
//
//    return days;
//  }

}
