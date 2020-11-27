package First;

import java.util.stream.IntStream;

public class SumOfInt {

	public static void main(String[] args) {
		
		
		int sum = 0;
		for(int i = 0; i<=100 ; i++) {
			sum+=i;
		}
		
		System.out.println("Imperative approach : "+sum);
		
		int sum1 = IntStream.rangeClosed(0, 100)
				.sum();
		
		System.out.println("Declarative appraoch : "+sum1);
		
	}

}
