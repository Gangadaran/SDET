package day1;

import java.util.HashMap;

import org.junit.Test;

public class FindAnagrams {
	
	@Test
	public void example1() {
		String s = "cbaebabacd";
		String p = "abc";
		findAllAnagrams(s,p);
	}

	@Test
	public void example2() {
		String s = "cb";
		String p = "abc";
		findAllAnagrams(s,p);
	}
	
	@Test
	public void example3() {
		String s = "cbd";
		String p = "abc";
		findAllAnagrams(s,p);
	}
	/**
	 * Algorithm: Sliding Window with Hash
	 * 
	 * Psuedocode
	 * 
	 * 1) Create HashMap for s, p
	 * 2) Iterate the p String once to fill the map !!
	 * 3) Iterate the s String for the length of p
	 *    a) Get the characters and fill the map
	 *    b) Remove the first character and add the new character
	 * 4) compare the both maps and prints if it matches    
	 * 
	 * 
	 */
	
	private void findAllAnagrams(String s, String p) {
		int sLength = s.length(), pLength = p.length() ;
		if(pLength > sLength ) {
			new RuntimeException("Given Input is wrong");
		}
		HashMap<Character, Integer> pMap = new HashMap<Character,Integer>();
		HashMap<Character, Integer> sMap = new HashMap<Character,Integer>();
		
		for (int i = 0; i < pLength; i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
		}
	}

}
