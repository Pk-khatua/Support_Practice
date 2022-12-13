package com.antra.practice;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
	
	public static void operator(String s) {
		List<Character> lst=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				lst.add(' ');
				break;
			}
			lst.add(s.charAt(i));
			
			continue;
		}
		System.out.println(lst);
	}
	public static void main(String[] args) {
		String s="Hello Good Day";
		Program5.operator(s);
	}

}
