package com.antra.practice;

import java.util.HashMap;
import java.util.Map;


public class Programm12 {
	private static void rmvkey() {
		Map<Character,Integer> x=new HashMap<>();
		x.put('a',10);
		x.put('b',20);
		x.put('c',30);
//		System.out.println(x);
		int temp=30;
		char c=' ';
		for(Map.Entry<Character,Integer> mp:x.entrySet()) {
			if(mp.getValue()==temp) {
				 c=mp.getKey();	
			}	
		}
		x.remove(c);
		System.out.println(x);
		}
   public static void main(String[] args) {
	   Programm12.rmvkey();
	
}

}
