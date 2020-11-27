package com.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		char[] sarr = s.toCharArray();
		Stack<Character> stk = new Stack();
		
		List<Character> ls = new ArrayList<>();
		for(char c : sarr){
			ls.add(c);
		}
		char[] dup = new char[ls.size()];
		int i = 0;
		Collections.sort(ls);
		
		for(char cc : ls){
			dup[i++] = cc;
			
		}
		i = 0;
		
		for(int j =0 ; j<ls.size(); j++){
				if(stk.contains(dup[j])){
					stk.pop();
				}
				else{
					
					stk.push(dup[j]);
				}
		}
		if(stk.size()>1){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
	}
}
