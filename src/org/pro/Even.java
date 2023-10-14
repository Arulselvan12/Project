package org.pro;

public class Even {
	
	public static void main(String[] args) {
		
		int count=0,count1=0;
		int sum=0,sum1=0;
		int total=0,total1=0;
		
		for (int i = 0; i <= 100; i++) {
			if(i%2==0) {
				count++;
				sum=sum+i;
				total=sum/count;
			}
			else {
				count1++;
				sum1=sum1+i;
				total1=sum1/count1;
			}
		}
		System.out.println("Count of even="+count);
		System.out.println("Sum of even="+sum);
		System.out.println("Total of even="+total);
		System.out.println();
		System.out.println("Count of odd="+count1);
		System.out.println("Sum of odd="+sum1);
		System.out.println("Total of odd="+total1);
	}

}
