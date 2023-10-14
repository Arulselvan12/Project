package org.pro;

public class Stringg {
	
	public static void main(String[] args) {
		
		String s= "welcome to my class";
		String[] split = s.split(" ");
		for (int i = split.length-1; i >= 0; i--) {
			System.out.println(split[i]+"");
		}
		
		
	}

}
