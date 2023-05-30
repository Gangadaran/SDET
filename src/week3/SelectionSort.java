package week3;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	@Test
	public void example() {
		int[] nums = {11,4,17,18,2,22,8};
        System.out.println(Arrays.toString(sortThis1(nums)));
	}

	private int[] sortThis(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
			
		}
		return nums;
		
	}
	
	// 11,4,17,18,2,22,8
	
	private int[] sortThis1(int[] nums) {
		for(int i=0; i <nums.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
       return nums;
	}
	
	

}
