package edu.nidotim.exercise.hackerrank.datastructure.queue;

import java.util.List;

// https://www.hackerrank.com/challenges/truck-tour/problem
public class TruckTour {

  public int truckTour(List<List<Integer>> petrolPumps) {
    // Write your code here
    int totalFuel = 0;
    int index = 0;
    int petrolVisited = 0;
    while (true) {
      List<Integer> petrolPump = petrolPumps.get(index);
      int fuel = petrolPump.get(0);
      int distance = petrolPump.get(1);
      if (petrolVisited == petrolPumps.size()) {
        return index;
      }
      totalFuel = totalFuel + fuel - distance;
      if (index == petrolPumps.size() - 1) {
        index = 0;
      } else {
        index++;
      }
      if (totalFuel < 0) {
        // reset
        totalFuel = 0;
        petrolVisited = 0;
        continue;
      }
      petrolVisited++;

    }
  }

}
