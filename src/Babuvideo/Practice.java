package Babuvideo;

import org.junit.Test;

public class Practice {
	
	/*
	 * Given the input int array, find the sum of any two distinct indices of the meeting 
	 * given the target
	 */

//	
//	@Test
//	public void example1() {
//		int[] nums = {2,7,11,15};
//		int target = 9;
//		twoSum_BruteForce(nums, target);
//
//	}
	
	@Test
	public void example2() {
		int[] nums = {2,2,3,1,4,0,5};
		int target = 5;
		twoSum_BruteForce(nums, target);
	}
	
//	@Test
//	public void example3() {
//		int[] nums = {2,2,3,1,4,0,5};
//		int target = 45;
//		twoSum_BruteForce(nums, target);
//	}
	
	/*
	 * Brute force !!
	 * Psuedo code here:
	 * 1) Take the input array
	 * 2) Traverse every element using for loop
	 * 3) Add with next element with the outer loop
	 * 4) Compare the sum with the target
	 *     a) if it matches, store them in list !!
	 *     b) if doesn't match, continue
	 * 5) finally return the list !!    
	 */
	
	
	private void twoSum_BruteForce(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {  // O(n)
			for (int j = i+1; j < nums.length; j++) {  // O(n)    O(n2)
				if (nums[i]+nums[j] == target) { // O(1)
					System.out.println(i+","+j); // O(1)
				}
			}
			
		}
		
	}
}
