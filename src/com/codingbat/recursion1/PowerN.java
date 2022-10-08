package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p158888
 */
public class PowerN {
	public static void main(String[] args) {
		PowerN o = new PowerN();
		System.out.println(o.powerN(2, 5));
	}

	public int powerN(int base, int n) {
		if (base == 1) return 1;
		if (n == 1) return base;
		return base * powerN(base, n - 1);
	}
}
