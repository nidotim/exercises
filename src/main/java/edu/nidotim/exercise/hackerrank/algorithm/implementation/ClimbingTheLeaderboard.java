package edu.nidotim.exercise.hackerrank.algorithm.implementation;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//  https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
//  6
//  100 90 90 80 75 60
//  5
//  50 65 77 90 102

//  6
//  5
//  4
//  2
//  1
public class ClimbingTheLeaderboard {

//  public List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
//    // Write your code here
//    List<Integer> result = new ArrayList<>();
//    Set<Integer> scoreSet = new HashSet<>();
//    List<Integer> scores = new LinkedList();
//    scores = ranked.stream().filter(rank -> {
//      if (scoreSet.contains(rank)) {
//        return false;
//      }
//      scoreSet.add(rank);
//      return true;
//    }).sorted(Collections.reverseOrder()).collect(Collectors.toList());
//    int scoreIndex = 1;
//    int prevScore = scores.get(0);
//    for (int i = 0; i < player.size(); i++) {
//      Integer score = player.get(i);
//      while (true) {
//        System.out
//            .println("===>" + score + ", " + prevScore + ", " + scores.get(scoreIndex) + ", "
//                + scoreIndex + ", " + scores.size());
//        if (score.equals(scores.get(scoreIndex))) {
//          result.add(scoreIndex + 1);
//          break;
//        }
//        if (score < prevScore && score > scores.get(scoreIndex)) {
//          result.add(scoreIndex + 1);
//          scores.add(scoreIndex, score);
//          prevScore = scores.get(scoreIndex);
//          scoreIndex++;
//          break;
//        }
//        if (score > prevScore && score < scores.get(scoreIndex)) {
//          result.add(scoreIndex + 2);
//          scores.add(scoreIndex + 1, score);
//          prevScore = scores.get(scoreIndex);
//          scoreIndex--;
//          break;
//        }
//        if (score > prevScore && score > scores.get(scoreIndex)) {
//          if (scoreIndex == 0) {
//            scores.add(0, score);
//            result.add(1);
//            prevScore = scores.get(scoreIndex);
//            break;
//          }
//          prevScore = scores.get(scoreIndex);
//          scoreIndex--;
//        }
//        if (score < prevScore && score < scores.get(scoreIndex)) {
//          if (scoreIndex == scores.size() - 1) {
//            scores.add(score);
//            result.add(scores.size());
//            prevScore = scores.get(scoreIndex + 1);
//            break;
//          }
//          prevScore = scores.get(scoreIndex);
//          scoreIndex++;
//        }
//      }
//    }
//    for (Integer score : scores) {
//      System.out.println(score);
//    }
//    return result;
//  }


  public List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
    List<Integer> result = new ArrayList<>();
    List<Integer> scores = new LinkedList();
    scores.add(ranked.get(0));
    Integer prevScore = ranked.get(0);
    for (int i = 1; i < ranked.size(); i++) {
      if (prevScore.equals(ranked.get(i))) {
        continue;
      }
      scores.add(ranked.get(i));
      prevScore = ranked.get(i);
    }
    int scoreIndex = scores.size() - 1;
    for (int i = 0; i < player.size(); i++) {
      Integer score = player.get(i);
      while (true) {
        System.out.println(
            "===>" + score + ", " + scoreIndex + ", " + scores.get(scoreIndex) + ", " + scores
                .size());
        if (score.equals(scores.get(scoreIndex))) {
          result.add(scoreIndex + 1);
          break;
        }
        if (score < scores.get(scoreIndex)) {
          scoreIndex++;
          scores.add(score);
          result.add(scoreIndex + 1);
          break;
        }
        if (score > scores.get(scoreIndex)) {
          if (scoreIndex == 0) {
            scores.add(0, score);
            result.add(1);
            break;
          } else if (score >= scores.get(scoreIndex - 1)) {
            scoreIndex--;
            continue;
          } else if (score < scores.get(scoreIndex - 1)) {
            result.add(scoreIndex + 1);
            scores.add(scoreIndex, score);
            break;
          }
        }
      }
    }
    for (Integer score : scores) {
      System.out.println(score);
    }
    return result;
  }

//  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(
//        new FileWriter(System.getenv("OUTPUT_PATH")));
//
//    int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//    Set<Integer> scoreSet = new HashSet<>();
//    List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//        .map(Integer::parseInt)
//        .filter(rank -> {
//          if (scoreSet.contains(rank)) {
//            return false;
//          }
//          scoreSet.add(rank);
//          return true;
//        })
//        .collect(toList());
//
//    int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//    int[] scoreIndex = {ranked.size() - 1};
//    List<Integer> result = new ArrayList<>();
//    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//        .map(Integer::parseInt)
//        .forEach(score -> {
//              while (true) {
//                if (score.equals(ranked.get(scoreIndex[0]))) {
//                  result.add(scoreIndex[0] + 1);
//                  break;
//                }
//                if (score < ranked.get(scoreIndex[0])) {
//                  scoreIndex[0]++;
//                  ranked.add(score);
//                  result.add(scoreIndex[0] + 1);
//                  break;
//                }
//                if (score > ranked.get(scoreIndex[0])) {
//                  if (scoreIndex[0] == 0) {
//                    ranked.add(0, score);
//                    result.add(1);
//                    break;
//                  } else if (score >= ranked.get(scoreIndex[0] - 1)) {
//                    scoreIndex[0]--;
//                    continue;
//                  } else if (score < ranked.get(scoreIndex[0] - 1)) {
//                    result.add(scoreIndex[0] + 1);
//                    ranked.add(scoreIndex[0], score);
//                    break;
//                  }
//                }
//              }
//            }
//        );
//
//    bufferedWriter.write(
//        result.stream()
//            .map(Object::toString)
//            .collect(joining("\n"))
//            + "\n"
//    );
//
//    bufferedReader.close();
//    bufferedWriter.close();
//  }

}
