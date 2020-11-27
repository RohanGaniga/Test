package com.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Anagram {
/*TEST*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String first = scan.next();
		String second = scan.next();
		Stack<Character> stk = new Stack<>();
		Stack<Character> stk2 = new Stack<>();
		int count = 0;
		char[] firstStr = first.toCharArray();
		char[] secondStr = second.toCharArray();
		List<Character> lst = new ArrayList<>();
		char gg[] = new char[first.length()];
		char gg2[] = new char[second.length()];
		List<Character> lst2 = new ArrayList<>();
		/*if(first.length()!=second.length()){
			System.out.println("No");
			System.exit(0);
		}*/
		for(int i = 0; i<firstStr.length ; i++){
			lst.add(firstStr[i]);
		}
		for(int i = 0; i<secondStr.length ; i++){
			lst2.add(secondStr[i]);
		}
		Collections.sort(lst);
		Collections.sort(lst2);
		for(int i = lst.size()-1; i>=0; i--){
			stk.push(lst.get(i));
		}
		for(int i = lst2.size()-1; i>=0; i--){
			stk2.push(lst2.get(i));
		}
		int k = 0;
		int p = 0;
		while(true){
			if(stk.size()!= 0 && stk2.size()!=0){
				if(stk.peek() == stk2.peek()){
					stk.pop();
					stk2.pop();
				}
				else if(stk.peek() < stk2.peek()){
					gg[k++] = stk.pop();
				}
				else if(stk.peek() > stk2.peek()){
					gg2[p++] = stk2.pop();
				}
				continue;
			}
			if(stk.isEmpty() && !stk2.isEmpty()){
				while(!stk2.isEmpty()){
					if(!stk2.isEmpty()){
						gg2[p++] =stk2.pop();
					}
				}
				continue;
			}
			if(stk2.isEmpty() && !stk.isEmpty()){
				while(!stk.isEmpty()){
					if(!stk.isEmpty()){
						gg[k++] =stk.pop();
					}
				}
				continue;
			}
			if(stk2.isEmpty() && stk.isEmpty()){
				break;
			}
		}
		System.out.print("From first string remove : ");
		for(char o : gg){
			if(o==' '){
			}
			else{
				count++;
				System.out.print(o);
			}
		}
		System.out.println();
		System.out.print("From second string remove : ");
		for(char o : gg2){
			if(o==' '){
			}
			else{
				count++;
				System.out.print(o );
			}
		}
		System.out.println(count);
		scan.close();
	}
}
