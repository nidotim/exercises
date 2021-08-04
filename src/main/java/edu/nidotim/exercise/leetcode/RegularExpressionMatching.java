package edu.nidotim.exercise.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
		// p = p.replace(".",).replace("*", "*");
		System.out.println(p);
		Pattern ptn = Pattern.compile(p);
		Matcher mtn = ptn.matcher(s);
		return mtn.matches();
	}
}
