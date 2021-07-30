package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//  https://www.hackerrank.com/challenges/magic-square-forming/problem
//  5 3 4
//  1 5 8
//  6 4 2

//  7

//  4 9 2
//  3 5 7
//  8 1 5

// 1
public class MagicSquare {

  private int checkLine(List<List<Integer>> s, Set<Integer> finishedNumber,
      boolean[][] finishedGrid, int startRow, int startCol, int moveRow, int moveCol,
      boolean isCenter) {
    if (finishedGrid[startRow][startCol] && finishedGrid[startRow + moveRow][startCol + moveCol]
        && finishedGrid[startRow + (2 * moveRow)][startCol + (2 * moveCol)]) {
      return 0;
    }
    int rowOne = startRow;
    int rowTwo = startRow + moveRow;
    int rowThree = startRow + moveRow + moveRow;
    int colOne = startCol;
    int colTwo = startCol + moveCol;
    int colThree = startCol + moveCol + moveCol;
    Integer value1 = s.get(rowOne).get(colOne);
    Integer value2 = s.get(rowTwo).get(colTwo);
    Integer value3 = s.get(rowThree).get(colThree);
    if (hasDuplicate(value1, value2, value3)) {
      return 0;
    }

    if (isCenter) {
      if (value2 != 5) {
        return changeNumberToFive(s, finishedNumber, finishedGrid, rowTwo, colTwo, value2);
      }
      if (value1 == 5 && value3 != 5) {
        return changeNumber(s, finishedNumber, finishedGrid, rowOne, colOne, value1,
            (15 - value3 - value3));
      }
      if (value1 != 5 && value3 == 5) {
        return changeNumber(s, finishedNumber, finishedGrid, rowThree, colThree, value3,
            (15 - value1 - value2));
      }
    } else if (!isCenter && !noFives(value1, value2, value3)) {
      if (value1 == 5 && value2 != 5 && value3 != 5) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowTwo, colTwo),
            Arrays.asList(rowThree, colThree));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowOne, colOne, value1,
            (15 - value2 - value3));
      }
      if (value1 != 5 && value2 == 5 && value3 != 5) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowOne, colOne),
            Arrays.asList(rowThree, colThree));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowTwo, colTwo, value2,
            (15 - value1 - value3));
      }
      if (value1 != 5 && value2 != 5 && value3 == 5) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowOne, colOne),
            Arrays.asList(rowTwo, colTwo));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowThree, colThree, value3,
            (15 - value1 - value2));
      }
    }

    if (isMagicNumber(value1, value2, value3)) {
      markFinish(finishedNumber, finishedGrid, rowOne, colOne, value1);
      markFinish(finishedNumber, finishedGrid, rowTwo, colTwo, value2);
      markFinish(finishedNumber, finishedGrid, rowThree, colThree, value3);
      return 0;
    }

    if (!finishedGrid[rowOne][colOne] && finishedGrid[rowTwo][colTwo]
        && finishedGrid[rowThree][colThree]) {
      return changeNumber(s, finishedNumber, finishedGrid, rowOne, colOne, value1,
          (15 - value2 - value3));
    } else if (finishedGrid[rowOne][colOne] && !finishedGrid[rowTwo][colTwo]
        && finishedGrid[rowThree][colThree]) {
      return changeNumber(s, finishedNumber, finishedGrid, rowTwo, colTwo, value2,
          (15 - value1 - value3));
    } else if (finishedGrid[rowOne][colOne] && finishedGrid[rowTwo][colTwo]
        && !finishedGrid[rowThree][colThree]) {
      return changeNumber(s, finishedNumber, finishedGrid, rowThree, colThree, value3,
          (15 - value1 - value2));
    }

    if (!finishedGrid[rowOne][colOne] && !finishedGrid[rowTwo][colTwo]
        && finishedGrid[rowThree][colThree]) {
      if (finishedNumber.contains(value1) && !finishedNumber.contains(value2)) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowTwo, colTwo));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowOne, colOne, value1,
            (15 - value2 - value3));
      } else if (!finishedNumber.contains(value1) && finishedNumber.contains(value2)) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowOne, colOne));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowTwo, colTwo, value2,
            (15 - value1 - value3));
      }
    } else if (!finishedGrid[rowOne][colOne] && finishedGrid[rowTwo][colTwo]
        && !finishedGrid[rowThree][colThree]) {
      if (finishedNumber.contains(value1) && !finishedNumber.contains(value3)) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowThree, colThree));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowOne, colOne, value1,
            (15 - value2 - value3));
      } else if (!finishedNumber.contains(value1) && finishedNumber.contains(value3)) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowOne, colOne));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowThree, colThree, value3,
            (15 - value2 - value1));
      }
    } else if (finishedGrid[rowOne][colOne] && !finishedGrid[rowTwo][colTwo]
        && !finishedGrid[rowThree][colThree]) {
      if (finishedNumber.contains(value2) && !finishedNumber.contains(value3)) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowThree, colThree));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowTwo, colTwo, value2,
            (15 - value1 - value3));
      } else if (!finishedNumber.contains(value2) && finishedNumber.contains(value3)) {
        List<List<Integer>> indexList = Arrays.asList(Arrays.asList(rowTwo, colTwo));
        return changeNumber(s, finishedNumber, finishedGrid, indexList, rowThree, colThree, value3,
            (15 - value1 - value2));
      }
    }
    return 0;
  }

  private int checkRow(List<List<Integer>> s, Set<Integer> finishedNumber, boolean[][] finishedGrid,
      int row, boolean isCenter) {
    Integer col1 = s.get(row).get(0);
    Integer col2 = s.get(row).get(1);
    Integer col3 = s.get(row).get(2);
    if (hasDuplicate(col1, col2, col3)) {
      return 0;
    }
    if (isCenter) {
      if (col2 != 5) {
        return changeNumberToFive(s, finishedNumber, finishedGrid, row, 1, col2);
      }
      if (col1 == 5 && col3 != 5) {
        return changeNumber(s, finishedNumber, finishedGrid, row, 0, col1, (15 - col2 - col3));
      }
      if (col1 != 5 && col3 == 5) {
        return changeNumber(s, finishedNumber, finishedGrid, row, 2, col3, (15 - col1 - col2));
      }
    }
    if (!isCenter && !noFives(col1, col2, col3)) {
      if (col1 == 5 && col2 != 5 && col3 != 5) {
        markFinish(finishedNumber, finishedGrid, row, 1, col2);
        markFinish(finishedNumber, finishedGrid, row, 2, col3);
        return changeNumber(s, finishedNumber, finishedGrid, row, 0, col1, (15 - col2 - col3));
      }
      if (col1 != 5 && col2 == 5 && col3 != 5) {
        return changeNumber(s, finishedNumber, finishedGrid, row, 1, col2, (15 - col1 - col3));
      }
      if (col1 != 5 && col2 != 5 && col3 == 5) {
        return changeNumber(s, finishedNumber, finishedGrid, row, 2, col3, (15 - col1 - col2));
      }
    }

    if (isMagicNumber(col1, col2, col3)) {
      markFinish(finishedNumber, finishedGrid, row, 0, col1);
      markFinish(finishedNumber, finishedGrid, row, 1, col2);
      markFinish(finishedNumber, finishedGrid, row, 2, col3);
    } else {
      if (!finishedGrid[row][0] && finishedGrid[row][1] && finishedGrid[row][2]) {
        return changeNumber(s, finishedNumber, finishedGrid, row, 0, col1, (15 - col2 - col3));
      } else if (finishedGrid[row][0] && !finishedGrid[row][1] && finishedGrid[row][2]) {
        return changeNumber(s, finishedNumber, finishedGrid, row, 1, col2, (15 - col1 - col3));
      } else if (finishedGrid[row][0] && finishedGrid[row][1] && !finishedGrid[row][2]) {
        return changeNumber(s, finishedNumber, finishedGrid, row, 2, col3, (15 - col1 - col2));
      }
    }
    return 0;
  }

  private int checkCol(List<List<Integer>> s, Set<Integer> finishedNumber, boolean[][] finishedGrid,
      int column, boolean isCenter) {
    Integer row1 = s.get(0).get(column);
    Integer row2 = s.get(1).get(column);
    Integer row3 = s.get(2).get(column);
    if (hasDuplicate(row1, row2, row3)) {
      return 0;
    }
    if (isCenter && row2 != 5) {
      if (row2 != 5) {
        return changeNumberToFive(s, finishedNumber, finishedGrid, 1, column, row2);
      }
      if (row1 == 5 && row3 != 5) {
        return changeNumber(s, finishedNumber, finishedGrid, 0, column, row1, (15 - row2 - row3));
      }
      if (row1 != 5 && row3 == 5) {
        return changeNumber(s, finishedNumber, finishedGrid, 2, column, row3, (15 - row1 - row2));
      }
    }
    if (!isCenter && !noFives(row1, row2, row3)) {
      if (row1 == 5 && row2 != 5 && row3 != 5) {
        return changeNumber(s, finishedNumber, finishedGrid, 0, column, row1, (15 - row2 - row3));
      }
      if (row1 != 5 && row2 == 5 && row3 != 5) {
        return changeNumber(s, finishedNumber, finishedGrid, 1, column, row2, (15 - row1 - row3));
      }
      if (row1 != 5 && row2 != 5 && row3 == 5) {
        return changeNumber(s, finishedNumber, finishedGrid, 2, column, row3, (15 - row1 - row2));
      }
    }

    if (isMagicNumber(row1, row2, row3)) {
      markFinish(finishedNumber, finishedGrid, 0, column, row1);
      markFinish(finishedNumber, finishedGrid, 1, column, row2);
      markFinish(finishedNumber, finishedGrid, 2, column, row3);
    } else {
      if (!finishedGrid[0][column] && finishedGrid[1][column] && finishedGrid[2][column]) {
        return changeNumber(s, finishedNumber, finishedGrid, 0, column, row1, (15 - row2 - row3));
      } else if (finishedGrid[0][column] && !finishedGrid[1][column] && finishedGrid[2][column]) {
        return changeNumber(s, finishedNumber, finishedGrid, 1, column, row2, (15 - row1 - row3));
      } else if (finishedGrid[0][column] && finishedGrid[1][column] && !finishedGrid[2][column]) {
        return changeNumber(s, finishedNumber, finishedGrid, 2, column, row3, (15 - row1 - row2));
      }
    }

    return 0;
  }

  private int checkVertical(List<List<Integer>> s, Set<Integer> finishedNumber,
      boolean[][] finishedGrid,
      int start, int move) {
    Integer value1 = s.get(start).get(start);
    Integer value2 = s.get(start + move).get(start + move);
    Integer value3 = s.get(start + move + move).get(start + move + move);
    if (hasDuplicate(value1, value2, value3)) {
      return 0;
    }
    if (value2 != 5) {
      return changeNumberToFive(s, finishedNumber, finishedGrid, (start + move), (start + move),
          value2);
    }
    if (value1 == 5 && value3 != 5) {
      return changeNumber(s, finishedNumber, finishedGrid, start, start, value1,
          (15 - value3 - value3));
    }
    if (value1 != 5 && value3 == 5) {
      return changeNumber(s, finishedNumber, finishedGrid, (start + move + move),
          (start + move + move), value3, (15 - value1 - value2));
    }

    if (isMagicNumber(value1, value2, value3)) {
      markFinish(finishedNumber, finishedGrid, start, start, value1);
      markFinish(finishedNumber, finishedGrid, start + move, start + move, value2);
      markFinish(finishedNumber, finishedGrid, start + move + move, start + move + move, value3);
    } else {
      if (!finishedGrid[start][start] && finishedGrid[start + move][start + move]
          && finishedGrid[start + move + move][start + move + move]) {
        return changeNumber(s, finishedNumber, finishedGrid, start, start, value1,
            (15 - value2 - value3));
      } else if (finishedGrid[start][start] && !finishedGrid[start + move][start + move]
          && finishedGrid[start + move + move][start + move + move]) {
        return changeNumber(s, finishedNumber, finishedGrid, start + move, start + move, value2,
            (15 - value1 - value3));
      } else if (finishedGrid[start][start] && finishedGrid[start + move][start + move]
          && !finishedGrid[start + move + move][start + move + move]) {
        return changeNumber(s, finishedNumber, finishedGrid, start + move + move,
            start + move + move, value3, (15 - value1 - value2));
      }
    }
    return 0;
  }

  public int formingMagicSquare2(List<List<Integer>> s) {
    // Write your code here
    boolean[][] finishedGrid = new boolean[][]{
        {false, false, false},
        {false, false, false},
        {false, false, false}
    };
    int total = 0;
    Set<Integer> finishedNumber = new HashSet<>();
    int count = 0;
    while (finishedNumber.size() != 9) {
      //scan row 1
//      total += checkRow(s, finishedNumber, finishedGrid, 0, false);
//      total += checkRow(s, finishedNumber, finishedGrid, 1, true);
//      total += checkRow(s, finishedNumber, finishedGrid, 2, false);
//
//      total += checkCol(s, finishedNumber, finishedGrid, 0, false);
//      total += checkCol(s, finishedNumber, finishedGrid, 1, true);
//      total += checkCol(s, finishedNumber, finishedGrid, 2, false);
//
//      total += checkVertical(s, finishedNumber, finishedGrid, 0, 1);
//      total += checkVertical(s, finishedNumber, finishedGrid, 2, -1);

      // check rows
      total += checkLine(s, finishedNumber, finishedGrid, 0, 0, 0, 1, false);
      total += checkLine(s, finishedNumber, finishedGrid, 1, 0, 0, 1, true);
      total += checkLine(s, finishedNumber, finishedGrid, 2, 0, 0, 1, false);

      // check cols
      total += checkLine(s, finishedNumber, finishedGrid, 0, 0, 1, 0, false);
      total += checkLine(s, finishedNumber, finishedGrid, 0, 1, 1, 0, true);
      total += checkLine(s, finishedNumber, finishedGrid, 0, 2, 1, 0, false);

      // check verticals
      total += checkLine(s, finishedNumber, finishedGrid, 0, 0, 1, 1, true);
      total += checkLine(s, finishedNumber, finishedGrid, 0, 2, 1, -1, true);
      for (List<Integer> line : s) {
        for (Integer n : line) {
          System.out.print(n + " ");
        }
        System.out.println("");
      }
      System.out.println("");
      count++;
      if (count > 3) {

        break;
      }
    }

    System.out.println("========>" + count);

    return total;
  }


  private boolean hasDuplicate(int x, int y, int z) {
    return x == y || x == z || y == z;
  }

  private boolean noFives(int x, int y, int z) {
    return x != 5 && y != 5 && z != 5;
  }

  private boolean isMagicNumber(int x, int y, int z) {
    return (x + y + z) == 15;
  }

  private int changeNumber(List<List<Integer>> s, Set<Integer> finishedNumber,
      boolean[][] finishedGrid, int x, int y, int value, int changeValue) {
    if (changeValue < 1 || changeValue > 9) {
      return 0;
    }
    int diff = Math.abs(changeValue - value);
    s.get(x).set(y, changeValue);
    finishedNumber.add(changeValue);
    finishedGrid[x][y] = true;
    return diff;
  }

  private int changeNumber(List<List<Integer>> s, Set<Integer> finishedNumber,
      boolean[][] finishedGrid, List<List<Integer>> markFinishedIndex, int x, int y,
      int value, int changeValue) {
    if (changeValue < 1 || changeValue > 9) {
      return 0;
    }
    for (List<Integer> index : markFinishedIndex) {
      int row = index.get(0);
      int col = index.get(1);
      markFinish(finishedNumber, finishedGrid, row, col, s.get(row).get(col));
    }
    int diff = Math.abs(changeValue - value);
    s.get(x).set(y, changeValue);
    finishedNumber.add(changeValue);
    finishedGrid[x][y] = true;
    return diff;
  }

  private int changeNumberToFive(List<List<Integer>> s, Set<Integer> finishedNumber,
      boolean[][] finishedGrid, int x, int y, int value) {
    return changeNumber(s, finishedNumber, finishedGrid, x, y, value, 5);
  }

  private void markFinish(Set<Integer> finishedNumber, boolean[][] finishedGrid, int x, int y,
      int value) {
    finishedNumber.add(value);
    finishedGrid[x][y] = true;
  }


  private int changeNumber(List<List<Integer>> s, int x, int y, int value, int changeValue) {
    if (changeValue < 1 || changeValue > 9) {
      return 0;
    }
    int diff = Math.abs(changeValue - value);
    s.get(x).set(y, changeValue);
    return diff;
  }

  public int formingMagicSquare(List<List<Integer>> s) {
    int[][] matrix = {{4, 9, 2, 3, 5, 7, 8, 1, 6},
        {2, 7, 6, 9, 5, 1, 4, 3, 8},
        {6, 1, 8, 7, 5, 3, 2, 9, 4},
        {8, 3, 4, 1, 5, 9, 6, 7, 2},
        {2, 9, 4, 7, 5, 3, 6, 1, 8},
        {6, 7, 2, 1, 5, 9, 8, 3, 4},
        {8, 1, 6, 3, 5, 7, 4, 9, 2},
        {4, 3, 8, 9, 5, 1, 2, 7, 6}};

    int[] square = new int[9];
    int count = 0;
    for (int i = 0; i < s.size(); i++) {
      for (int j = 0; j < s.get(i).size(); j++) {
        square[count] = s.get(i).get(j);
        count++;
      }
    }
    int minOff = 99;
    for (int i = 0; i < 8; i++) {
      int off = 0;
      for (int j = 0; j < 9; j++) {
        if (square[j] != matrix[i][j]) {
          off += Math.abs(square[j] - matrix[i][j]);
        }
      }
      if (off < minOff) {
        minOff = off;
      }
    }
    return minOff;
  }


  public int formingMagicSquare3(List<List<Integer>> s) {
    // Write your code here
    boolean[][] finishedGrid = new boolean[][]{
        {false, false, false},
        {false, false, false},
        {false, false, false}
    };

    int total = 0;
    Set<Integer> finishedNumber = new HashSet<>();
    int count = 0;

    for (List<Integer> line : s) {
      for (Integer n : line) {
        System.out.print(n + " ");
      }
      System.out.println("");
    }
    System.out.println("");

    // check center
    if (s.get(1).get(1) != 5) {
      total += changeNumber(s, 1, 1, s.get(1).get(1), 5);
    }
    boolean leftUpFinished = false;
    boolean leftDownFinished = false;
    Set<Integer> numbers = new HashSet<>();
    if (match(s.get(0).get(0), s.get(2).get(2)) && match(s.get(2).get(0), s.get(0).get(2))) {
      if (!s.get(0).get(0).equals(s.get(2).get(0)) && !s.get(0).get(0).equals(s.get(0).get(2))) {
        leftUpFinished = true;
        leftDownFinished = true;
      } else {
        numbers.add(s.get(0).get(0));
        numbers.add(s.get(2).get(2));
        leftUpFinished = true;
      }
    } else if (match(s.get(0).get(0), s.get(2).get(2))) {
      leftUpFinished = true;
      numbers.add(s.get(0).get(0));
      numbers.add(s.get(2).get(2));
    } else if (match(s.get(2).get(0), s.get(0).get(2))) {
      leftDownFinished = true;
      numbers.add(s.get(2).get(0));
      numbers.add(s.get(0).get(2));
    }

    if (!leftUpFinished && !leftDownFinished) {
      if (s.get(0).get(0) == 2
          || s.get(0).get(0) == 8 | s.get(0).get(0) == 4 | s.get(0).get(0) == 6) {
        total += changeNumber(s, 2, 2, s.get(2).get(2), 10 - s.get(0).get(0));
        leftUpFinished = true;
      } else if (s.get(2).get(2) == 2
          || s.get(2).get(2) == 8 | s.get(2).get(2) == 4 | s.get(2).get(2) == 6) {
        total += changeNumber(s, 0, 0, s.get(0).get(0), 10 - s.get(2).get(2));
        leftUpFinished = true;
      }

      if (s.get(2).get(0) == 2
          || s.get(2).get(0) == 8 | s.get(2).get(0) == 4 | s.get(2).get(0) == 6) {
        total += changeNumber(s, 0, 2, s.get(0).get(2), 10 - s.get(2).get(0));
        leftDownFinished = true;
      } else if (s.get(0).get(2) == 2
          || s.get(0).get(2) == 8 | s.get(0).get(2) == 4 | s.get(0).get(2) == 6) {
        total += changeNumber(s, 2, 0, s.get(2).get(0), 10 - s.get(0).get(2));
        leftDownFinished = true;
      }
    } else if (!leftUpFinished) {
      if (s.get(0).get(0) == 2
          || s.get(0).get(0) == 8 | s.get(0).get(0) == 4 | s.get(0).get(0) == 6) {
        if (!numbers.contains(s.get(0).get(0))) {
          total += changeNumber(s, 2, 2, s.get(2).get(2), 10 - s.get(0).get(0));
          leftUpFinished = true;
        }
      }
      if (!leftUpFinished && (s.get(2).get(2) == 2
          || s.get(2).get(2) == 8 | s.get(2).get(2) == 4 | s.get(2).get(2) == 6)) {
        if (!numbers.contains(s.get(2).get(2))) {
          total += changeNumber(s, 0, 0, s.get(0).get(0), 10 - s.get(2).get(2));
          leftUpFinished = true;
        }
      }
    } else if (!leftDownFinished) {
      if (s.get(2).get(0) == 2
          || s.get(2).get(0) == 8 | s.get(2).get(0) == 4 | s.get(2).get(0) == 6) {
        if (!numbers.contains(s.get(2).get(0))) {
          total += changeNumber(s, 0, 2, s.get(0).get(2), 10 - s.get(2).get(0));
          leftDownFinished = true;
        }
      }
      if (!leftDownFinished && (s.get(0).get(2) == 2
          || s.get(0).get(2) == 8 | s.get(0).get(2) == 4 | s.get(0).get(2) == 6)) {
        if (!numbers.contains(s.get(0).get(2))) {
          total += changeNumber(s, 2, 0, s.get(2).get(0), 10 - s.get(0).get(2));
          leftDownFinished = true;
        }
      }
    }

    if (!leftUpFinished && !leftDownFinished) {
      total += changeNumber(s, 0, 0, s.get(0).get(0), 2);
      total += changeNumber(s, 2, 2, s.get(2).get(2), 8);
      total += changeNumber(s, 2, 0, s.get(2).get(0), 4);
      total += changeNumber(s, 0, 2, s.get(0).get(2), 6);
    } else if (!leftDownFinished) {
      int number = (s.get(0).get(0) == 2 || s.get(0).get(0) == 8) ? 4 : 2;
      if (Math.abs(s.get(2).get(0) - number) + Math.abs(s.get(0).get(2) - (10 - s.get(2).get(0))) <
          Math.abs(s.get(0).get(2) - number) + Math.abs(s.get(2).get(0) - (10 - s.get(2).get(2)))) {
        total += changeNumber(s, 2, 0, s.get(2).get(0), number);
        total += changeNumber(s, 0, 2, s.get(0).get(2), 10 - s.get(2).get(0));
      } else {
        total += changeNumber(s, 0, 2, s.get(0).get(2), number);
        total += changeNumber(s, 2, 0, s.get(2).get(0), 10 - s.get(0).get(2));
      }
    } else if (!leftUpFinished) {
      int number = (s.get(2).get(0) == 2 || s.get(2).get(0) == 8) ? 4 : 2;
      if (Math.abs(s.get(0).get(0) - number) + Math.abs(s.get(2).get(2) - (10 - s.get(0).get(0))) <
          Math.abs(s.get(2).get(2) - number) + Math.abs(s.get(0).get(0) - (10 - s.get(2).get(2)))) {
        total += changeNumber(s, 0, 0, s.get(0).get(0), number);
        total += changeNumber(s, 2, 2, s.get(2).get(2), 10 - s.get(0).get(0));
      } else {
        total += changeNumber(s, 2, 2, s.get(2).get(2), number);
        total += changeNumber(s, 0, 0, s.get(0).get(0), 10 - s.get(2).get(2));
      }
    }

    total += changeNumber(s, 0, 1, s.get(0).get(1), 15 - s.get(0).get(0) - s.get(0).get(2));
    total += changeNumber(s, 1, 0, s.get(1).get(0), 15 - s.get(0).get(0) - s.get(2).get(0));
    total += changeNumber(s, 1, 2, s.get(1).get(2), 15 - s.get(1).get(0) - s.get(1).get(1));
    total += changeNumber(s, 2, 1, s.get(2).get(1), 15 - s.get(2).get(0) - s.get(2).get(2));
//
//    while (finishedNumber.size() != 9) {
//      //scan row 1
////      total += checkRow(s, finishedNumber, finishedGrid, 0, false);
////      total += checkRow(s, finishedNumber, finishedGrid, 1, true);
////      total += checkRow(s, finishedNumber, finishedGrid, 2, false);
////
////      total += checkCol(s, finishedNumber, finishedGrid, 0, false);
////      total += checkCol(s, finishedNumber, finishedGrid, 1, true);
////      total += checkCol(s, finishedNumber, finishedGrid, 2, false);
////
////      total += checkVertical(s, finishedNumber, finishedGrid, 0, 1);
////      total += checkVertical(s, finishedNumber, finishedGrid, 2, -1);
//
//      // check rows
//      total += checkLine(s, finishedNumber, finishedGrid, 0, 0, 0, 1, false);
//      total += checkLine(s, finishedNumber, finishedGrid, 1, 0, 0, 1, true);
//      total += checkLine(s, finishedNumber, finishedGrid, 2, 0, 0, 1, false);
//
//      // check cols
//      total += checkLine(s, finishedNumber, finishedGrid, 0, 0, 1, 0, false);
//      total += checkLine(s, finishedNumber, finishedGrid, 0, 1, 1, 0, true);
//      total += checkLine(s, finishedNumber, finishedGrid, 0, 2, 1, 0, false);
//
//      // check verticals
//      total += checkLine(s, finishedNumber, finishedGrid, 0, 0, 1, 1, true);
//      total += checkLine(s, finishedNumber, finishedGrid, 0, 2, 1, -1, true);
//      for (List<Integer> line : s) {
//        for (Integer n : line) {
//          System.out.print(n + " ");
//        }
//        System.out.println("");
//      }
//      System.out.println("");
//      count++;
//      if (count > 3) {
//
//        break;
//      }
//    }
    for (List<Integer> line : s) {
      for (Integer n : line) {
        System.out.print(n + " ");
      }
      System.out.println("");
    }
    System.out.println("========>" + count + ", " + total);

    return total;
  }

  private boolean match(int x, int y) {
    if (x == 2 || x == 4 || x == 6 || x == 8) {
      if (x + y == 10) {
        return true;
      }
    }
    return false;
  }
}
