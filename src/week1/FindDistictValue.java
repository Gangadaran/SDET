package week1;

import org.junit.jupiter.api.Test;

public class FindDistictValue {

	@Test // +ve
	public void example1() {
		int [] nums = {1,2,3,4,4,4,5};
		countDistinct(nums);
		System.out.println("---------------------------------------------------");
	}
	
	
	
	@Test // edge
	public void example2() {
		int [] nums = {1};
		countDistinct(nums);
		System.out.println("---------------------------------------------------");
	}
	@Test // negative
	public void example3() {
		int [] nums = null;
		countDistinct(nums);
		System.out.println("---------------------------------------------------");
	}
	
	
	public static void countDistinct(int[] nums) {
		
		if(nums==null) {
			System.out.println("given array is  null");
		}
		
	 for(int i = 0; i < nums.length-1 ; i++) {
	      if(nums[i] != nums[i+1]) {
	    	  System.out.println(nums[i]);
	    	  
	      }
	        
	    }
	 
	
	 System.out.println(nums[nums.length-1]);
	  
	}
}
