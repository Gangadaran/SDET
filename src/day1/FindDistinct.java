package day1;

import org.junit.jupiter.api.Test;

public class FindDistinct {
	
	private static int a;


	@Test // +ve
	public void example1() {
		int [] nums = {1,2,3,4,4,4,5};
		countDistinct(nums);
	}
	
	
	public static void countDistinct(int[] nums) {
	 for(int i = 0; i < nums.length-1 ; i++) {
	      if(nums[i] != nums[i+1]) {
	    	  System.out.println(nums[i]);
	    	  
	      }
	        
	    }
	 
	 a = nums[nums.length-1];
	 System.out.println(a);
	  
	}
	
	
	
	
	


}
