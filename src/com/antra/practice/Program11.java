package com.antra.practice;

public class Program11 {
	private static void chksndHst(int[] arr) {
		int x=arr[0];
		int y=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				y=x;
				x=arr[i];
			}
		}
		System.out.println(y);
	}
	public static void main(String[] args) {
		int [] arr= {5,8,7,6,2,9,1};
		Program11.chksndHst(arr);
	}

}
