package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p186177
 */
public class StrCount {
	public static void main(String[] args) {
		StrCount o = new StrCount();
		String str = "catcowcat";
		String sub = "dog";
		System.out.println(o.strCount(str, sub));
	}

	public int strCount(String str, String sub) {
		if (str.length() < sub.length()) return 0;
		if (str.substring(0, sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()), sub);
		else return strCount(str.substring(1), sub);
	}
}