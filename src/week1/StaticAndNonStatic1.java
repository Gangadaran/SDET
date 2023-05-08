package week1;

public class StaticAndNonStatic1 {
	
	/*
	 * Can we use non-static variable inside static method directly?
	 * 
	 * No, we cannot use non-static variables directly inside a static method in
	 * Java.
	 * 
	 * This is because non-static variables belong to an instance of a class, and a
	 * static method does not belong to any instance of the class. Instead, a static
	 * method belongs to the class itself.
	 * 
	 * If you want to use a non-static variable inside a static method, you need to
	 * create an instance of the class and access the non-static variable through
	 * that instance.
	 * 
	 *
	 */
	
	
	/* where will store static method in java Heap memory or stack memory?
	 * 
	 * In Java, static methods are stored in the PermGen (Permanent Generation)
	 * space, which is a part of the heap memory.
	 * 
	 * The PermGen space is a non-heap memory area that is used to store the class
	 * definitions, interned strings, and other metadata related to the classes
	 * loaded by the Java Virtual Machine (JVM).
	 * 
	 * When a Java program is run, the JVM loads the classes into the PermGen space,
	 * which includes static methods along with other class-level data. Once loaded,
	 * the static methods can be called without the need to create an instance of
	 * the class.
	 * 
	 * It's worth noting that the PermGen space was removed in Java 8 and replaced
	 * with a new memory area called Metaspace. However, the concept of where static
	 * methods are stored remains the same - in a part of the heap memory dedicated
	 * to storing class-level data.
	 */
	
	
	
	static String name = "Ganga";
	int num = 24;
	
	public void sample() {
		System.out.println(name +":"+ num);

	}
	private static void sample1() {
		System.out.println(name);

	}
	
	public static void main(String[] args) {
		
		StaticAndNonStatic1 obj =     new StaticAndNonStatic1();
		obj.sample();
		String name2 = obj.name;
		System.out.println(name);
		StaticAndNonStatic1 obj1 =     new StaticAndNonStatic1();
		
		obj1.name = "";
		System.out.println(name);
		
		
		
	}

}
