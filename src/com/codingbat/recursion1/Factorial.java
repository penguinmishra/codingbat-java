package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p154669
 */
public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

	public static int factorial(int n) {
		int[] mem = new int[n + 1];
		return factorial(n, mem);
	}

	private static int factorial(int n, int[] mem) {
		if (n < 3) return n;
		if (mem[n] != 0) return mem[n];
		return mem[n] = n * factorial(n - 1, mem);
	}
}
