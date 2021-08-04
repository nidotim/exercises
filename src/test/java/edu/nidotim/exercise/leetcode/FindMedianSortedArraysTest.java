package edu.nidotim.exercise.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class FindMedianSortedArraysTest {
	private static FindMedianSortedArrays fmsa;

	private static int[] nums1;

	private static int[] nums2;

	private static double expected;

	private static double actual;

	@Test
	public void test() {
		fmsa = new FindMedianSortedArrays();
		nums1 = new int[] { 2, 3, 6, 8 };
		nums2 = new int[] { 1, 1, 3, 4 };
		actual = fmsa.findMedianSortedArrays(nums1, nums2);
		expected = 3;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test1() {
		fmsa = new FindMedianSortedArrays();

		nums1 = new int[] { 2 };
		nums2 = new int[] {};
		actual = fmsa.findMedianSortedArrays(nums1, nums2);
		expected = 2;
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void test2() {
		fmsa = new FindMedianSortedArrays();

		nums1 = new int[] {};
		nums2 = new int[] { 4 };
		actual = fmsa.findMedianSortedArrays(nums1, nums2);
		expected = 4;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		fmsa = new FindMedianSortedArrays();

		nums1 = new int[] { 1 };
		nums2 = new int[] { 4 };
		actual = fmsa.findMedianSortedArrays(nums1, nums2);
		expected = 2.5;
		Assert.assertEquals(expected, actual);
	}

}
