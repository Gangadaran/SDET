package week2;

import org.junit.Test;

public class ReverseEachWordInString
 {

	@Test
	public void example() {
		String input = "Welcome To Testleaf";
		System.out.println(reverseEachWord(input));
       // output: emocleW oT faeltseT
	}

	private String reverseEachWord(String input) {
		String[] s = input.split(" ");
		for (int i = 0; i < s.length; i++) {
			char[] arr = s[i].toCharArray();
			int left = 0, right = arr.length - 1;
			while (left < right) {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			s[i] = new String(arr);

		}
		
		return String.join(" ", s);
		
		
	}

	
}
