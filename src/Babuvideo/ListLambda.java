package Babuvideo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ListLambda {
	@Test
	public void listExamples() {
		List<String> names = new ArrayList<>();
		names.add("Ganga");
		names.add("Ganga1");
		names.add("Ganga2");
		names.add("Ganga3");
		names.add("Ganga4");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).length() > 3) {
				count++;
			}
		}
       System.out.println(count);
	}
	
	@Test
	public void listExample1() {
		List<String> names = Arrays.asList("Ganga","Ganga1","Ganga2","Ganga3","Ganga4");
		long count = names.stream().filter(firstNames -> firstNames.length()  > 3).count();
		System.out.println(count);

	}
	
	@Test
	public void findUniqueCount() {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,9,9);
//		long count = list.stream().distinct().count();
//		System.out.println(count);
		
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
