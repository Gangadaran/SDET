package week2;

public class FindTheFraction {
/*
 * For positive Numbers:
 *Find the fraction
 *Say number is = 47
 *number %16 = 15 which is F
 *number = number/16 - 2 (Repeat till number is > 0)
 *output - 2F
 */
	
	public static void main(String[] args) {
	
		int n = 47;
		
		while(n > 0) {
			n = n %16;
		}
		
		System.out.println(n);
		
		
		
}
}
