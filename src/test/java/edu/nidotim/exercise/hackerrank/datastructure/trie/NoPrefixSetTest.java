package edu.nidotim.exercise.hackerrank.datastructure.trie;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NoPrefixSetTest {

  NoPrefixSet noPrefixSet;

  @Before
  public void before() {
    noPrefixSet = new NoPrefixSet();
  }

  @Test
  public void noPrefixSetTest1() {
    List<String> words = Arrays
        .asList("aab", "defgab", "abcde", "aabcde", "bbbbbbbbbb", "jabjjjad");
    List<String> result = noPrefixSet.contacts(words);
    List<String> expectedResult = Arrays.asList("BAD SET", "aabcde");
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void noPrefixSetTest2() {
    List<String> words = Arrays.asList("aab", "aac", "aacghgh", "aabghgh");
    List<String> result = noPrefixSet.contacts(words);
    List<String> expectedResult = Arrays.asList("BAD SET", "aacghgh");
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void noPrefixSetTest3() {
    List<String> words = Arrays.asList("ab", "bc", "cd");
    List<String> result = noPrefixSet.contacts(words);
    List<String> expectedResult = Arrays.asList("GOOD SET");
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void noPrefixSetTest4() {
    List<String> words = Arrays
        .asList("a", "defgab", "abcde", "aabcde", "bbbbbbbbbb", "jabjjjad");
    List<String> result = noPrefixSet.contacts(words);
    List<String> expectedResult = Arrays.asList("BAD SET", "abcde");
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void noPrefixSetTest5() {
    List<String> words = Arrays
        .asList("aab", "defgab", "abc", "abcde", "cedaaa", "bbbbbbbbbb", "jabjjjad");
    List<String> result = noPrefixSet.contacts(words);
    List<String> expectedResult = Arrays.asList("BAD SET", "abcde");
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void noPrefixSetTest6() {
    List<String> words = Arrays
        .asList("aab", "defgab", "abcde", "abc", "cedaaa", "bbbbbbbbbb", "jabjjjad");
    List<String> result = noPrefixSet.contacts(words);
    List<String> expectedResult = Arrays.asList("BAD SET", "abc");
    Assert.assertEquals(expectedResult, result);
  }

}
