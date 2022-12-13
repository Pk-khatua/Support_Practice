package com.antra.practice;

public class Programm18 {
	private static void candies(int stu,int can) {
		int[] arr=new int[stu];
		int j=0;
		while(can>0) {
			for(int i=0;i<stu;i++) {
				j++;
				if(can<=0) {
					break;
				}
				else {
					if(j<can) {
						arr[i]=arr[i]+j;
					}
					else {
						arr[i]=arr[i]+can;
					}
					can=can-j;
				}
			}
		}
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		int stu=3;
		int can=10;
		Programm18.candies(stu, can);
	}

}
