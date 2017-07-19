package com.exercise02.andy;

/*The brute force approach is simple. Loop through each element x and find if there is another value that equals to target−xtarget.
Complexity Analysis

Time complexity : O(n^2). For each element, we try to find its complement by looping through the rest of array which takes O(n) time. Therefore, the time complexity is O(n2)O(n^2)O(n​2​​).

Space complexity : O(1).
*/

public class Solution_1 {
	
	public static int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int target = 8;

		int[] result = twoSum(nums, target);
		
		try {
			System.out.println(result[0]);
			System.out.println(result[1]);
		} catch (Exception e) {
			System.out.println("Could not find any pair in the array!");
		}

	}

	}


