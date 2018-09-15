package com.java.algorithm;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=4;
		boolean b=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				b=true;
				break;
			}
		}
		if(b==true) {
			System.out.println("Not prime");
		}else {
			System.out.println("Prime");
		}
	}
}
