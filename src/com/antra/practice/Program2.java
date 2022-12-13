package com.antra.practice;

//import java.util.Scanner;

public class Program2 {
	public static void operator(int[] arr) {
		int x = 0;
		if (arr.length == 0) {
			System.out.println("No Input");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			int temp = 1;
			for (int l = k + 1; l < arr.length; l++) {
				if (arr[k] == arr[l] && k < arr.length - 1) {
					temp++;
					k++;
				}
			}
			System.out.println(arr[k] + "=" + temp);
		}
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("put a integer array");
		int[] arr = { 1, 1, 2, 3, 1, 2, 2, 4, 3 };
		Program2.operator(arr);
	}

}
