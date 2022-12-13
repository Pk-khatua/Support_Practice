package com.antra.practice;

import java.util.HashMap;
import java.util.Map;

public class Programm15 {
	private static void rptstr(String str) {
		String[] str1=str.split(" ");
		Map<String,Integer> smap=new HashMap<>();
		for(String s:str1) {
			if(smap.containsKey(s)) {
				smap.put(s,smap.get(s)+1);
			}
			else {
				smap.put(s,1);
			}
		}
		System.out.println(smap);	
	}
	public static void main(String[] args) {
		String str="hii how are hii hello";
		Programm15.rptstr(str);
	}

}
