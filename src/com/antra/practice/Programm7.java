package com.antra.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Programm7 {
	private static void chksndHst(int[] arr) {
		Map<Integer,Integer> m=new HashMap<>();
		int x=0;
		int y=0;
	  for(int i=0;i<arr.length;i++) {
		  x=arr[i];
		  m.put(x,x);  
	  }
	  int max=Collections.max(m.values());
	 for(Map.Entry<Integer,Integer> mp:m.entrySet()) {
		 if(max==mp.getValue()) {
			 m.remove(mp.getKey());
		 }
	 }
	 y=Collections.max(m.keySet());
	 System.out.println(y);
	}
	public static void main(String[] args) {
		int [] arr= {5,8,7,6,2,9,1};
		Programm7.chksndHst(arr);
	}

}
