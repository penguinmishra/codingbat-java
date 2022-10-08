package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p183174
 */
public class NestParen {
	public static void main(String[] args) {
		NestParen o = new NestParen();
		System.out.println(o.nestParen("((()))"));
	}

	public boolean nestParen(String str) {
		return nestParen(str, 0, str.length() - 1);
	}

	private boolean nestParen(String str, int i, int j) {
		if (i > j) return true;
		return str.charAt(i) == '(' && str.charAt(j) == ')' && nestParen(str, i + 1, j - 1);
	}
}
