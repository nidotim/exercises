package edu.nidotim.exercise.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwoSumTest {

	private static TwoSum twoSum;

	private static int[] test1Data;

	private static int[] test2Data;

	private static int[] testLargeData;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
		twoSum = new TwoSum();
		test1Data = new int[] { 2, 7, 11, 15 };
		test2Data = new int[] { 2, 7, 11, 15, 33, 22, 12, 30 };
		testLargeData = new int[50000000];
		testLargeData[0] = 1;
		for (int i = 1; i < testLargeData.length - 1; i++) {
			testLargeData[i] = 3;
		}
		testLargeData[testLargeData.length - 1] = 1;
	}

	@Test
	public void test1() {
		int[] results = twoSum.twoSum(test1Data, 9);
		Assert.assertArrayEquals(new int[] { 0, 1 }, results);
	}

	@Test
	public void test2() {
		int[] results = twoSum.twoSum(test2Data, 63);
		Assert.assertArrayEquals(new int[] { 4, 7 }, results);
	}

	@Test
	public void testLargeData() {
		int[] results = twoSum.twoSum(testLargeData, 2);
		Assert.assertArrayEquals(new int[] { 0, testLargeData.length - 1 }, results);
	}

}
