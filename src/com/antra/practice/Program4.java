package com.antra.practice;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
	private static void operator(int[] arr) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					if (arr[j] != arr[j - 1]) {
						break;
					}
					temp++;
					i++;
				}

			}
			m.put(arr[i], temp);
		}
////		int z=Collection
//		Object z=m.keySet().toArray()[0];
//		Object c=m.values().toArray()[0];
//		System.out.println(z+"="+c);
		Map.Entry<Integer, Integer> w = null;
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if (w == null || entry.getValue() > w.getValue()) {
				w = entry;
			}
		}
		System.out.println(w);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 2, 2, 3, 3, 2, 2, 2 };
		Program4.operator(arr);
	}

}
