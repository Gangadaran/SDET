package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


/**
 * Given two arrays of strings list1 and list2, find the common strings with the least index sum.


A common string is a string that appeared in both list1 and list2.

A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] 
then i + j should be the minimum value among all the other common strings.

Return all the common strings with the least index sum. Return the answer in any order.
 * 
 *
 */



/**
function findCommonStringsWithLeastIndexSum(list1, list2):
    map = {} // create an empty map to store the index of each string in list1
    commonStrings = [] // create an empty array to store the common strings
    
    // loop through list1 and add each string and its index to the map
    for i = 0 to list1.length - 1:
        map[list1[i]] = i
    
    leastIndexSum = Infinity // initialize the least index sum to infinity
    
    // loop through list2
    for j = 0 to list2.length - 1:
        str = list2[j] // get the current string from list2
        
        // check if the string is in the map
        if str in map:
            indexSum = j + map[str] // calculate the index sum of the current string
            
            // if the index sum is less than the current least index sum, update the array of common strings
            if indexSum < leastIndexSum:
                commonStrings = [str] // create a new array with only the current string
                leastIndexSum = indexSum // update the least index sum
            // if the index sum is equal to the current least index sum, add the current string to the array of common strings
            else if indexSum == leastIndexSum:
                commonStrings.push(str)
                
    return commonStrings // return the array of common strings with the least index sum
*/

  
public class Solution {
	
	
    
	
	public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        int min = 2001;
        List<String> words = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            int idx = map.getOrDefault(list2[i], 2001), sum = idx + i;
            if (min > sum) min = sum;
        }

        for (int i = 0; i < list2.length; i++) {
            int idx = map.getOrDefault(list2[i], 2001), sum = idx + i;
            if (sum == min) words.add(list2[i]);
        }

        return words.toArray(new String[0]);
    }
	
	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] commonStrings = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(commonStrings));
    }

}
