package week3;

import java.util.HashMap;

import org.junit.Test;

public class DynamicSlidingWindowWithHash {
	
	/*
	 * Given an array with +ve and -ve nos, 
	 * print the consecutive elements that add up to a given sum
	 */
	
	@Test
	public void example() {
		int[] nums = {10,15,-5,15,-10,5};
		int sums = 5;
        solve(nums,sums);
	}
	
	private void solve(int[] ar, int k) {
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    int sum = 0;
	    for (int i = 0; i < ar.length; i++) {
	        sum += ar[i];
	        if (hm.containsKey(sum - k)) {
	            System.out.println(hm.get(sum - k) + "  " + (i - 1));
	            break;
	        }
	        hm.put(sum, i);
	    }
	}


	}


