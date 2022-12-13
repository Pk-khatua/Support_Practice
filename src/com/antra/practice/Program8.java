package com.antra.practice;

public class Program8 {
	

		private static void secHigh(int[] arr) {
			int max = 0;
			int secHigh = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}

			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < max) {
					secHigh = arr[i];
				}
			}

			System.out.println(secHigh);
		}

		public static void main(String[] args) {
			int[] array =  {5,8,7,6,2,9,1};
			Program8.secHigh(array);

		}

	}

