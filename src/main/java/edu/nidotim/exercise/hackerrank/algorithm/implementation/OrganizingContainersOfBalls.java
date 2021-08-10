package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import java.util.ArrayList;
import java.util.List;

//  https://www.hackerrank.com/challenges/non-divisible-subset/problem
//  4 3      S[] size n = 4, k = 3
//  1 7 2 4  S = [1, 7, 2, 4]

//  3
public class OrganizingContainersOfBalls {

//  public String organizingContainers(List<List<Integer>> containers) {
//    int n = containers.size();
//    int[] a = new int[n];
//    int[] b = new int[n];
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < n; j++) {
//        int x = containers.get(i).get(j);
//        a[i] += x;
//        b[j] += x;
//      }
//    }
//    String pts = "Possible";
//    for (int i = 0; i < n; i++) {
//      int j = 0;
//      for (j = i; j < n; j++) {
//        if (a[i] == b[j]) {
//          int temp = b[j];
//          b[j] = b[i];
//          b[i] = temp;
//          break;
//        }
//      }
//      if (j == n) {
//        pts = "Impossible";
//        break;
//      }
//    }
//    System.out.println(pts);
//    return pts;
//  }


  public String organizingContainers(List<List<Integer>> containers) {
    // Write your code here
    List<List<Long>> container = new ArrayList<>();
    for (List<Integer> c : containers) {
      List<Long> row = new ArrayList<>();
      for (Integer n : c) {
        row.add(Long.valueOf(n));
      }
      container.add(row);
    }
    print(container);
    int i = 0;
    boolean swap = false;
    while (i < container.size()) {
      for (int j = 0; j < container.size(); j++) {
        if (i == j) {
          continue;
        }
        Long currentNumberOfBalls = container.get(j).get(i);
        if (currentNumberOfBalls == 0) {
          continue;
        }
        int count = 0;
        int k = i;
        while (count < container.size()) {
          //for (int k = 0; k < container.size(); k++) {
          if (i != k) {
            Long swapBalls = container.get(i).get(k);
            if (swapBalls != 0) {

              long swapNumber = Math.min(currentNumberOfBalls, swapBalls);

              System.out.println(
                  "B =====>" + i + ", " + j + ", " + k + ", " + currentNumberOfBalls + ", "
                      + container.get(k).get(j));
              if (swapNumber > 0) {
                currentNumberOfBalls -= swapNumber;
                container.get(j).set(i, currentNumberOfBalls);
                container.get(i).set(k, swapBalls - swapNumber);
                container.get(j).set(k, container.get(j).get(k) + swapNumber);
                container.get(i).set(i, container.get(i).get(i) + swapNumber);
                swap = true;
                print(container, j, i, i, k, j, k, i, i);
              }
              System.out.println(
                  "A =====>" + i + ", " + j + ", " + k + ", " + currentNumberOfBalls + ", "
                      + container.get(k).get(j) + "\n");
            }
          }
          count++;
          k++;
          if (k == container.size()) {
            k = 0;
          }
          if (currentNumberOfBalls == 0) {
            break;
          }
        }
      }
      i++;
      if (i == container.size()) {
        if (!swap) {
          break;
        }
        swap = false;
        i = 0;
      }
    }

    for (i = 0; i < container.size(); i++) {
      for (int j = 0; j < container.size(); j++) {
        System.out.print(container.get(i).get(j) + " ");
        if (i == j) {
          continue;
        }
        if (!container.get(i).get(j).equals(0L)) {
          System.out.print(containers.get(i).get(j));
          return "Impossible";
        }
      }

      System.out.println(" ");
    }
    return "Possible";
  }
//
//  public String organizingContainers(List<List<Integer>> containers) {
//    // Write your code here
//    List<List<Long>> container = new ArrayList<>();
//    for (List<Integer> c : containers) {
//      List<Long> row = new ArrayList<>();
//      for (Integer n : c) {
//        row.add(Long.valueOf(n));
//      }
//      container.add(row);
//    }
//    print(container);
//    int i = 0;
//    boolean swap = false;
//    while (i < container.size()) {
//      for (int j = 0; j < container.size(); j++) {
//        if (i == j) {
//          continue;
//        }
//        Long currentNumberOfBalls = container.get(j).get(i);
//        if (currentNumberOfBalls == 0) {
//          continue;
//        }
//        int count = 0;
//        int k = i;
//        while (count < container.size()) {
//          //for (int k = 0; k < container.size(); k++) {
//          if (j != k) {
//            Long swapBalls = container.get(k).get(j);
//            if (swapBalls != 0) {
//
//              long swapNumber = Math.min(currentNumberOfBalls, swapBalls);
//
//              System.out.println(
//                  "B =====>" + i + ", " + j + ", " + k + ", " + currentNumberOfBalls + ", "
//                      + container.get(k).get(j));
//              if (swapNumber > 0) {
//                currentNumberOfBalls -= swapNumber;
//                container.get(j).set(i, currentNumberOfBalls);
//                container.get(k).set(j, swapBalls - swapNumber);
//                container.get(j).set(j, container.get(j).get(j) + swapNumber);
//                container.get(k).set(i, container.get(k).get(i) + swapNumber);
//                swap = true;
//                print(container, j, i, k, j, j, j, k, i);
//              }
//              System.out.println(
//                  "A =====>" + i + ", " + j + ", " + k + ", " + currentNumberOfBalls + ", "
//                      + container.get(k).get(j) + "\n");
//            }
//          }
//          count++;
//          k++;
//          if (k == container.size()) {
//            k = 0;
//          }
//          if (currentNumberOfBalls == 0) {
//            break;
//          }
//        }
//      }
//      i++;
//      if (i == container.size()) {
//        if (!swap) {
//          break;
//        }
//        swap = false;
//        i = 0;
//      }
//    }
//
//    for (i = 0; i < container.size(); i++) {
//      for (int j = 0; j < container.size(); j++) {
//        System.out.print(container.get(i).get(j) + " ");
//        if (i == j) {
//          continue;
//        }
//        if (!container.get(i).get(j).equals(0L)) {
//          System.out.print(containers.get(i).get(j));
//          return "Impossible";
//        }
//      }
//
//      System.out.println(" ");
//    }
//    return "Possible";
//  }

//  public String organizingContainers3(List<List<Integer>> containers) {
//    // Write your code here
//    List<List<Long>> container = new ArrayList<>();
//    for (List<Integer> c : containers) {
//      List<Long> row = new ArrayList<>();
//      for (Integer n : c) {
//        row.add(Long.valueOf(n));
//      }
//      container.add(row);
//    }
//    print(container);
//    for (int i = 0; i < container.size(); i++) {
//      boolean swap = false;
//      int j = 0;
//      while (j < container.size()) {
//        if (i != j) {
//          Long currentNumberOfBalls = container.get(j).get(i);
//          if (currentNumberOfBalls != 0) {
//            int count = 0;
//            int k = i;
//            while (count < container.size()) {
//              //for (int k = 0; k < container.size(); k++) {
//              if (j != k) {
//                Long swapBalls = container.get(k).get(j);
//                if (swapBalls != 0) {
//
//                  long swapNumber = Math.min(currentNumberOfBalls, swapBalls);
//
//                  System.out.println(
//                      "B =====>" + i + ", " + j + ", " + k + ", " + currentNumberOfBalls + ", "
//                          + container.get(k).get(j));
//                  if (swapNumber > 0) {
//                    currentNumberOfBalls -= swapNumber;
//                    container.get(j).set(i, currentNumberOfBalls);
//                    container.get(k).set(j, swapBalls - swapNumber);
//                    container.get(j).set(j, container.get(j).get(j) + swapNumber);
//                    container.get(k).set(i, container.get(k).get(i) + swapNumber);
//                    swap = true;
//                    print(container, j, i, k, j, j, j, k, i);
//                  }
//                  System.out.println(
//                      "A =====>" + i + ", " + j + ", " + k + ", " + currentNumberOfBalls + ", "
//                          + container.get(k).get(j) + "\n");
//                }
//              }
//              count++;
//              k++;
//              if (k == container.size()) {
//                k = 0;
//              }
//              if (currentNumberOfBalls == 0) {
//                break;
//              }
//            }
//          }
//        }
//        j++;
//        if (j == container.size()) {
//          if (!swap) {
//            break;
//          }
//          swap = false;
//          j = 0;
//        }
//      }
//    }
//
//    for (int i = 0; i < container.size(); i++) {
//      for (int j = 0; j < container.size(); j++) {
//        System.out.print(container.get(i).get(j) + " ");
//        if (i == j) {
//          continue;
//        }
//        if (!container.get(i).get(j).equals(0)) {
////          return "Impossible";
//        }
//      }
//
//      System.out.println(" ");
//    }
//    return "Possible";
//  }

  private void print(List<List<Long>> container) {
    for (List<Long> c : container) {
      for (Long n : c) {
        System.out.print(n + " ");
      }
      System.out.println("");
    }
  }

  private void print(List<List<Long>> container, int i1, int j1, int i2, int j2, int i3, int j3,
      int i4, int j4) {
    for (int i = 0; i < container.size(); i++) {
      for (int j = 0; j < container.size(); j++) {
        if ((i == i1 && j == j1) || (i == i2 && j == j2) || (i == i3 && j == j3) || (i == i4
            && j == j4)) {
          System.out.print("\"");
        }
        System.out.print(container.get(i).get(j));
        if ((i == i1 && j == j1) || (i == i2 && j == j2) || (i == i3 && j == j3) || (i == i4
            && j == j4)) {
          System.out.print("\"");
        }
        System.out.print(" ");
      }
      System.out.println("");
    }
  }

//  public String organizingContainers(List<List<Integer>> container) {
//    // Write your code here
//    boolean swap = false;
//    int index = 0;
//    while (index < container.size()) {
//      List<Integer> currentContainer = container.get(index);
//      for (int j = 0; j < container.get(index).size(); j++) {
//        if (index == j) {
//          continue;
//        }
//        int currentNumberOfBalls = container.get(index).get(j);
//        int swapBalls = container.get(j).get(index);
//        int swapNumber = Math.min(currentNumberOfBalls, swapBalls);
//        if (swapNumber > 0) {
//          container.get(index).set(j, currentNumberOfBalls - swapNumber);
//          container.get(j).set(index, swapBalls - swapNumber);
//          container.get(j).set(j, swapBalls + swapNumber);
//          container.get(index).set(index, swapNumber + container.get(index).get(index));
//          swap = true;
//        }
//      }
//      index++;
//      if (index >= container.size() && swap) {
//        index = 0;
//        swap = false;
//      }
//    }
//    for (int i = 0; i < container.size(); i++) {
//      for (int j = 0; j < container.size(); j++) {
//        System.out.print(container.get(i).get(j) + " ");
//        if (i == j) {
//          continue;
//        }
//        if (!container.get(i).get(j).equals(0)) {
//          //return "Impossible";
//        }
//      }
//
//      System.out.println(" ");
//    }
//    return "Possible";
//  }

}
