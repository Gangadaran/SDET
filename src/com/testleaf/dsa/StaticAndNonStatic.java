package com.testleaf.dsa;

public class StaticAndNonStatic {

	String brand;
	int price;
	static String name;
	
	static {
		name = "Phone";
	}
	
	StaticAndNonStatic(){
		brand = "Apple";
		price = 234;
	}
	
	
	public static void main(String[] args) {
		StaticAndNonStatic obj = new StaticAndNonStatic();
		String brand2 = obj.brand;
        System.out.println(brand2);
	}
}
