package edu.nidotim.exercise.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMedianSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length + nums2.length == 0) {
			return 0;
		}


		int index1 = 0;
		int index2 = 0;
		int chosenNum;
		if ((nums1.length + nums2.length) % 2 == 0) {
			int medianIndex = ((nums1.length + nums2.length) / 2) - 1;
			for (int i = 0; i < nums1.length + nums2.length; i++) {
				if (index1 >= nums1.length) {
					chosenNum = nums2[index2];
					index2++;
				} else if (index2 >= nums2.length) {
					chosenNum = nums1[index1];
					index1++;
				} else if (nums1[index1] <= nums2[index2]) {
					chosenNum = nums1[index1];
					index1++;
				} else {
					chosenNum = nums2[index2];
					index2++;
				}

				if (i == medianIndex) {
					int chosenNum2 = 0;
					;
					if (index1 >= nums1.length) {
						chosenNum2 = nums2[index2];
					} else if (index2 >= nums2.length) {
						chosenNum2 = nums1[index1];
					} else if (nums1[index1] <= nums2[index2]) {
						chosenNum2 = nums1[index1];
					} else {
						chosenNum2 = nums2[index2];
					}
					return ((double) (chosenNum + chosenNum2)) / 2;
				}
			}
		} else {
			int medianIndex = (nums1.length + nums2.length - 1) / 2;
			for (int i = 0; i < nums1.length + nums2.length; i++) {
				if (index1 >= nums1.length) {
					chosenNum = nums2[index2];
					index2++;
				} else if (index2 >= nums2.length) {
					chosenNum = nums1[index1];
					index1++;
				} else if (nums1[index1] <= nums2[index2]) {
					chosenNum = nums1[index1];
					index1++;
				} else {
					chosenNum = nums2[index2];
					index2++;
				}

				if (i == medianIndex) {
					return chosenNum;
				}
			}
		}
		return 0;
	}
}
