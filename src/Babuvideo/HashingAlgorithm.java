 package Babuvideo;

public class HashingAlgorithm {

	/**
	 * List: - Interface - Implementation classes: ArrayList, LinkedList 
	 * - Characteristics: Single dimensional, Allows duplicate value, Maintain the insertion order
	 * - Default order: Last Insertion order means will add it end of the array 
	 * - Add (O(1))  -  amortized constant time
	 * - Remove (O(n)) 
	 * - Search (O(n)) 
	 * - Get (O(1))
	 * - Insert O(n)
	 * 
	 * Example : in web driver findElements will return list webelement in arraylist format because it maintain the insertion order.
	 * 
	 * 
	 * 
	 * Set - Interface - Implementation classes: TreeSet, HashSet, LinkedHashSet 
	 * -TreeSet uses Comparator Algorithm (compare the ASCII value and accordingly order) Example : A-Z: 65-90 a-z: 97-122
	 * - TreeSet (O(nlogn)) 
	 * - HashSet uses Hashing Algorithm(hashcode)
	 * - HashSet was (O(n)-->O(logn)) 
	 *  
	 *  Set is actually a Map with value as null !!
	 * 
	 * 
	 *
	 * 
	 * Map - Interface 
	 * - Implementation classes: TreeMap, HashMap, LinkedHashMap
	 * 
	 * Methods: - Add entry (key, value) to a HashMap :: put(k,v) 
	 * - Remove entry :: remove(k) - Find whether the key exists in the HashMap :: contains(k)
	 *  - Count of entry : size() - (1.8) getOrDefault
	 * --> get(k) --> returns the value of key !! --> getOrDefault(k) --> if key
	 * exits --> it returns the value else it returns the default value
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/**
	 *  what is linked list?
	 *   A linked list is a sequential list of nodes that hold data which point to other nodes also containing data
	 *   in doubly linked list if previous is null that's head, whereas next is null that's tail.
	 *
	 */

	

	private int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();
		for (int i = 0; i < keyChars.length; i++) {
			int asciiValue = keyChars[i];
			hash = (hash + asciiValue * 23);// % dataMap.length; (0 -> 6)
			System.out.println(hash);
		}

		return hash;
	}

	public static void main(String[] args) {
		HashingAlgorithm obj = new HashingAlgorithm();
		obj.hash("Gangadaran");
	}
	
	
	
	
	
	
	
	
	
	
	/* What's Data structures?
	 * 
	 * Data structures are ways of organizing and storing data in a computer program, 
	 * 
	 * why?
	 * 
	 * so that it can be accessed and manipulated efficiently. 
	 * 
	 * Use?
	 * 
	 * In other words, data structures provide a way of managing and organizing data,  
	 * so that it can be easily searched, sorted, and manipulated
	 */
	
	
	/*
	 * An algorithm is a set of instructions or rules that are followed in order to solve a problem or complete a task. 
	 * It is a step-by-step procedure for performing a specific task or calculation. 
	 * Algorithms can be represented in many different ways, including flowcharts, pseudocode, and programming code.
	 * 
	 * In computer science, algorithms are used to solve a wide range of problems, such as sorting data, 
	 * searching for information, and processing images or other types of data. Some common examples of algorithms include:

Sorting algorithms: These algorithms are used to put a list of data items in a specific order, 
such as alphabetical order or numerical order.
Search algorithms: These algorithms are used to find a specific item or piece of information within a larger set of data.
Graph algorithms: These algorithms are used to analyze relationships between different data points, 
such as in social networks or computer networks.
Optimization algorithms: These algorithms are used to find the best solution to a particular problem, 
such as minimizing the cost of a manufacturing process.
	 * 
	 */

}
