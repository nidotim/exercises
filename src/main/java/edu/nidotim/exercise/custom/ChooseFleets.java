package edu.nidotim.exercise.custom;

import java.util.ArrayList;
import java.util.List;

public class ChooseFleets {

  public List<Integer> chooseFleets(List<Integer> wheels) {
    List<Integer> result = new ArrayList<>();
    for (Integer wheel : wheels) {
      if (wheel % 2 != 0) {
        result.add(0);
        continue;
      }

      // 2 -> 2, 4 -> 2 2, 6 -> 2 2 2, 8 -> 2 2 2 2 , 10 -> 2 2 2 2 2
      int numberOfTwos = wheel / 2;
      if (numberOfTwos == 1) {
        result.add(1);
        continue;
      }
      int numberOfFours = numberOfTwos / 2;
      result.add(numberOfFours + 1);
    }
    return result;
  }
}
