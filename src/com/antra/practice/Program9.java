package com.antra.practice;
//from 11-31
public class Program9 {
	private static void chkAdl(int num) {
		int x=num;
		int y=x%10;
		int rem=x/10;
		int z=y*10+rem;
		int a=x*x;
		int b=z*z;
		int c=a%10;
		int rem1=a/10;
		int d=rem1%10;
		int rem2=rem1/10;
		int e=c*100+d*10+rem2;
		if(e==b) {
			System.out.println("it is a addal number");
		}
		else {
			System.out.println("it is not a addal number");
		}
		System.out.println(c);
		System.out.println(rem1);
		System.out.println(d);
		System.out.println(rem2);
		System.out.println(e);
		System.out.println(y);
		System.out.println(rem);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		int input=12;
		Program9.chkAdl(input);
	}


}
