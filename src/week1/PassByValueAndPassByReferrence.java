package week1;

import java.util.Arrays;

public class PassByValueAndPassByReferrence {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		change(arr);  
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	private static void change(int[] arr) {
		
      arr[0]= 10; // original of 'arr'
	}
	
	
	
	
	
	
	
	
	
	//	public static void main(String[] args) {
//		int a = 1000;
//		increament(a);
//		System.out.println(a);
//	}
//
//	private static void increament(int a) {
//		a++; // copy of 'a'
//		System.out.println(a);
//	}
}
