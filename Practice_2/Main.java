package com.exercise02.andy;

public class Main {

	public static int[] twoSum(int[] nums, int target) {
		int[] array = new int[2];
		int pavot = nums.length;
		boolean flag = false;

		for (int j = 0; j < pavot; j++) {
			int temp = target - nums[j];
			for (int i = j + 1; i < pavot; i++) {
				if (nums[i] == temp) {
					array[0] = j;
					array[1] = i;
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}
		if (!flag)
			array = null;

		return array;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int target = 6;

		int[] result = twoSum(nums, target);

		try {
			System.out.println(result[0]);
			System.out.println(result[1]);
		} catch (Exception e) {
			System.out.println("Could not find any pair in the array!");
		}

	}

}
