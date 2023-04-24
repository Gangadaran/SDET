package com.testleaf.dsa;

public class StackAndHeap {

	int num = 5;   // instance variable
    
	static String  name = "Ganga";
	
	public int add(int n1, int n2) {
		return n1 + n2;  // local variable

	}

	public static void main(String[] args) {
		
		int data = 10;
		
		StackAndHeap obj = new StackAndHeap(); // object of StackAndHeap class
		System.out.println(obj.num);
		
		int r1 = obj.add(3, 4);
		
		StackAndHeap obj1 = new StackAndHeap();
		obj1.num = 6;
		System.out.println(obj1.num);
	}
}
