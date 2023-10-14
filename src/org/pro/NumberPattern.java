package org.pro;

public class NumberPattern {
	
	public static void main(String[] args) {
		
		int n=3;
		for (int i = 1; i <= n; i++) {
			for (int s = n; s > i; s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}

