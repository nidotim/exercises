package edu.nidotim.exercise.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class RegularExpressionMatchingTest {

	private static RegularExpressionMatching rem;

	private static String input;

	private static String inputMatch;

	private static boolean expected;

	private static boolean actual;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
		rem = new RegularExpressionMatching();
	}

	@Test
	public void test() {
		input = "aa";
		inputMatch = "a";
		
		actual = rem.isMatch(input, inputMatch);
		expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		input = "aa";
		inputMatch = "aa";

		actual = rem.isMatch(input, inputMatch);
		expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		input = "aaa";
		inputMatch = "aa";

		actual = rem.isMatch(input, inputMatch);
		expected = false;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test4() {
		input = "aa";
		inputMatch = "a*";

		actual = rem.isMatch(input, inputMatch);
		expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test5() {
		input = "aa";
		inputMatch = ".*";

		actual = rem.isMatch(input, inputMatch);
		expected = true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test6() {
		input = "ab";
		inputMatch = ".*";

		actual = rem.isMatch(input, inputMatch);
		expected = true;
		Assert.assertEquals(expected, actual);
	}


	@Test
	public void test7() {
		input = "aab";
		inputMatch = "c*a*b";
		
		actual = rem.isMatch(input, inputMatch);
		expected = true;
		Assert.assertEquals(expected, actual);
	}
}
