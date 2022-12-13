package com.antra.practice;

public class Programm8 {
	private static void chkAdl(int num) {
		String x=Integer.toString(num);
		String y="";
		int z=0;
		for(int i=0;i<x.length();i++) {
			y=x.charAt(i)+y;
		}
		z=Integer.parseInt(y);
		int temp=num*num;
		int temp1=z*z;
		String str=Integer.toString(temp1);
		String str1="";
		for(int i=0;i<str.length();i++) {
			str1=str.charAt(i)+str1;
		}
		int temp2=Integer.parseInt(str1);
		if(temp==temp2) {
			System.out.println("it is a addel number");
		}
		else {
			System.out.println("it is not a addel number");
		}
		
	}
	public static void main(String[] args) {
		int input=13;
		Programm8.chkAdl(input);
	}

}
