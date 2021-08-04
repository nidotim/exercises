package edu.nidotim.exercise.leetcode;

public class ReverseInteger {
	public int reverse(int x) {
		String intStr = String.valueOf(x);
		StringBuffer sb = new StringBuffer();
		sb.append(intStr);
		sb.reverse();
		if (sb.charAt(sb.length() - 1) == '-') {
			sb.insert(0, '-');
			sb.deleteCharAt(sb.length() - 1);
		}
		try {
			return Integer.valueOf(sb.toString());
		} catch (Exception e) {
			return 0;
		}
	}
}
