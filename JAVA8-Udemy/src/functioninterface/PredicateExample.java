package functioninterface;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> c1 = student -> student%2==0;
	static Predicate<Integer> c2 = student -> student%5==0;
	
	public static void main(String[] args) {
		
		System.out.println(c1.test(5));
		System.out.println(c1.test(10));
		
		System.out.println(c1.and(c2).test(10));
		
		System.out.println(c1.or(c2).test(7));

	}

}
