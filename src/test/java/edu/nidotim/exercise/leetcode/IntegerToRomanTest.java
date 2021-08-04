package edu.nidotim.exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


import junit.framework.Assert;

public class IntegerToRomanTest {
	private static IntegerToRoman itr;

	private static int num;

	private static String expected;

	private static String actual;

	private static Map<Integer, String> answerMap;

	@Test
	public void testOneToTen() {
		itr = new IntegerToRoman();
		answerMap = new HashMap<Integer, String>();
		answerMap.put(1, "I");
		answerMap.put(2, "II");
		answerMap.put(3, "III");
		answerMap.put(4, "IV");
		answerMap.put(5, "V");
		answerMap.put(6, "VI");
		answerMap.put(7, "VII");
		answerMap.put(8, "VIII");
		answerMap.put(9, "IX");
		answerMap.put(10, "X");
		for (int i = 1; i <= 10; i++) {
			num = i;
			actual = itr.intToRoman(num);
			expected = answerMap.get(num);
			Assert.assertEquals(expected, actual);
		}
	}
}

