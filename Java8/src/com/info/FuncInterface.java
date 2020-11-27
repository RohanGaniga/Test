package com.info;

@FunctionalInterface
interface B{
	void somethingElse();
}

@FunctionalInterface
interface A extends B{
	
	abstract int something(Object a);
	default void somethingElse(){
		System.out.println("hello");
	}
	//abstract String toString();
	
}

public class FuncInterface {

}
