package edu.nidotim.exercise.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;


import junit.framework.Assert;

public class ReverseIntegerTest {

	private static ReverseInteger ri;

	private static int input;

	private static int expected;

	private static int actual;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
		ri = new ReverseInteger();
	}

	@Test
	public void test() {
		input = 123;
		expected = 321;
		actual = ri.reverse(input);
		Assert.assertEquals(expected, actual);
		// Assert.assertEquals("message", expected, actual);
	}

	@Test
	public void test2() {
		input = 0;
		expected = 0;
		actual = ri.reverse(input);
		Assert.assertEquals(expected, actual);
		// Assert.assertEquals("message", expected, actual);
	}

	@Test
	public void test3() {
		input = -123321;
		expected = -123321;
		actual = ri.reverse(input);
		Assert.assertEquals(expected, actual);
		// Assert.assertEquals("message", expected, actual);
	}

	@Test
	public void test4() {
		input = 1534236469;
		expected = 0;
		actual = ri.reverse(input);
		Assert.assertEquals(expected, actual);
		// Assert.assertEquals("message", expected, actual);
	}

}
