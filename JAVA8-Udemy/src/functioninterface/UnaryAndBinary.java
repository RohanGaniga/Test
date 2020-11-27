package functioninterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinary {
	//Same as Function if both i/p and o/p are of same datatype
	static UnaryOperator<String> uc = (stu) -> {return stu.toUpperCase();};
	//Same as BiFunction if both i/p(2) and o/p are of same datatype
	static BinaryOperator<String> uclc = (stu1,stu2) -> {return stu1.concat(stu2.toUpperCase());};
	
	static Comparator<Integer> comp = (one,two) -> {return one.compareTo(two); };
	
	public static void main(String[] args) {

		System.out.println(uc.apply("HEllO"));
		
		System.out.println(uclc.apply("HEllO","ELLOe"));
		
		BinaryOperator<Integer> max = BinaryOperator.maxBy(comp);
		System.out.println(max.apply(10, 20));
		
		BinaryOperator<Integer> min = BinaryOperator.minBy(comp);
		System.out.println(min.apply(10, 20));
		
	}
}
