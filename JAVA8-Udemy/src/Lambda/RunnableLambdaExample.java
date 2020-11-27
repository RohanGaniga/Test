package Lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		Runnable runn = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("LEgacy way");
				
			}
		};
		
		Runnable r = () -> System.out.println("Lambda way");
		
		Thread t = new Thread(runn);
		t.start();
		Thread t1 = new Thread(r);
		t1.start();

	}

}
