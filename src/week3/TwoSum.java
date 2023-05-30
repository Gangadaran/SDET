package week3;

import java.util.Arrays;

import org.junit.Test;

public class TwoSum {
	
	/*
	 * 1. Two Sum
     * https://leetcode.com/problems/two-sum/
	 */

	@Test
	public void example() {
	  int[] nums = {3,2,3};
	  int target = 6;
	  System.out.println(Arrays.toString(findTheIndicies1(nums, target)));

	}
   // Using two pointer algorithm
	private int[] findTheIndicies(int[] nums, int target) {
		int left =0, right = nums.length-1;
        
        
        while(left < right){
            if(nums[left]+nums[right]==target){
               
              return new int[] {left,right};
            } else if(nums[left]+nums[right] > target){
                 right--;
            } else{
                left++;
            }
        }

        return new int[] {};
		
	}
	
	
	//Using brute force  // 3,2,3
	private int[] findTheIndicies1(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				} 
			}
		}
     return new int[] {};
	}
}
