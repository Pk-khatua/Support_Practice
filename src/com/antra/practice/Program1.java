package com.antra.practice;

import java.util.Scanner;

public class Program1 {
	private static int operator(char[] ch) {
		char x = ' ';
		if (ch.length == 0) {
			System.out.println("Input is empty");
		} else {
			for (int i = 0; i < ch.length; i++) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ' ' || ch[j] == ' ') {
						System.out.println("you are puting whitespace in the place of charecter");
					} else if (ch[i] < ch[j]) {
						x = ch[i];
						ch[i] = ch[j];
						ch[j] = x;
					}
				}
			}
		}
		String y = String.valueOf(ch);
		int z = Integer.parseInt(y);
		return z;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put a charecter array but charecter as number");
//		char[] ch = sc.next().toCharArray();
		char [] ch= {'7','9','3','9','5','8'};
		System.out.println(Program1.operator(ch));
		sc.close();
	}

}
