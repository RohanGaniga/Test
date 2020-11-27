package functioninterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	//takes no input returns op
	static Supplier<Student> st = () -> {return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));};
	
	static Supplier<List<Student>> st1 = () -> {return StudentDataBase.getAllStudents();};
	
	public static void main(String[] args) {
		System.out.println(st.get());
		
		System.out.println(st1.get());

	}

}
