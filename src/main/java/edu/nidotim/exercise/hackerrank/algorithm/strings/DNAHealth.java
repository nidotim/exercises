package edu.nidotim.exercise.hackerrank.algorithm.strings;

import static java.util.stream.Collectors.toList;

import edu.nidotim.exercise.util.datastructure.DnaTrie;
import edu.nidotim.exercise.util.datastructure.DnaTrieNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//  https://www.hackerrank.com/challenges/determining-dna-health/problem

//  Sample Input 0
//  6
//  a b c aa d b
//  1 2 3 4 5 6
//  3
//  1 5 caaab
//  0 4 xyz
//  2 4 bcdybc

//  Sample Output 0
//  0 19
public class DNAHealth {

  private static DnaTrie trie;

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<String> genes = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .collect(toList());

    List<Integer> health = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());
    trie = new DnaTrie();
    for (int i = 0; i < n; i++) {
      trie.insert(i, genes.get(i), health.get(i));
    }

    int s = Integer.parseInt(bufferedReader.readLine().trim());

    long[] max = new long[]{Long.MIN_VALUE};
    long[] min = new long[]{Long.MAX_VALUE};
    IntStream.range(0, s).forEach(sItr -> {
      try {
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int first = Integer.parseInt(firstMultipleInput[0]);

        int last = Integer.parseInt(firstMultipleInput[1]);

        String d = firstMultipleInput[2];
        long result = findHealth(first, last, d);
        max[0] = Math.max(result, max[0]);
        min[0] = Math.min(result, min[0]);
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });
    System.out.println(min[0] + " " + max[0]);

    bufferedReader.close();
  }

  public static long findHealth(int start, int end, String healthGenes) {
    long total = 0;
    for (int i = 0; i < healthGenes.length(); i++) {
      for (int j = i + 1; j <= healthGenes.length(); j++) {
        String word = healthGenes.substring(i, j);
        DnaTrieNode node = trie.getHealth(word, start, end);
        if (node == null) {
          break;
        } else if (node.isEndOfWord()) {
          int front = 0;
          int back = node.getIndexList().size() - 1;
          int startIndex = 0;
          boolean forward = true;
          while (front < back) {
            if (node.getIndexList().get(front) >= start) {
              startIndex = front;
              break;
            }
            if (node.getIndexList().get(back) <= end) {
              startIndex = back;
              forward = false;
              break;
            }
            if (node.getIndexList().get(front) > end) {
              startIndex = front;
              break;
            }
            if (node.getIndexList().get(back) < start) {
              startIndex = back;
              break;
            }
            front++;
            back--;
          }
          if (forward) {
            for (int k = startIndex; k < node.getIndexList().size(); k++) {
              if (node.getIndexList().get(k) >= start && node.getIndexList().get(k) <= end) {
                total += node.getHealthList().get(k);
              }
              if (node.getIndexList().get(k) > end) {
                break;
              }
            }
          } else {
            for (int k = startIndex; k >= 0; k--) {
              if (node.getIndexList().get(k) >= start && node.getIndexList().get(k) <= end) {
                total += node.getHealthList().get(k);
              }
              if (node.getIndexList().get(k) < start) {
                break;
              }
            }
          }
        }
        if (node.getChildren().isEmpty()) {
          break;
        }
      }
    }
    return total;
  }


  public String dnaHealth(List<String> genes, List<Integer> health, List<String> queries) {
    trie = new DnaTrie();
    for (int i = 0; i < genes.size(); i++) {
      trie.insert(i, genes.get(i), health.get(i));
    }
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    for (String query : queries) {
      String[] command = query.trim().split("\\s+");
      int start = Integer.parseInt(command[0]);
      int end = Integer.parseInt(command[1]);
      String healthGenes = command[2];
      long total = findHealth(start, end, healthGenes);
//      for (int i = 0; i < healthGenes.length(); i++) {
//        for (int j = i + 1; j <= healthGenes.length(); j++) {
//          System.out.println("--->" + i + ", " + j + ", " + healthGenes.substring(i, j));
//          String word = healthGenes.substring(i, j);
//          Integer result = trie.getHealth(word, start, end);
//          if (result == null) {
//            break;
//          }
//          total += result;
//        }
//      }

//      System.out.println(
//          "===>" + query + ", " + start + ", " + end + ", " + healthGenes + ", " + total + ", "
//              + min + ", " + max);
      max = Math.max(total, max);
      min = Math.min(total, min);
    }

    return min + " " + max;
  }
}
