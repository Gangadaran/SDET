package Babuvideo;



public class BigO {
	
	public static void printItem(int n) {
		
		for (int i = 0; i <n; i++) {  // O(n)  // linear time
			System.out.println(i);
		}
		
		for (int j = 0; j <n; j++) {    //O(n)
			System.out.println(j);
		}
		
		// O(n)+O(n) = O(2n) can be simplified to  O(n)
	}
	
	public static void printItem1(int n) {
		for (int i = 0; i < n; i++) {   // O(n)
			for (int j = 0; j < n; j++) { // O(n)
				System.out.println(i+":"+j);
			}
		}
		// O(n)*O(n) = O(n^2)    // quadratic time 
	}
	
	public static void printItem2(int n) {
		for (int i = 0; i < n; i++) {   // O(n)
			for (int j = 0; j < n; j++) { // O(n)
				for (int k = 0; k < n; k++) { // o(n)
					System.out.println(i+":"+j+":"+k);
				}
			}
		}
		// O(n)*O(n)*(n) = O(n^3) can be simplified to  O(n^2) (doesn't matter if it's n^4,n^5,n^10)
	}
	public static void printItem3(int n) {   //drop non - dominants
		for (int i = 0; i < n; i++) {   // O(n^2)
			for (int j = 0; j < n; j++) { 
				System.out.println(i+":"+j);
			}
		}
		
		for (int k = 0; k < n; k++) { //O(n)
			System.out.println(k);
		}
		// O(n^2)+O(n) =O(n^2 + n) can be simplified to O(n^2)
	}
	
	public static int addItem(int n) {
		int a = n+n;   // O(1)   this is good one when compare to the others
		System.out.println(a);
		return a;

	}
	
	public void log() {
		// int[] arr = {1}          {2}        {3,4}          {5,6,7,8};
		
		//log2 8 =3;
		

	}

	public static void main(String[] args) {
		//printItem(10);
		//printItem1(10);
		//printItem2(10);
		printItem3(10);
		//addItem(10000);
	}
	
}
