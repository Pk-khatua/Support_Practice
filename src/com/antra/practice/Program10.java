package com.antra.practice;

public class Program10 {
	private static void chkAdl(int num) {
		int x=num;
		int rem=0;
		int rev=0;
		int numsc=0;
		int revsc=0;
		int rem1=0;
		int rev1=0;
		while(x>0) {
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		numsc=num*num;
		revsc=rev*rev;
		while(revsc>0) {
			rem1=revsc%10;
			rev1=rev1*10+rem1;
			revsc=revsc/10;
		}
		if(numsc==rev1) {
			System.out.println("it is a addal number");
		}
		else {
		System.out.println("it is not a addalnumber");
		}
	}
	public static void main(String[] args) {
		int input=14;
		Program10.chkAdl(input);
	}

}
