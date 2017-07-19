package com.exercise02.andy;

/*
 *  === One-pass Hash Table ===
 *  
 * It turns out we can do it in one-pass. While we iterate and inserting elements into the table, we also look back to check if current element's complement already exists in the table. If it exists, we have found a solution and return immediately.
Complexity Analysis:

    Time complexity : O(n). We traverse the list containing n elements only once. Each look up in the table costs only O(1) time.

    Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most n elements.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
	
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
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
