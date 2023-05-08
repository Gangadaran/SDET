package week3;

import java.util.Arrays;

import org.junit.Test;

public class MergeTwoSortedArray {
	@Test
	public void example() {
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,8};
		
		mergeTwoArray(arr1,arr2);

	}

	private void mergeTwoArray(int[] arr1, int[] arr2) {
		

		int[] temp = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
		    if (arr1[i] <= arr2[j]) {
		        temp[k] = arr1[i];
		        i++;
		    } else {
		        temp[k] = arr2[j];
		        j++;
		    }
		    k++;
		}

		while (i < arr1.length) {
		    temp[k] = arr1[i];
		    i++;
		    k++;
		}

		while (j < arr2.length) {
		    temp[k] = arr2[j];
		    j++;
		    k++;
		}

		// Print the merged array
		System.out.println(Arrays.toString(temp));
		
	}

	


}
