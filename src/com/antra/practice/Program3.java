package com.antra.practice;

import java.util.Scanner;

public class Program3 {
	private static void operator(String s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose charecter for find frequency");
		char x=sc.next().charAt(0);
		x=Character.toUpperCase(x);
		int temp=0;
		if(x==' ') {
           System.out.println("There ase no white space");			
		}
		for(int i=0;i<s.length();i++) {
			if(x == s.charAt(i)) {
				temp++;
			}		
		}
		System.out.println(x+"="+temp);
		sc.close();
	}
	
	public static void main(String[] args) {
		String s="MISSISIPI";
		Program3.operator(s);
	}
}
