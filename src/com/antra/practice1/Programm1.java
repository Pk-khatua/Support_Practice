package com.antra.practice1;

public class Programm1 {
	public static void palindrome(StringBuilder str) {
		if(str.reverse().toString().equals(str.toString())) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("aakaa");
		palindrome(str);
				
	}

}
