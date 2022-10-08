package com.codingbat.recursion1;

/**
 * https://codingbat.com/prob/p173469
 */
public class Array220 {
	public static void main(String[] args) {
		Array220 o = new Array220();
		int[] nums = { 3 };
		System.out.println(o.array220(nums, 0));
	}

	public boolean array220(int[] nums, int index) {
		if (nums.length == 0 || index == nums.length - 1) return false;
		int num = nums[index];
		int numNext = nums[index + 1];
		if (num * 10 == numNext) return true;
		else return array220(nums, index + 1);
	}
}
