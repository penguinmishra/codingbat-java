package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p194781
 */
public class Triangle {
	public static void main(String[] args) {
		Triangle o = new Triangle();
		System.out.println(o.triangle(10));
	}

	public int triangle(int rows) {
		if (rows == 0) return 0;
		return rows + triangle(rows - 1);
	}

}
