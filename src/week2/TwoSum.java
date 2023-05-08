package week2;

import org.junit.Test;

public class TwoSum {
	@Test
	public void example() {
		int[] nums = {-3,2,3,3,6,8,5};
		int k = 6;
		System.out.println(findTwoSum(nums, k));

	}

	private String findTwoSum(int[] nums, int k) {
		int left =0, right =nums.length-1;
		while (left < right) {
			if (nums[left] + nums[right]==k) {
				return left +":"+ right;
			}else if(nums[left] + nums[right] > k) {
				right--;
			}else if(nums[left] + nums[right] < k) {
				left++;
			}
		}
		return "No valid pair found";
	}

}
