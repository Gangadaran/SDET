package day1;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Given two arrays of strings list1 and list2, find the common strings with the least index sum.


A common string is a string that appeared in both list1 and list2.

A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] 
then i + j should be the minimum value among all the other common strings.

Return all the common strings with the least index sum. Return the answer in any order.
 * 
 *
 */

public class Solution1 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap<>(); 
        List<String> list=new ArrayList<>();
        int sum=Integer.MAX_VALUE;  
        for(int i=0;i<list1.length;i++) map.put(list1[i],i);
        for(int i=0;i<list2.length;i++){
            Integer k=map.get(list2[i]);
            if(k!=null && k+i<sum ){
                list.clear();
                sum=k+i;
                list.add(list2[i]);
            }
            else if(k!=null && k+i<=sum){
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] commonStrings = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(commonStrings));
    }
}
