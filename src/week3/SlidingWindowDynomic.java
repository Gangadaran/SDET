package week3;

import org.junit.Test;

public class SlidingWindowDynomic {
	/*
	 * Given an array of positive integers, 
	 * find the subarrays that adds up to the given number (k)
	 */
	@Test
	public void example() {
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 7;
		findTheSubArray(nums, k);

	}

	
	
	private void findTheSubArray(int[] nums, int k) {
		int left =0, sum =0;
		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];
			while(sum > k) {
				sum -=nums[left++]; 
			}
			if(sum == k) {
				
				System.out.println(left +", "+ right);
			
			}
		}

		
 
		
	}
	
	
	private void Slide(int[] ar, int k) {
	    int ans = 0;
	    int left = 0;

	    for (int i = 0; i < ar.length; i++) {
	        ans += ar[i];
	        if (ans == k) {
	            System.out.println(left + " - " + i);
	        } else if (ans > k) {
	            ans -= ar[left++];
	        }
	    }
	}

	
	
   
}
