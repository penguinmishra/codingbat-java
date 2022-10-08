package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p163932
 */
public class SumDigits {
	public static void main(String[] args) {
		SumDigits o = new SumDigits();
		System.out.println(o.sumDigits(126));
	}

	public int sumDigits(int n) {
		if (n == 0) return 0;
		return n % 10 + sumDigits(n / 10);
	}

}
