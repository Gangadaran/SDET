package week2;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class ReplaceAllDots {
	@Test
	public void example() {
		String nums = "1.1.1.1.1";
        System.out.println(replaceAllDots1(nums));
	}

	//Using String
	private String replaceAllDots(String nums) {
		char[] charArray = nums.toCharArray();
         
		String output = "";
		for (int i = 0; i <= charArray.length-1; i++) {
			if (charArray[i]==charArray[1]) {
				output += "[.]";
			} else {
				output += "1";
			}
		}
		return output;
	}
	// Using StringBuilder
	private String replaceAllDots1(String nums) {
		char[] charArray = nums.toCharArray();
         
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= charArray.length-1; i++) {
			if (charArray[i]==charArray[1]) {
				sb.append("[.]");
			} else {
				sb.append("1");
			}
		}
		return sb.toString();
	}

}
