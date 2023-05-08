package week1;

import java.util.Arrays;

public class NoToInsert {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,7};
		int noToInsert = 6;
		
		int[] op = new int[nums.length+1];
		int i = 0;
		for (; i < nums.length; i++) {
			if (nums[i] < noToInsert) {
				op[i] = nums[i];
			} else {
				op[i] = noToInsert;
				
				for (; i < nums.length; i++) {
					op[i+1] = nums[i];
					
				};
			}
		}
		
		
		
		for (int i1 = 0; i1 < op.length; i1++) {
			System.out.println(op[i1]);
		}
		
//		for (int k : op) {
//			System.out.println(op[k]);
//		}
		
		
//	System.out.println(Arrays.toString(op));
		
		
		 
	}
	
   

}
