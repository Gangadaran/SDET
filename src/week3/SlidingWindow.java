package week3;

import org.junit.Test;

public class SlidingWindow {
	
	@Test
	public void example() {
		int[] nums = {1,5,2,3,7,1};
		
		int k = 3;
		SlidingWindow(nums,k); 

	}

	

	private void SlidingWindow(int[] nums, int k) {
		int maxSum =0, windowSum =0;
		for (int i = 0; i <k; i++) {
			windowSum += nums[i];
		}
		  
		  maxSum = windowSum;
		  
		  for (int i = k; i < nums.length; i++) {
			windowSum = windowSum - nums[i-k] + nums[i];
			maxSum = Math.max(maxSum, windowSum);
		}
		  
		  System.out.println(maxSum);
		
	}



	


}
