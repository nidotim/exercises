package edu.nidotim.exercise.leetcode;

import java.util.Arrays;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		if (s.length() > 1000) {
			s = s.substring(0, 1000);
		} else if (s.length() == 1) {
			return s;
		}
		int cnt = 0;
		char[] characters = s.toCharArray();
		char c;
		char c2;
		int lastIndex = characters.length - 1;
		int beginIndex;
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int longestSize = 0;
		String longestStr = "";
		StringBuilder sbTemp = new StringBuilder();
		for (int i = 0; i < lastIndex; i++) {
			c = characters[i];
			beginIndex = i;
			sb.setLength(0);
			sb2.setLength(0);
			sb.append(c);
			for (int j = lastIndex; j > i; j--) {
				c2 = characters[j];
				if (beginIndex == j && sb.toString().length() + sb2.toString().length() > longestSize) {

					longestStr = sb.toString() + sb2.reverse().toString();
					longestSize = longestStr.length();
					break;
				}
				sb2.append(c2);

				if (sb.toString().equals(sb2.toString())) {
					beginIndex++;
					c = characters[beginIndex];
					if (sb.toString().length() + sb2.toString().length() > longestSize) {
						sbTemp.setLength(0);
						sbTemp.append(sb2.toString());
						// StringBuilder sbTemp = new StringBuilder(sb2);
						longestStr = sb.toString() + sbTemp.reverse().toString();

						longestSize = longestStr.length();
					}
				} else {
					sb.setLength(0);
					sb2.setLength(0);
					beginIndex = i;
					c = characters[i];
				}
				if (beginIndex == j) {
					if (sb.toString().length() + sb2.toString().length() > longestSize) {
						cnt++;
						sbTemp.setLength(0);
						sbTemp.append(sb2.toString());
						// StringBuilder sbTemp = new StringBuilder(sb2);
						longestStr = sb.toString() + sbTemp.reverse().toString();
						longestSize = longestStr.length();
					}
					break;
				}
				sb.append(c);
			}
			if (sb.toString().equals(sb2.toString())) {
				if (sb.toString().length() > longestSize) {
					longestStr = sb.toString();
					longestSize = longestStr.length();
				}
			}
		}
		System.out.println("length:" + s.length() + ", count:" + cnt);
		return longestStr;
	}

	public String longestPalindrome2(String s) {
		if (s == null || s.length() == 0)
			return "";

		char[] s2 = addBoundaries(s.toCharArray());
		int[] p = new int[s2.length];
		int c = 0, r = 0; // Here the first element in s2 has been processed.
		int m = 0, n = 0; // The walking indices to compare if two elements are
							// the same
		for (int i = 1; i < s2.length; i++) {
			if (i > r) {
				p[i] = 0;
				m = i - 1;
				n = i + 1;
			} else {
				int i2 = c * 2 - i;
				if (p[i2] < (r - i)) {
					p[i] = p[i2];
					m = -1; // This signals bypassing the while loop below.
				} else {
					p[i] = r - i;
					n = r + 1;
					m = i * 2 - n;
				}
			}
			while (m >= 0 && n < s2.length && s2[m] == s2[n]) {
				p[i]++;
				m--;
				n++;
			}
			if ((i + p[i]) > r) {
				c = i;
				r = i + p[i];
			}
		}
		int len = 0;
		c = 0;
		for (int i = 1; i < s2.length; i++) {
			if (len < p[i]) {
				len = p[i];
				c = i;
			}
		}
		char[] ss = Arrays.copyOfRange(s2, c - len, c + len + 1);
		return String.valueOf(removeBoundaries(ss));
	}

	private static char[] addBoundaries(char[] cs) {
		if (cs == null || cs.length == 0)
			return "||".toCharArray();

		char[] cs2 = new char[cs.length * 2 + 1];
		for (int i = 0; i < (cs2.length - 1); i = i + 2) {
			cs2[i] = '|';
			cs2[i + 1] = cs[i / 2];
		}
		cs2[cs2.length - 1] = '|';
		return cs2;
	}

	private static char[] removeBoundaries(char[] cs) {
		if (cs == null || cs.length < 3)
			return "".toCharArray();

		char[] cs2 = new char[(cs.length - 1) / 2];
		for (int i = 0; i < cs2.length; i++) {
			cs2[i] = cs[i * 2 + 1];
		}
		return cs2;
	}
}
