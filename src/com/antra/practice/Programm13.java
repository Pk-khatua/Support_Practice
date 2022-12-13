package com.antra.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Programm13 {
	private static void maxvl() {
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		mp.put('a',90);
		mp.put('b',60);
		mp.put('c',20);
		mp.put('d',30);
		mp.put('f',95);
		int max=Collections.max(mp.values());
		char c=' ';
		for(Map.Entry<Character,Integer> entry:mp.entrySet()) {
			if(entry.getValue()==max) {
				c=entry.getKey();
			}
		}
		System.out.println(c+"="+max);
	}
	public static void main(String[] args) {
		Programm13.maxvl();
	}

}
