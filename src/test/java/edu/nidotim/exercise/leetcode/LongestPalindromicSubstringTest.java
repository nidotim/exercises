package edu.nidotim.exercise.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class LongestPalindromicSubstringTest {

	private static LongestPalindromicSubstring lps;

	private static String actual;

	private static String expected;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
		lps = new LongestPalindromicSubstring();
	}

	@Test
	public void test() {
		String s = "abba";
		actual = lps.longestPalindrome(s);
		expected = "abba";
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void test2() {
		String s = "absba";
		actual = lps.longestPalindrome(s);
		expected = "absba";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		String s = "abeadbapelq";
		actual = lps.longestPalindrome(s);
		expected = "abba";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test4() {
		String s = "anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqubirkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnhpnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkznqxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlrupvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulhobyhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvabthpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysfujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzlazuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwnbsdonucaipoafavmlrrlplnnbsaghbawooabsjndqnvruuwvllpvvhuepmqtprgktnwxmflmmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwimuizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukpvosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasiwmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg";
		actual = lps.longestPalindrome2(s);
		System.out.println(actual);
	}

}
