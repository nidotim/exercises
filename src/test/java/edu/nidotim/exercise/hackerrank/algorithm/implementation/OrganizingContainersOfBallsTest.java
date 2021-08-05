package edu.nidotim.exercise.hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrganizingContainersOfBallsTest {

  OrganizingContainersOfBalls organizingContainersOfBalls;

  @Before
  public void before() {
    organizingContainersOfBalls = new OrganizingContainersOfBalls();
  }

  @Test
  public void testOrganizingContainersOfBalls() {

    List<List<Integer>> containers = Arrays.asList(
        Arrays.asList(1, 4),
        Arrays.asList(2, 3)
    );
    String expectedResult = "Impossible";

    String results = organizingContainersOfBalls.organizingContainers(containers);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testOrganizingContainersOfBalls2() {

    List<List<Integer>> containers = Arrays.asList(
        Arrays.asList(1, 1),
        Arrays.asList(1, 1)
    );
    String expectedResult = "Possible";
    String results = organizingContainersOfBalls.organizingContainers(containers);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testOrganizingContainersOfBalls3() {

    List<List<Integer>> containers = Arrays.asList(
        Arrays.asList(0, 2, 1),
        Arrays.asList(1, 1, 1),
        Arrays.asList(2, 0, 0)
    );
    String expectedResult = "Possible";
    String results = organizingContainersOfBalls.organizingContainers(containers);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testOrganizingContainersOfBalls4() {

    List<List<Integer>> containers = Arrays.asList(
        Arrays.asList(0, 3, 1),
        Arrays.asList(1, 1, 3),
        Arrays.asList(3, 1, 0)
    );
    String expectedResult = "Possible";
    String results = organizingContainersOfBalls.organizingContainers(containers);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testOrganizingContainersOfBalls5() {
    List<List<Integer>> containers = Arrays.asList(
        Arrays.asList(850352964, 977596446, 949048147, 948864413, 583894071, 690057713, 997747480,
            989967717),
        Arrays.asList(989808562, 768213277, 465807106, 806209383, 997601076, 726063750, 886274860,
            999745463),
        Arrays.asList(999716184, 614327240, 646233100, 701848586, 996640233, 637114525, 979053522,
            973751653),
        Arrays.asList(729579413, 623758391, 789451199, 998061161, 915515002, 887943421, 667982910,
            663066401),
        Arrays.asList(625660022, 983861176, 747822232, 924237583, 765182731, 879961473, 915988053,
            973592376),
        Arrays.asList(978486425, 911982749, 995853966, 373364101, 706580937, 995621049, 869416897,
            906988203),
        Arrays.asList(996021364, 982486194, 880450667, 971761433, 779568692, 990258135, 985311146,
            547004947),
        Arrays.asList(963237644, 954080173, 997900896, 551011238, 803702301, 931274261, 685754083,
            585606717)
    );
    String expectedResult = "Possible";
    String results = organizingContainersOfBalls.organizingContainers(containers);

    Assert.assertEquals(expectedResult, results);
  }
}
