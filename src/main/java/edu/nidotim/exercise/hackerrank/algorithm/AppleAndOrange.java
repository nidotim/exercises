package edu.nidotim.exercise.hackerrank.algorithm;

import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    public static void main(String[] args) {
        AppleAndOrange appleAndOrange = new AppleAndOrange();
        List<Integer> result = appleAndOrange.countApplesAndOranges(7, 11, 5, 15, Arrays.asList(-2, 2, 1), Arrays.asList(5, -6));
        System.out.println(result.get(0) + " " + result.get(1));
    }

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */
    public List<Integer> countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleCnt = 0;
        int orangeCnt = 0;
        for(Integer apple : apples) {
            if(isOnTheHouse(s, t, a, apple)) {
                appleCnt++;
            }
        }
        for(Integer orange : oranges) {
            if(isOnTheHouse(s, t, b, orange)) {
                orangeCnt++;
            }
        }

        return Arrays.asList(appleCnt, orangeCnt);
    }

    private boolean isOnTheHouse(int s, int t, int a, int d) {
        if(a + d >= s && a + d <= t) {
            return true;
        }
        return false;
    }
}

