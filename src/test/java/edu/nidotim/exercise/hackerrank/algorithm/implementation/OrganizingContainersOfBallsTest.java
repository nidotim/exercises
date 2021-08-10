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

  @Test
  public void testOrganizingContainersOfBalls6() {

    List<List<Integer>> containers = Arrays.asList(
        Arrays.asList(658479595, 991026365, 701943273, 985987715, 719337042, 722922265, 836184992,
            997390019),
        Arrays.asList(653823732, 987522780, 589399866, 478615729, 557346728, 998345398, 976004072,
            988036757),
        Arrays.asList(994178245, 921203685, 621915912, 999193949, 963102859, 993519056, 592203832,
            478506452),
        Arrays.asList(786387682, 648132661, 822795292, 593514823, 980971817, 997706087, 999501631,
            990282514),
        Arrays.asList(999706441, 653915483, 975359599, 932739873, 996240758, 687222082, 731552322,
            969677609),
        Arrays.asList(583521046, 994945676, 966520116, 984718769, 969257170, 613059968, 989811731,
            598707601),
        Arrays.asList(997894683, 580781282, 893089090, 649843468, 947389156, 553369641, 998629888,
            992589492),
        Arrays.asList(939595276, 923014145, 996964245, 939209664, 812768637, 662950565, 695404039,
            598080822)
    );
    String expectedResult = "Possible";
    String results = organizingContainersOfBalls.organizingContainers(containers);

    Assert.assertEquals(expectedResult, results);
  }


}
