package edu.nidotim.exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
	private static Map<Integer, String> thousandConverter;
	private static Map<Integer, String> hundredConverter;
	private static Map<Integer, String> tenthConverter;
	private static Map<Integer, String> digitConverter;
	static  {
		Map<Integer, String> tmp = new HashMap<Integer, String>();
		tmp.put(1, "I");
		tmp.put(2, "II");
		tmp.put(3, "III");
		tmp.put(4, "IV");
		tmp.put(5, "V");
		tmp.put(6, "VI");
		tmp.put(7, "VII");
		tmp.put(8, "VIII");
		tmp.put(9, "IX");
		digitConverter = tmp;

		tmp = new HashMap<Integer, String>();
		tmp.put(1, "X");
		tmp.put(2, "XX");
		tmp.put(3, "XXX");
		tmp.put(4, "XL");
		tmp.put(5, "L");
		tmp.put(6, "LX");
		tmp.put(7, "LXX");
		tmp.put(8, "LXXX");
		tmp.put(9, "XC");
		tenthConverter = tmp;

		tmp = new HashMap<Integer, String>();
		tmp.put(1, "C");
		tmp.put(2, "CC");
		tmp.put(3, "CCC");
		tmp.put(4, "CD");
		tmp.put(5, "D");
		tmp.put(6, "DC");
		tmp.put(7, "DCC");
		tmp.put(8, "DCCC");
		tmp.put(9, "CM");
		hundredConverter = tmp;

		tmp = new HashMap<Integer, String>();
		tmp.put(1, "M");
		tmp.put(2, "MM");
		tmp.put(3, "MMM");
		thousandConverter = tmp;
	};

	public String intToRoman(int num) {
		int thousand = num / 1000;
		StringBuffer sb = new StringBuffer();
		if (thousand >= 1) {
			sb.append(thousandConverter.get(thousand));
		}

		int hundred = num % 1000 / 100;
		if (hundred >= 1) {
			sb.append(hundredConverter.get(hundred));
		}

		int ten = num % 100 / 10;
		if (ten >= 1) {
			sb.append(tenthConverter.get(ten));
		}

		int digit = num % 10;
		if (digit >= 1) {
			sb.append(digitConverter.get(digit));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.err.println(3652 % 1000 / 100);
		IntegerToRoman itm = new IntegerToRoman();
		long sTime = System.currentTimeMillis();
		for (int i = 1; i < 3999; i++) {
			itm.intToRoman(i);
		}
		long eTime = System.currentTimeMillis();
		System.err.println("Time spent:" + (eTime - sTime));

	}

}
