package com.java.algorithm;

public class FindDuolicateElimentInArray {
	public static void main(String[] args) {
		int []a= {1,3,2,4,6,7,6,9,5,2};
		for(int i=0;i+1<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate :"+a[j]);
				}
			}
		}
	}
}
