package week3;



import org.junit.Test;

public class BubbleSort {
	
	@Test
	public void example() {
		int[] nums = {11,4,17,18,2,1,8};
		
		sortThis(nums);

	}

	private void sortThis(int[] nums) {
		

		for (int i = 0; i < nums.length - 1; i++) {
			
		    for (int j = 0; j < nums.length-i - 1; j++) {
		        if (nums[j] > nums[j + 1]) {
		           
		            int temp = nums[j];
		            nums[j] = nums[j + 1];
		            nums[j + 1] = temp;
		        }
		    }
		}

		
		System.out.print("Sorted Array: ");
		for (int i = 0; i < nums.length; i++) {
		    System.out.print(nums[i] + " ");
		}

		
	}
	
	
	
	/*
	 * for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ")
    }
    
    
    System.out.println();
	 */

}
