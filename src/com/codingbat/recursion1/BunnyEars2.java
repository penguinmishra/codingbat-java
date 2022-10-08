package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p107330
 */
public class BunnyEars2 {

	public static void main(String[] args) {
		BunnyEars2 o = new BunnyEars2();
		System.out.println(o.bunnyEars2(3));
	}

	public int bunnyEars2(int bunnies) {
		int[] mem = new int[bunnies + 1];
		return bunnyEars2(bunnies, mem);
	}

	private int bunnyEars2(int n, int[] mem) {
		if (n == 0) return 0;
		if (mem[n] != 0) return mem[n];
		return mem[n] = (n % 2 == 0 ? 3 : 2) + bunnyEars2(n - 1, mem);
	}
}
