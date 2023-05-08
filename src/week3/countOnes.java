package week3;

public class countOnes {
	
	/*
	 * 2 Index (left at 0 and right at length-1)
Conditions for the problems
Find the mid => (left + right) / 2 (and divide into half)
If mid is the point where we see the 1st one
calculate the length from mid to arr.length as number of 1s
If mid=0, left = mid+1
If mid = 1, right = mid-1
	 */
	
	
	public void example() {
		int[] nums = {0,0,0,1,1,1,1};
		findTheNOfOne(nums); 

	}

	private void findTheNOfOne(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		int mid = (left+right)/2;
		
		
	}

}
