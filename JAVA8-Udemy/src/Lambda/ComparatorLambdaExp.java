package Lambda;

import java.util.Comparator;

public class ComparatorLambdaExp {
	
	public static void main(String[] args) {
		
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			};
		};
		
		System.out.println("Old way :"+comp.compare(3234234, 512));
		
		Comparator<Integer> comp1 = (Integer i , Integer k) -> {return i.compareTo(k);};
		System.out.println("New way :"+comp1.compare(323434,512));
		
		Comparator<Integer> comp2 = (i , k) -> i.compareTo(k);
		System.out.println("New way2 :"+comp2.compare(32343, 152));
		
	}

}
