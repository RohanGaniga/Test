package First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupes {

	public static void main(String[] args) {
		int a =10,b = 11,c,d,e,f,g;
		System.out.println(a);
		System.out.println(b);
		String s,h;
		List<Integer> intList = Arrays.asList(1,2,2,3,4,5,6,6,7,8,9);
		List<Integer> updList = new ArrayList<Integer>();
		for(Integer i : intList) {
			if(!updList.contains(i)) {
				updList.add(i);
			}
		}
		
		System.out.println("Imperitive: "+ updList);
		List<Integer> m = new ArrayList<>(),k = new ArrayList<>(),l = new ArrayList<>();
		System.out.println(k);
		List<Integer> updList2 = intList.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("Declaritive: "+ updList2);
		
	}

}
