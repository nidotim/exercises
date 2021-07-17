package edu.nidotim.exercise.hackerrank.datastructure.tree;


import edu.nidotim.exercise.util.datastructure.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

// https://www.hackerrank.com/challenges/tree-top-view/problem
public class TopViewTree {


  public String topView2(Node root) {
    // BFS
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    int levelNum = 1;
    int level = 0;
    while (!queue.isEmpty()) {
      Node node = queue.remove();
      levelNum--;
      if (levelNum == 0) {
        level++;
      }
      System.out.println("level: " + level + ", levelNum:" + levelNum + ", data:" + node.data);
      if (node.left != null) {
        queue.add(node.left);
        levelNum++;
      }
      if (node.right != null) {
        queue.add(node.right);
        levelNum++;
      }
    }
    return "";

  }

  public String topView(Node root) {
    if (root == null) {
      return "";
    }
    Map<Integer, Integer> resultMap = new TreeMap<>();
    StringBuilder sb = new StringBuilder();
    resultMap.put(0, root.data);
    Queue<Integer> indexList = new LinkedList<>();
    indexList.add(0);
//    if (root.left != null) {
//      result += " " + root.left.data;
//      nextLevelNode.add(root.left);
//      indexList.add(-1);
//      resultMap.put(-1, root.left.data);
//    }
//    if (root.right != null) {
//      result += " " + root.right.data;
//      nextLevelNode.add(root.right);
//      indexList.add(1);
//      resultMap.put(1, root.right.data);
//    }
//    traverse(nextLevelNode, indexList, resultMap);
    //result += traverse(nextLevelNode);
    traverse(Arrays.asList(root), indexList, resultMap);
    //StringBuilder sb = new StringBuilder();
    for (Integer value : resultMap.values()) {
      sb.append(value).append(" ");
    }
    if (sb.length() > 0) {
      sb.deleteCharAt(sb.length() - 1);
    }
    return sb.toString();
  }

  private void traverse(List<Node> nodeList, Queue<Integer> indexList,
      Map<Integer, Integer> resultMap) {
    if (nodeList.isEmpty()) {
      return;
    }
    List<Node> nextLevelNode = new ArrayList<Node>();
    for (Node node : nodeList) {
      Node left = node.left;
      Node right = node.right;
      int rooIndex = indexList.poll();
      if (left != null) {
        int leftIndex = rooIndex - 1;
//        System.out.println("------------------> left index:" + leftIndex + ", data:" + left.data);
        if (!resultMap.containsKey(leftIndex)) {
          resultMap.put(leftIndex, left.data);
        }
        indexList.add(leftIndex);
        nextLevelNode.add(left);
      }
      if (right != null) {
        int rightIndex = rooIndex + 1;
//        System.out.println("------------------> right index:" + rightIndex + ", data:" + right.data);
        if (!resultMap.containsKey(rightIndex)) {
          resultMap.put(rightIndex, right.data);
        }
        indexList.add(rightIndex);
        nextLevelNode.add(right);
      }
    }
    traverse(nextLevelNode, indexList, resultMap);
  }
}
