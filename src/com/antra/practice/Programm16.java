package com.antra.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Programm16 {
	private static void xyz() {
		HashMap<Integer, Character> map = new HashMap<>();
		map.put(10, 'A');
		map.put(20, 'B');
		map.put(30, 'C');
//		System.out.println(map);
		Iterator<Entry<Integer,Character>> iterator=map.entrySet().iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getKey().equals(30))
			{
				iterator.remove();
				System.out.println(map);
			}
		}
	}
	public static void main(String[] args) {
		Programm16.xyz();
	}

}
