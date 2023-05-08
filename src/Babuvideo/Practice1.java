package Babuvideo;

import org.junit.Test;

public class Practice1 {

	/*
	 * given array, find the sum of any two indices of the matching given the target
	 */
	@Test
	public void example1() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		twoSum_TwoPointer(nums, target);

	}

	@Test
	public void example2() {
		int[] nums = { 1, 2, 2, 3, 4, 6, 7 };
		int target = 9;
	}

	@Test
	public void example3() {
		int[] nums = { 1, 2, 2, 4, 6, 8 };
		int target = 9;
	}

	/*
	 * Two pointer Algo 1) Left -> 0 index , Right -> Last index 2) Loop through
	 * until the left is smaller than right index a) sum both left index value with
	 * right index 1) sum = K --> you got it !! --> return left, right 2) sum < k
	 * --> increment left 3) sum > k --> decrement right
	 * 
	 * Note: Solution works only when numbers are sorted !!
	 * 
	 */

	private void twoSum_TwoPointer(int[] nums, int k) {
		int left = 0, right = nums.length - 1;
		boolean bFound = false;
		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum==k) {
			 System.out.println(left+","+right);
			 bFound = true;
			 break;
			}else if(sum<k) {
				left++;
			}else if(sum>k) {
				right--;
			}
		}
	}

}
