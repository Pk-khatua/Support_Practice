package com.antra.practice;

public class Programm14 {
	private static void order(String s) {
		String str="";
		String str1="";
		String str2="";
		String str3="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				str=str+ch[i];
			}
			else if(Character.isLowerCase(ch[i])) {
				str1=str1+ch[i];
			}
			else if(Character.isDigit(ch[i])) {
				str2=str2+ch[i];
			}
			else {
				str3=str3+ch[i];
			}
		}
		System.out.println(str+str1+str2+str3);
	}
	public static void main(String[] args) {
		String str="A1BDef=.,25A3G";
		Programm14.order(str);
	}

}
