package com.nt;

public class Test {
	public static void main(String[] args) {
		String s="prnk79";
		String s1=s.substring(3, s.length());
		System.out.println(s1);
		int n=Integer.parseInt(s1);
		System.out.println(n);
		int k=n;
		int r;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
		int r1;
		int sum1=0;
		while(sum>0) {
			r1=sum%10;
			sum1=sum1+r1;
			sum=sum/10;
		}
		System.out.println(sum1);
		
	}
	//spring.dataSourse.driver-class-name=

}
