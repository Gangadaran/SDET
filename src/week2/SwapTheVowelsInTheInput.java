package week2;

import org.junit.Test;

public class SwapTheVowelsInTheInput {
	@Test
	public void example() {
		String input = "Hello Everyone! Welcome to Testleaf";
        System.out.println(swapTheVowels(input));
         
	}

	/* pseudocode:
	 * convert string to charArray
	 * stop the loop when left is greater than right
	 * declare left with 0 and right variable with s.length-1
	 * compare left value with right if both vowel then swap and then left increment and right decrement
	 * if left is vowel and right is not vowel then decrement the right
	 * else if right is vowel and left is not vowel then increment the left
	 * return the string or character
	 */
	
	
	
	
	private String swapTheVowels(String input) {
		char[] arr = input.toCharArray();
		
		int left =0, right =arr.length-1;
		while (left < right) {
			if (isVowel(arr[left])&& isVowel(arr[right])) {
			   char temp = arr[left];
			   arr[left] = arr[right];
			   arr[right] = temp;
			   left++;
			   right--;
			} else if(!isVowel(arr[left])) {
				left++;
			} else if(!isVowel(arr[right])) {
				right--;
			}
		}
		
		return new String(arr);
		
	}
	
	
	
	
	private boolean isVowel(char c) {
		if (c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U') {
			return true;
		}
       return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
