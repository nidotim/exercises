package edu.nidotim.exercise.hackerrank.algorithm.strings;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DNAHealthTest {

  DNAHealth dnaHealth;

  @Before
  public void before() {
    dnaHealth = new DNAHealth();
  }

  @Test
  public void testDNAHealthTest() {
    //  6
    //  a b c aa d b
    //  1 2 3 4 5 6
    //  3
    //  1 5 caaab
    //  0 4 xyz
    //  2 4 bcdybc

    List<String> genes = Arrays.asList("a", "b", "c", "aa", "d", "b");
    List<Integer> healthList = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<String> queries = Arrays.asList("1 5 caaab", "0 4 xyz", "2 4 bcdybc");

    String expectedResult = "0 19";
    String results = dnaHealth.dnaHealth(genes, healthList, queries);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testDNAHealthTest2() {

    List<String> genes = Arrays.asList("a", "a", "c", "aa", "d", "b");
    List<Integer> healthList = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<String> queries = Arrays.asList("1 5 caaab", "0 4 xyz", "2 4 bcdybc");

    String expectedResult = "0 23";
    String results = dnaHealth.dnaHealth(genes, healthList, queries);

    Assert.assertEquals(expectedResult, results);
  }

  @Test
  public void testDNAHealthTest3() {

    List<String> genes = Arrays.asList("a", "b", "c", "b");
    List<Integer> healthList = Arrays.asList(1, 2, 3, 4);
    List<String> queries = Arrays.asList("1 3 bc");

    String expectedResult = "9 9";
    String results = dnaHealth.dnaHealth(genes, healthList, queries);

    Assert.assertEquals(expectedResult, results);
  }


  @Test
  public void testDNAHealthTest4() {
    List<String> genes = Arrays.asList();
    List<Integer> healthList = Arrays.asList();
    List<String> queries = Arrays.asList();

    try (Stream<String> lines = Files.lines(
        Paths.get("src/test/resources/gene.txt"))) {
      genes = lines.collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }
    try (Stream<String> lines = Files.lines(
        Paths.get("src/test/resources/health.txt"))) {
      healthList = lines.map(str -> Integer.parseInt(str.trim())).collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (Stream<String> lines = Files.lines(
        Paths.get("src/test/resources/queries.txt"))) {
      queries = lines.collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }

//    for (int i = 0; i < 100; i++) {
//      System.out.println(genes.get(i));
//    }
//
//    for (int i = 0; i < 100; i++) {
//      System.out.println(healthList.get(i));
//    }
//    for (int i = 0; i < 100; i++) {
//      System.out.println(queries.get(i));
//    }

    String expectedResult = "15806635 20688978289";
    String results = dnaHealth.dnaHealth(genes, healthList, queries);

    Assert.assertEquals(expectedResult, results);
  }

}
