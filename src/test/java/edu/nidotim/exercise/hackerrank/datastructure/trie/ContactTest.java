package edu.nidotim.exercise.hackerrank.datastructure.trie;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContactTest {

  Contact contact;

  @Before
  public void before() {
    contact = new Contact();
  }

  @Test
  public void contactTest() {
    List<List<String>> commands = Arrays.asList(
        Arrays.asList("add", "ed"),
        Arrays.asList("add", "eddie"),
        Arrays.asList("add", "edward"),
        Arrays.asList("find", "ed"),
        Arrays.asList("add", "edwina"),
        Arrays.asList("find", "edw"),
        Arrays.asList("find", "a")
    );
    List<Integer> result = contact.contacts(commands);
    List<Integer> expectedResult = Arrays.asList(3, 2, 0);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void contactTest2() {
    List<List<String>> commands = Arrays.asList(
        Arrays.asList("add", "hack"),
        Arrays.asList("add", "hackerrank"),
        Arrays.asList("find", "hac"),
        Arrays.asList("find", "hak")
    );
    List<Integer> result = contact.contacts(commands);
    List<Integer> expectedResult = Arrays.asList(2, 0);
    Assert.assertEquals(expectedResult, result);
  }


  @Test
  public void contactTestDirectly() {
    List<List<String>> commands = Arrays.asList(
        Arrays.asList("add", "hack"),
        Arrays.asList("add", "hackerrank"),
        Arrays.asList("find", "hac"),
        Arrays.asList("find", "hak")
    );
    List<Integer> result = contact.contactsDirectly(commands);
    List<Integer> expectedResult = Arrays.asList(2, 0);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void contactTestDirectly2() {
    List<List<String>> commands = Arrays.asList(
        Arrays.asList("add", "hack"),
        Arrays.asList("add", "hackerrank"),
        Arrays.asList("find", "h"),
        Arrays.asList("find", "ha"),
        Arrays.asList("find", "hac"),
        Arrays.asList("find", "hack"),
        Arrays.asList("find", "hacker"),
        Arrays.asList("find", "hak")
    );
    List<Integer> result = contact.contactsDirectly(commands);
    List<Integer> expectedResult = Arrays.asList(2, 2, 2, 2, 1, 0);
    Assert.assertEquals(expectedResult, result);
  }
}
