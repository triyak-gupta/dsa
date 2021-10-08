//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Return k
 */

public class RemoveDuplicatesInplace {
	public int removeDuplicates(int[] a) {
		int k = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				a[k++] = a[i];
			}
		}
		return k;
	}
}
