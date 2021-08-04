package edu.nidotim.exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] twoSumIndex = new int[2];
		Map<Integer, Integer> valueIndexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (valueIndexMap.containsKey(target - nums[i])) {
				twoSumIndex[0] = valueIndexMap.get(target - nums[i]);
				twoSumIndex[1] = i;
				return twoSumIndex;
			}
			valueIndexMap.put(nums[i], i);
		}
		return twoSumIndex;
	}
}
