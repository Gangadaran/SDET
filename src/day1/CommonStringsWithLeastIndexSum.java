package day1;

import java.util.*;

public class CommonStringsWithLeastIndexSum {
    public static String[] findCommonStringsWithLeastIndexSum(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>(); // stores the index of each string in list1
        List<String> commonStrings = new ArrayList<>(); // stores the common strings
        
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }  
        
        int leastIndexSum = Integer.MAX_VALUE; // the minimum i + j among all common strings
        for (int j = 0; j < list2.length; j++) {
            String str = list2[j];
            if (map.containsKey(str)) { // str is a common string
                int indexSum = map.get(str) + j;
                if (indexSum < leastIndexSum) { // found a new common string with smaller i + j
                    commonStrings.clear(); // remove all previous common strings
                    commonStrings.add(str);
                    leastIndexSum = indexSum;
                } else if (indexSum == leastIndexSum) { // found another common string with the same i + j
                    commonStrings.add(str);
                }
            }
        }
        
        String[] result = new String[commonStrings.size()];
        return commonStrings.toArray(result);
    }
    
    public static void main(String[] args) {   // 1 + 0 = 1;  3+1 = 4; 
        String[] list1 = {"apple", "orange", "banana", "kiwi"};
        String[] list2 = {"orange", "kiwi", "watermelon", "grapefruit"};
        String[] commonStrings = findCommonStringsWithLeastIndexSum(list1, list2);
        System.out.println(Arrays.toString(commonStrings));
    }
}

