package paralleStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;


public class PerformanceParrelel {
	
	public static void repeat(Supplier<Integer> ok ,int n) {
		long curr = System.currentTimeMillis();
		for(int i = 0 ; i<n ; i++) {
			ok.get();
		}
		System.out.println((System.currentTimeMillis() - curr));
	}
	public static int streamOnly() {
		int sum = IntStream.rangeClosed(0, 100000)
		.sum();
		return sum;
	}
	public static int parallelStream() {
		int sum = IntStream.rangeClosed(0, 100000)
		.parallel()
		.sum();
		return sum;
	}

	public static void main(String[] args) {
		
		PerformanceParrelel.repeat(PerformanceParrelel::parallelStream,20);
		PerformanceParrelel.repeat(PerformanceParrelel::streamOnly,20);
		
		
	}


}
