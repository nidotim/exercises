package edu.nidotim.exercise.leetcode;

import java.util.Arrays;
import java.util.List;

public class longestSubstring {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("aab", "abcabccc", "abcabcbb", "a", "", "aa", "abeqzs");
		for(String str : strList){
			int maxLength = lengthOfLongestSubstring(str);
			System.err.println("word:" + str + ", length:" + maxLength);
		}
		

	}

	public static int lengthOfLongestSubstring(String s) {
		StringBuilder sb = new StringBuilder();
		int maxLength = 0;
		if (s.length() < 2) {
			return s.length();
		}
		for (int i = 0; i < s.length(); i++) {
			if (i + sb.length() + 1 > s.length() - 1) {
				sb.append(s.substring(i));
				break;
			}
			sb.append(s.charAt(i));
			String compareStr = s.substring(i + 1, i + sb.length() + 1);
			// System.err.println("compareStr:" + compareStr + ", sb:" +
			// sb.toString());
			if (sb.toString().equals(compareStr)) {
				if (maxLength < sb.toString().length()) {
					maxLength = sb.toString().length();
				}
				// i = i + sb.length();
				sb.setLength(0);
			}
		}

		// System.err.println(sb.toString());
		return Math.max(maxLength, sb.toString().length());
	}
}
